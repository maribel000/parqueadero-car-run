

package entity;


import java.sql.ResultSet;

public class TIPOAUTOMOTOR extends BasicBean {

        public String   IDTIPOAUTOMOTOR      = "";
        public String   TIPO                 = "";

        public TIPOAUTOMOTOR() {
        }

        public TIPOAUTOMOTOR( ResultSet rs ) {
                try {
                        IDTIPOAUTOMOTOR      = validateString( rs.getString( "IDTIPOAUTOMOTOR" ) );
                        TIPO                 = validateString( rs.getString( "TIPO" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into TIPOAUTOMOTOR( TIPO ) values( '" +
                        TIPO + "' )";
                } else {
                        sql = "update TIPOAUTOMOTOR set TIPO = '" +
                        TIPO + "' where id = '" + id + "'";
                }
           return sql;
        }
   }