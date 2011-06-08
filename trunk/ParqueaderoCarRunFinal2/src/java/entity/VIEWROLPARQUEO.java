

package entity;


import java.sql.ResultSet;

public class VIEWROLPARQUEO extends BasicBean {

        public String   IDROLPARQUEO           = "";
        public String   NOMBREROLPARQUEO       = "";
        public String   DESCRIPROLPARQUEO      = "";

        public VIEWROLPARQUEO() {
        }

        public VIEWROLPARQUEO( ResultSet rs ) {
                try {
                        IDROLPARQUEO           = validateString( rs.getString( "IDROLPARQUEO" ) );
                        NOMBREROLPARQUEO       = validateString( rs.getString( "NOMBREROLPARQUEO" ) );
                        DESCRIPROLPARQUEO      = validateString( rs.getString( "DESCRIPROLPARQUEO" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into VIEWROLPARQUEO( NOMBREROLPARQUEO, DESCRIPROLPARQUEO ) values( '" +
                        NOMBREROLPARQUEO + "', '" +
                        DESCRIPROLPARQUEO + "' )";
                } else {
                        sql = "update VIEWROLPARQUEO set NOMBREROLPARQUEO = '" +
                        NOMBREROLPARQUEO + "', DESCRIPROLPARQUEO= '" +
                        DESCRIPROLPARQUEO + "' where id = '" + id + "'";
                }
           return sql;
        }
   }