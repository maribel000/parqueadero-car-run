

package entity;


import java.sql.ResultSet;

public class VIEWTIPOAUTOMOTOR extends BasicBean {

        public String   IDTIPOAUTOMOTOR      = "";
        public String   TIPO                 = "";

        public VIEWTIPOAUTOMOTOR() {
        }

        public VIEWTIPOAUTOMOTOR( ResultSet rs ) {
                try {
                        IDTIPOAUTOMOTOR      = validateString( rs.getString( "IDTIPOAUTOMOTOR" ) );
                        TIPO                 = validateString( rs.getString( "TIPO" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into VIEWTIPOAUTOMOTOR( TIPO ) values( '" +
                        TIPO + "' )";
                } else {
                        sql = "update VIEWTIPOAUTOMOTOR set TIPO = '" +
                        TIPO + "' where id = '" + id + "'";
                }
           return sql;
        }
   }