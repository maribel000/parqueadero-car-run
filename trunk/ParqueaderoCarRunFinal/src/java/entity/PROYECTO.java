

package entity;

import java.sql.ResultSet;

public class PROYECTO extends BasicBean {

        public String   IDPROYECTO           = "";
        public String   NOMBREPROYECTO       = "";
        public String   PRESUPUESTO          = "";
        public String   DESCRIPPROYECTO      = "";

        public PROYECTO() {
        }

        public PROYECTO( ResultSet rs ) {
                try {
                        IDPROYECTO           = validateString( rs.getString( "IDPROYECTO" ) );
                        NOMBREPROYECTO       = validateString( rs.getString( "NOMBREPROYECTO" ) );
                        PRESUPUESTO          = validateString( rs.getString( "PRESUPUESTO" ) );
                        DESCRIPPROYECTO      = validateString( rs.getString( "DESCRIPPROYECTO" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into PROYECTO( NOMBREPROYECTO, PRESUPUESTO, DESCRIPPROYECTO ) values( '" +
                        NOMBREPROYECTO + "', '" +
                        PRESUPUESTO + "', '" +
                        DESCRIPPROYECTO + "' )";
                } else {
                        sql = "update PROYECTO set NOMBREPROYECTO = '" +
                        NOMBREPROYECTO + "', PRESUPUESTO= '" +
                        PRESUPUESTO + "', DESCRIPPROYECTO= '" +
                        DESCRIPPROYECTO + "' where id = '" + id + "'";
                }
           return sql;
        }
   }