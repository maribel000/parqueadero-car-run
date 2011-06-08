

package entity;


import java.sql.ResultSet;

public class VIEWAUTOMOTOR extends BasicBean {

        public String   PLACA                     = "";
        public String   CEDULACLIENTE             = "";
        public String   IDTIPOAUTOMOTOR           = "";
        public String   OBSERVACIONAUTOMOTOR      = "";

        public VIEWAUTOMOTOR() {
        }

        public VIEWAUTOMOTOR( ResultSet rs ) {
                try {
                        PLACA                     = validateString( rs.getString( "PLACA" ) );
                        CEDULACLIENTE             = validateString( rs.getString( "CEDULACLIENTE" ) );
                        IDTIPOAUTOMOTOR           = validateString( rs.getString( "IDTIPOAUTOMOTOR" ) );
                        OBSERVACIONAUTOMOTOR      = validateString( rs.getString( "OBSERVACIONAUTOMOTOR" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into VIEWAUTOMOTOR( CEDULACLIENTE, IDTIPOAUTOMOTOR, OBSERVACIONAUTOMOTOR ) values( '" +
                        CEDULACLIENTE + "', '" +
                        IDTIPOAUTOMOTOR + "', '" +
                        OBSERVACIONAUTOMOTOR + "' )";
                } else {
                        sql = "update VIEWAUTOMOTOR set CEDULACLIENTE = '" +
                        CEDULACLIENTE + "', IDTIPOAUTOMOTOR= '" +
                        IDTIPOAUTOMOTOR + "', OBSERVACIONAUTOMOTOR= '" +
                        OBSERVACIONAUTOMOTOR + "' where id = '" + id + "'";
                }
           return sql;
        }
   }