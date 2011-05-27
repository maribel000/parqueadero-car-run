
package entity;

import java.sql.ResultSet;

public class AUTOMOTOR extends BasicBean {

        public String   PLACA                     = "";
        public String   CEDULACLIENTE             = "";
        public String   IDTIPOAUTOMOTOR           = "";
        public String   OBSERVACIONAUTOMOTOR      = "";

        public AUTOMOTOR() {
        }

        public AUTOMOTOR( ResultSet rs ) {
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
                        sql = "insert into AUTOMOTOR( CEDULACLIENTE, IDTIPOAUTOMOTOR, OBSERVACIONAUTOMOTOR ) values( '" +
                        CEDULACLIENTE + "', '" +
                        IDTIPOAUTOMOTOR + "', '" +
                        OBSERVACIONAUTOMOTOR + "' )";
                } else {
                        sql = "update AUTOMOTOR set CEDULACLIENTE = '" +
                        CEDULACLIENTE + "', IDTIPOAUTOMOTOR= '" +
                        IDTIPOAUTOMOTOR + "', OBSERVACIONAUTOMOTOR= '" +
                        OBSERVACIONAUTOMOTOR + "' where id = '" + id + "'";
                }
           return sql;
        }
   }