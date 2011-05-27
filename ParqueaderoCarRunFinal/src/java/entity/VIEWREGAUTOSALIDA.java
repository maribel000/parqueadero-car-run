

package entity;

import java.sql.ResultSet;

public class VIEWREGAUTOSALIDA extends BasicBean {

        public String   HORAFECHASALIDA       = "";
        public String   HORAFECHAENTRADA      = "";
        public String   PRECIO                = "";

        public VIEWREGAUTOSALIDA() {
        }

        public VIEWREGAUTOSALIDA( ResultSet rs ) {
                try {
                        HORAFECHASALIDA       = validateString( rs.getString( "HORAFECHASALIDA" ) );
                        HORAFECHAENTRADA      = validateString( rs.getString( "HORAFECHAENTRADA" ) );
                        PRECIO                = validateString( rs.getString( "PRECIO" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into VIEWREGAUTOSALIDA( HORAFECHAENTRADA, PRECIO ) values( '" +
                        HORAFECHAENTRADA + "', '" +
                        PRECIO + "' )";
                } else {
                        sql = "update VIEWREGAUTOSALIDA set HORAFECHAENTRADA = '" +
                        HORAFECHAENTRADA + "', PRECIO= '" +
                        PRECIO + "' where id = '" + id + "'";
                }
           return sql;
        }
   }