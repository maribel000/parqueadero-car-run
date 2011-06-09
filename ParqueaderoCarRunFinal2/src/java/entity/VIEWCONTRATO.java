

package entity;

import java.sql.ResultSet;

public class VIEWCONTRATO extends BasicBean {

        public String   NUMEROCOTRATO        = "";
        public String   NOMBRECONTRATO       = "";
        public String   FECHAINICIO          = "";
        public String   FECHAFIN             = "";
        public String   DESCRIPCONTRATO      = "";

        public VIEWCONTRATO() {
        }

        public VIEWCONTRATO( ResultSet rs ) {
                try {
                        NUMEROCOTRATO        = validateString( rs.getString( "NUMEROCOTRATO" ) );
                        NOMBRECONTRATO       = validateString( rs.getString( "NOMBRECONTRATO" ) );
                        FECHAINICIO          = validateString( rs.getString( "FECHAINICIO" ) );
                        FECHAFIN             = validateString( rs.getString( "FECHAFIN" ) );
                        DESCRIPCONTRATO      = validateString( rs.getString( "DESCRIPCONTRATO" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into VIEWCONTRATO( NOMBRECONTRATO, FECHAINICIO, FECHAFIN, DESCRIPCONTRATO ) values( '" +
                        NOMBRECONTRATO + "', '" +
                        FECHAINICIO + "', '" +
                        FECHAFIN + "', '" +
                        DESCRIPCONTRATO + "' )";
                } else {
                        sql = "update VIEWCONTRATO set NOMBRECONTRATO = '" +
                        NOMBRECONTRATO + "', FECHAINICIO= '" +
                        FECHAINICIO + "', FECHAFIN= '" +
                        FECHAFIN + "', DESCRIPCONTRATO= '" +
                        DESCRIPCONTRATO + "' where id = '" + id + "'";
                }
           return sql;
        }

       @Override
    public String getIdentifier() {
        return "idContrato=" + id;
    }


   }