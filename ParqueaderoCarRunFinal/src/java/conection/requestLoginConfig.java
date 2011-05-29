
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class requestLoginConfig {

        private static final String m_name = "net.sourceforge.jtds.jdbc.Driver";
        public String m_URL = "";
        public String m_user = "";
        public String m_password = "";

        public Connection m_connection = null;

        public requestLoginConfig(String url, String user, String pass) {
            try {
                Class.forName(m_name);
                System.out.println("Driver successful load");
            } catch (Exception e) {
                System.out.println("No driver found: " + e.toString());
            }
            m_URL = url;
            m_user = user;
            m_password = pass;

            open();
        }

        public void open() {
            try {
                m_connection = DriverManager.getConnection(m_URL, m_user, m_password);
                System.out.println("full connection to: "+m_connection);
            } catch (SQLException e) {
                System.out.println("No Connetion: ");
                System.out.println(e);
                


            }
        }

        public void close() {

        }

 /*public static void main(String[] args) {
 String m_URL = "jdbc:jtds:sqlserver://168.176.36.26:1433";
 String m_user = "rvillabonas";
 String m_password = "s02257370";
 requestLoginConfig con = new requestLoginConfig(m_URL, m_user, m_password);

 }*/

    }
