package entity;

import java.sql.ResultSet;

public class DANHOS extends BasicBean {

        public String   IDDANHOS            = "";
        public String   PLACA               = "";
        public String   FECHAREGDANHOS      = "";
        public String   HORAREGDANHOS       = "";
        public String   LISTADANHOS         = "";

        public DANHOS() {
        }

        public DANHOS( ResultSet rs ) {
                try {
                        IDDANHOS            = validateString( rs.getString( "IDDANHOS" ) );
                        PLACA               = validateString( rs.getString( "PLACA" ) );
                        FECHAREGDANHOS      = validateString( rs.getString( "FECHAREGDANHOS" ) );
                        HORAREGDANHOS       = validateString( rs.getString( "HORAREGDANHOS" ) );
                        LISTADANHOS         = validateString( rs.getString( "LISTADANHOS" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into DANHOS( PLACA, FECHAREGDANHOS, HORAREGDANHOS, LISTADANHOS ) values( '" +
                        PLACA + "', '" +
                        FECHAREGDANHOS + "', '" +
                        HORAREGDANHOS + "', '" +
                        LISTADANHOS + "' )";
                } else {
                        sql = "update DANHOS set PLACA = '" +
                        PLACA + "', FECHAREGDANHOS= '" +
                        FECHAREGDANHOS + "', HORAREGDANHOS= '" +
                        HORAREGDANHOS + "', LISTADANHOS= '" +
                        LISTADANHOS + "' where id = '" + id + "'";
                }
           return sql;
        }
   }