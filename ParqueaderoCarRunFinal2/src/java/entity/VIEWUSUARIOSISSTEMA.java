

package entity;
import java.sql.ResultSet;

public class VIEWUSUARIOSISSTEMA extends BasicBean {

        public String   CEDULAUSUARIO        = "";
        public String   IDROLPARQUEO         = "";
        public String   IDROLADMIN           = "";
        public String   NOMBREUSUARIO        = "";
        public String   APELLIDOUSUARIO      = "";
        public String   E_MAIL               = "";
        public String   TELEFONOUSUARIO      = "";

        public VIEWUSUARIOSISSTEMA() {
        }

        public VIEWUSUARIOSISSTEMA( ResultSet rs ) {
                try {
                        CEDULAUSUARIO        = validateString( rs.getString( "CEDULAUSUARIO" ) );
                        IDROLPARQUEO         = validateString( rs.getString( "IDROLPARQUEO" ) );
                        IDROLADMIN           = validateString( rs.getString( "IDROLADMIN" ) );
                        NOMBREUSUARIO        = validateString( rs.getString( "NOMBREUSUARIO" ) );
                        APELLIDOUSUARIO      = validateString( rs.getString( "APELLIDOUSUARIO" ) );
                        E_MAIL               = validateString( rs.getString( "E_MAIL" ) );
                        TELEFONOUSUARIO      = validateString( rs.getString( "TELEFONOUSUARIO" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into VIEWUSUARIOSISSTEMA(CEDULAUSUARIO, IDROLPARQUEO, IDROLADMIN, NOMBREUSUARIO, APELLIDOUSUARIO, E_MAIL, TELEFONOUSUARIO ) values( '" +
                        CEDULAUSUARIO + "', '" +
                        IDROLPARQUEO + "', '" +
                        IDROLADMIN + "', '" +
                        NOMBREUSUARIO + "', '" +
                        APELLIDOUSUARIO + "', '" +
                        E_MAIL + "', '" +
                        TELEFONOUSUARIO + "' )";
                } else {
                        sql = "update VIEWUSUARIOSISSTEMA set IDROLPARQUEO = '" +
                        IDROLPARQUEO + "', IDROLADMIN= '" +
                        IDROLADMIN + "', NOMBREUSUARIO= '" +
                        NOMBREUSUARIO + "', APELLIDOUSUARIO= '" +
                        APELLIDOUSUARIO + "', E_MAIL= '" +
                        E_MAIL + "', TELEFONOUSUARIO= '" +
                        TELEFONOUSUARIO + "' where id = '" + id + "'";
                }
           return sql;
        }

     @Override
     public String getIdentifier() {
        return "idUsuario=" + id;
    }





   }