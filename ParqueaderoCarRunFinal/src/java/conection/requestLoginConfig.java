
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
            } catch (Exception e) {
                System.out.println("not driver found:" + e.toString());
            }
            m_URL = url;
            m_user = user;
            m_password = pass;

            open();
        }

        public void open() {
            try {
                m_connection = DriverManager.getConnection(m_URL, m_user, m_password);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

        public void close() {

        }
    }
