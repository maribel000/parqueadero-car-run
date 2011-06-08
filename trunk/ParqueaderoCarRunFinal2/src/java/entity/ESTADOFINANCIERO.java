

package entity;


import java.sql.ResultSet;

public class ESTADOFINANCIERO extends BasicBean {

        public String   IDESTFINANCIERO           = "";
        public String   NOMBREESTFINANCIERO       = "";
        public String   VALOR                     = "";
        public String   DESCRIPESTFINANCIERO      = "";

        public ESTADOFINANCIERO() {
        }

        public ESTADOFINANCIERO( ResultSet rs ) {
                try {
                        IDESTFINANCIERO           = validateString( rs.getString( "IDESTFINANCIERO" ) );
                        NOMBREESTFINANCIERO       = validateString( rs.getString( "NOMBREESTFINANCIERO" ) );
                        VALOR                     = validateString( rs.getString( "VALOR" ) );
                        DESCRIPESTFINANCIERO      = validateString( rs.getString( "DESCRIPESTFINANCIERO" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into ESTADOFINANCIERO( NOMBREESTFINANCIERO, VALOR, DESCRIPESTFINANCIERO ) values( '" +
                        NOMBREESTFINANCIERO + "', '" +
                        VALOR + "', '" +
                        DESCRIPESTFINANCIERO + "' )";
                } else {
                        sql = "update ESTADOFINANCIERO set NOMBREESTFINANCIERO = '" +
                        NOMBREESTFINANCIERO + "', VALOR= '" +
                        VALOR + "', DESCRIPESTFINANCIERO= '" +
                        DESCRIPESTFINANCIERO + "' where id = '" + id + "'";
                }
           return sql;
        }
   }