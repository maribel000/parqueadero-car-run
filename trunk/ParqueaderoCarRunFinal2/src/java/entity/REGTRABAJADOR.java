package entity;

import java.sql.ResultSet;

public class REGTRABAJADOR extends BasicBean {

        public String   IDREGTRAB          = "";
        public String   CEDULAUSUARIO      = "";
        public String   DIATRABAJADO       = "";
        public String   HORAINGRESO        = "";
        public String   OBSERVACIONES      = "";

        public REGTRABAJADOR() {
        }

        public REGTRABAJADOR( ResultSet rs ) {
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
                        sql = "insert into REGTRABAJADOR( CEDULAUSUARIO, DIATRABAJADO, HORAINGRESO, OBSERVACIONES ) values( '" +
                        CEDULAUSUARIO + "', '" +
                        DIATRABAJADO + "', '" +
                        HORAINGRESO + "', '" +
                        OBSERVACIONES + "' )";
                } else {
                        sql = "update REGTRABAJADOR set CEDULAUSUARIO = '" +
                        CEDULAUSUARIO + "', DIATRABAJADO= '" +
                        DIATRABAJADO + "', HORAINGRESO= '" +
                        HORAINGRESO + "', OBSERVACIONES= '" +
                        OBSERVACIONES + "' where id = '" + id + "'";
                }
           return sql;
        }
   }