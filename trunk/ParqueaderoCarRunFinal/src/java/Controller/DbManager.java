package Controller;


import java.sql.*;
import java.util.ArrayList;
import entity.BasicBean;
import conection.DBPool;
import java.util.GregorianCalendar;

public class DbManager {

    private String m_szTable = "";
    protected int m_nConnection = 0;
    protected String m_titles[] = {"CODIGO", "DESCRIPCION"};

    protected DbManager(String table) {
        m_szTable = table;
    }

    protected synchronized void addObject(ArrayList v, ResultSet rs) {
    }

    public synchronized ArrayList getList(String name, String id) {
        return executeQuery("select * from " + m_szTable + " where " + name + "='" + id + "' order by nombre");
    }

    public synchronized ArrayList getList(String name, String id, String orderBy) {
        return executeQuery("select * from " + m_szTable + " where " + name + "='" + id + "' order by " + orderBy);
    }

    protected synchronized ArrayList executeQuery(String sz) {
        ArrayList v = new ArrayList();
        Connection con = DBPool.getConnection(m_nConnection);
        try {
            Statement stm = con.createStatement();
           //stm.execute("SET CHARACTER SET utf8");
           //stm.execute("SET NAMES utf8");
            ResultSet rs = stm.executeQuery(sz);
            while (rs.next()) {
                addObject(v, rs);
            }
        } catch (Exception e) {
            System.out.println("-------------------ERROR---------------------");
            System.out.println("SQL: " + sz);
            System.out.println("Exception: " + e);
        }
        DBPool.close(m_nConnection);
        return v;
    }

    @SuppressWarnings("unchecked")
    public synchronized String[] getIdColumn(String sql) {
        ArrayList v = new ArrayList();
        Connection con = DBPool.getConnection(m_nConnection);
        try {
            Statement stm = con.createStatement();
            stm.execute("SET CHARACTER SET utf8");
            stm.execute("SET NAMES utf8");
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                v.add(rs.getString(1));
            }

            rs.close();
            stm.close();
        } catch (Exception e) {
            System.out.println("-------------------ERROR---------------------");
            System.out.println("SQL: " + sql);
            System.out.println("Exception: " + e);
        }

        String sz[] = new String[v.size()];

        for (int i = 0; i < v.size(); i++) {
            sz[i] = v.get(i).toString();
        }
        DBPool.close(m_nConnection);
        return sz;
    }

    public synchronized void execute(String sz) {
        Connection con = DBPool.getConnection(m_nConnection);
        try {
            Statement stm = con.createStatement();
            stm.execute("SET CHARACTER SET utf8");
            stm.execute("SET NAMES utf8");
            stm.execute(sz);
        } catch (Exception e) {
            System.out.println("-------------------ERROR---------------------");
            System.out.println("SQL: " + sz);
            System.out.println("Exception: " + e);
        }
        DBPool.close(m_nConnection);
    }

    public synchronized void execute(String szTry, String szCatch) {
        Connection con = DBPool.getConnection(m_nConnection);
        try {
            Statement stm = con.createStatement();
            stm.execute("SET CHARACTER SET utf8");
            stm.execute("SET NAMES utf8");
            stm.execute(szTry);
        } catch (Exception e) {
            try {
                Statement stm = con.createStatement();
                stm.execute("SET CHARACTER SET utf8");
                stm.execute("SET NAMES utf8");
                stm.execute(szCatch);
            } catch (Exception ez) {
                System.out.println("-------------------ERROR---------------------");
                System.out.println("SQL: " + szCatch);
                System.out.println("Exception: " + ez);
            }
        }
        DBPool.close(m_nConnection);
    }

    public synchronized String validateDate(String sz) {
        if (sz == null || sz.equals("0000-00-00")) {
            sz = "";
        } else {
            sz = sz.substring(0, 10);
        }

        return sz;
    }

    public synchronized String validateString(String sz) {
        return trimString(sz).toUpperCase();
    }

    public synchronized String revalidateString(String sz) {
        return trimString(sz);
    }

    public synchronized String normalize(String sz) {
        sz = trimString(sz);
        return sz;
    }

    public synchronized String trimString(String sz) {
        if (sz == null) {
            sz = "";
        } else {
            sz = sz.trim();
        }

        return sz;
    }

    protected BasicBean getBean() {
        return new BasicBean();
    }

    public synchronized void delete(String id) {
        execute("delete from " + m_szTable + " where id = '" + id + "'");
    }

    public synchronized void save(BasicBean bean) {
        execute(bean.getUpdateSql());
    }

    public synchronized BasicBean getItem(String id) {
        ArrayList lst = executeQuery("select * from " + m_szTable + " where id='" + id + "' ");
        if (lst.size() > 0) {
            return (BasicBean) lst.get(0);
        }
        return getBean();
    }

    public String validNull(String sz) {
        if (sz != null) {
            return "'" + sz + "'";
        }

        return "null";
    }

    public String validDateNull(String sz) {
        if (sz == null || sz.isEmpty()) {
            return "null";
        }
        return "'" + sz + "'";
    }

    public static String today() {
        GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance();
        int mes = gc.get(GregorianCalendar.MONTH) + 1;
        int dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
        return gc.get(GregorianCalendar.YEAR) + "-" + (mes < 10 ? "0" : "") + mes + "-" + (dia < 10 ? "0" : "") + dia;
    }

    public static DbManager getInstance() {
        return null;
    }    
}
