

package entity;

import java.sql.ResultSet;

public class VIEWREGTRABAJADOR extends BasicBean {

        public String   IDREGTRAB          = "";
        public String   CEDULAUSUARIO      = "";
        public String   DIATRABAJADO       = "";
        public String   HORAINGRESO        = "";
        public String   OBSERVACIONES      = "";

        public VIEWREGTRABAJADOR() {
        }

        public VIEWREGTRABAJADOR( ResultSet rs ) {
                try {
                        IDREGTRAB          = validateString( rs.getString( "IDREGTRAB" ) );
                        CEDULAUSUARIO      = validateString( rs.getString( "CEDULAUSUARIO" ) );
                        DIATRABAJADO       = validateString( rs.getString( "DIATRABAJADO" ) );
                        HORAINGRESO        = validateString( rs.getString( "HORAINGRESO" ) );
                        OBSERVACIONES      = validateString( rs.getString( "OBSERVACIONES" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into VIEWREGTRABAJADOR( CEDULAUSUARIO, DIATRABAJADO, HORAINGRESO, OBSERVACIONES ) values( '" +
                        CEDULAUSUARIO + "', '" +
                        DIATRABAJADO + "', '" +
                        HORAINGRESO + "', '" +
                        OBSERVACIONES + "' )";
                } else {
                        sql = "update VIEWREGTRABAJADOR set CEDULAUSUARIO = '" +
                        CEDULAUSUARIO + "', DIATRABAJADO= '" +
                        DIATRABAJADO + "', HORAINGRESO= '" +
                        HORAINGRESO + "', OBSERVACIONES= '" +
                        OBSERVACIONES + "' where id = '" + id + "'";
                }
           return sql;
        }
   }