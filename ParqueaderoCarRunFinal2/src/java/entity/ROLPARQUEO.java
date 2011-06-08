

package entity;

import java.sql.ResultSet;

public class ROLPARQUEO extends BasicBean {

        public String   IDROLPARQUEO           = "";
        public String   NOMBREROLPARQUEO       = "";
        public String   DESCRIPROLPARQUEO      = "";

        public ROLPARQUEO() {
        }

        public ROLPARQUEO( ResultSet rs ) {
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
                        sql = "insert into ROLPARQUEO( NOMBREROLPARQUEO, DESCRIPROLPARQUEO ) values( '" +
                        NOMBREROLPARQUEO + "', '" +
                        DESCRIPROLPARQUEO + "' )";
                } else {
                        sql = "update ROLPARQUEO set NOMBREROLPARQUEO = '" +
                        NOMBREROLPARQUEO + "', DESCRIPROLPARQUEO= '" +
                        DESCRIPROLPARQUEO + "' where id = '" + id + "'";
                }
           return sql;
        }
   }