

package entity;


import java.sql.ResultSet;

public class VIEWROLADMIN extends BasicBean {

        public String   IDROLADMIN           = "";
        public String   NOMBREROLADMIN       = "";
        public String   DURACION             = "";
        public String   DESCRIPROLADMIN      = "";

        public VIEWROLADMIN() {
        }

        public VIEWROLADMIN( ResultSet rs ) {
                try {
                        IDROLADMIN           = validateString( rs.getString( "IDROLADMIN" ) );
                        NOMBREROLADMIN       = validateString( rs.getString( "NOMBREROLADMIN" ) );
                        DURACION             = validateString( rs.getString( "DURACION" ) );
                        DESCRIPROLADMIN      = validateString( rs.getString( "DESCRIPROLADMIN" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into VIEWROLADMIN( NOMBREROLADMIN, DURACION, DESCRIPROLADMIN ) values( '" +
                        NOMBREROLADMIN + "', '" +
                        DURACION + "', '" +
                        DESCRIPROLADMIN + "' )";
                } else {
                        sql = "update VIEWROLADMIN set NOMBREROLADMIN = '" +
                        NOMBREROLADMIN + "', DURACION= '" +
                        DURACION + "', DESCRIPROLADMIN= '" +
                        DESCRIPROLADMIN + "' where id = '" + id + "'";
                }
           return sql;
        }
   }