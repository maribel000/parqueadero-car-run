

package entity;

import java.sql.ResultSet;

public class REGAUTOMOTORENTRADA extends BasicBean {

        public String   HORAFECHAENTRADA        = "";
        public String   PLACA                   = "";
        public String   OBSERVACIONENTRADA      = "";

        public REGAUTOMOTORENTRADA() {
        }

        public REGAUTOMOTORENTRADA( ResultSet rs ) {
                try {
                        HORAFECHAENTRADA        = validateString( rs.getString( "HORAFECHAENTRADA" ) );
                        PLACA                   = validateString( rs.getString( "PLACA" ) );
                        OBSERVACIONENTRADA      = validateString( rs.getString( "OBSERVACIONENTRADA" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into REGAUTOMOTORENTRADA( PLACA, OBSERVACIONENTRADA ) values( '" +
                        PLACA + "', '" +
                        OBSERVACIONENTRADA + "' )";
                } else {
                        sql = "update REGAUTOMOTORENTRADA set PLACA = '" +
                        PLACA + "', OBSERVACIONENTRADA= '" +
                        OBSERVACIONENTRADA + "' where id = '" + id + "'";
                }
           return sql;
        }
   }