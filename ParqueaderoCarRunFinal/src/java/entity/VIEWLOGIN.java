
package entity;

import java.sql.ResultSet;

public class VIEWLOGIN extends BasicBean {

        public String   IDLOGIN            = "";
        public String   CEDULAUSUARIO      = "";
        public String   IDROLPARQUEO       = "";
        public String   IDROLADMIN         = "";
        public String   PASSWORD           = "";

        public VIEWLOGIN() {
        }

        public VIEWLOGIN( ResultSet rs ) {
                try {
                        IDLOGIN            = validateString( rs.getString( "IDLOGIN" ) );
                        CEDULAUSUARIO      = validateString( rs.getString( "CEDULAUSUARIO" ) );
                        IDROLPARQUEO       = validateString( rs.getString( "IDROLPARQUEO" ) );
                        IDROLADMIN         = validateString( rs.getString( "IDROLADMIN" ) );
                        PASSWORD           = validateString( rs.getString( "PASSWORD" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into VIEWLOGIN( CEDULAUSUARIO, IDROLPARQUEO, IDROLADMIN, PASSWORD ) values( '" +
                        CEDULAUSUARIO + "', '" +
                        IDROLPARQUEO + "', '" +
                        IDROLADMIN + "', '" +
                        PASSWORD + "' )";
                } else {
                        sql = "update VIEWLOGIN set CEDULAUSUARIO = '" +
                        CEDULAUSUARIO + "', IDROLPARQUEO= '" +
                        IDROLPARQUEO + "', IDROLADMIN= '" +
                        IDROLADMIN + "', PASSWORD= '" +
                        PASSWORD + "' where id = '" + id + "'";
                }
           return sql;
        }
   }