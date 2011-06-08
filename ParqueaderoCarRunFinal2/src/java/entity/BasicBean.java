package entity;

import java.io.Serializable;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BasicBean implements Serializable {

    public String id = "";
    protected static SimpleDateFormat m_df = new SimpleDateFormat("yyyy-MM-dd");
    protected static DecimalFormat m_nf = new DecimalFormat("#,###");
    protected static DecimalFormat m_lff = new DecimalFormat( "#,###.##" );
    protected static DecimalFormat m_2ff = new DecimalFormat( "#,###.###" );

    public BasicBean() {
    }

    public String getHtmlRow() {
        return "<td>not implemented</td>";
    }

    protected void addObject(ArrayList v, ResultSet rs) {

    }

    public String validateDate(String sz) {
        if (sz == null || sz.equals("0000-00-00")) {
            sz = "";
        } else {
            sz = sz.substring(0, 10);
        }

        return sz;
    }

    public String validateString(String sz) {
        if (sz == null) {
            sz = "";
        } else {
            sz = sz.trim();
        }

        return sz;
    }

    public String validateNull(String sz) {
        if (sz == null || sz.equals("")) {
            sz = "null";
        } else {
            sz = "'" + sz.trim() + "'";
        }

        return sz;
    }

    public String getUpdateSql() {
        return "select * from Proyecto";
    }
    
    public String getIdentifier() {
        return "id=" + id;
    }
}