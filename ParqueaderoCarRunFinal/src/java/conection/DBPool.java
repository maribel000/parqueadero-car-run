

package conection;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBPool {

    public static DBPool pool = new DBPool();
    protected ArrayList<requestLoginConfig> m_lstConnections = new ArrayList<requestLoginConfig>();


    public DBPool() {
    }

    public static void setConnections(ArrayList<requestLoginConfig> lst) {
        if (pool.m_lstConnections.isEmpty()) {
            pool.m_lstConnections = lst;
        }
    }

    public static Connection getConnection(int index) {
        try {
            String host = "168.176.36.26:1433";
            String usr = "";
            String psw = "";
            pool.m_lstConnections.add(new requestLoginConfig("jdbc:jtds:sqlserver://"+host, usr, psw));
            requestLoginConfig it = pool.m_lstConnections.get(index);
            if (it.m_connection == null || it.m_connection.isClosed()) {
                it.open();
            }
            return it.m_connection;
        } catch (SQLException ex) {
            Logger.getLogger(DBPool.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getConnection(index);
    }

    public synchronized static ResultSet executeQuery(int index, String sql) {
        ResultSet rs = null;
        try {
            Connection c = DBPool.getConnection(index);
            Statement stm = c.createStatement();
            stm.execute("SET CHARACTER SET utf8");
            stm.execute("SET NAMES utf8");
            rs = stm.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Pool: " + e);
            rs = null;
        }
        return rs;
    }

    public static void close(int index) {
        requestLoginConfig it = pool.m_lstConnections.get(index);
        it.close();
    }

   /* public static void main(String[] args) {
DBPool con = new DBPool();
con.getConnection(0);

}*/

}









