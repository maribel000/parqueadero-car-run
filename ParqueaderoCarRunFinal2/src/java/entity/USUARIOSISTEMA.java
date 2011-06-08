
package entity;

import java.sql.ResultSet;

public class USUARIOSISTEMA extends BasicBean {

        public String   CEDULAUSUARIO        = "";
        public String   IDROLPARQUEO         = "";
        public String   IDROLADMIN           = "";
        public String   NOMBREUSUARIO        = "";
        public String   APELLIDOUSUARIO      = "";
        public String   E_MAIL               = "";
        public String   TELEFONOUSUARIO      = "";

        public USUARIOSISTEMA() {
        }

        public USUARIOSISTEMA( ResultSet rs ) {
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
                        sql = "insert into USUARIOSISTEMA( IDROLPARQUEO, IDROLADMIN, NOMBREUSUARIO, APELLIDOUSUARIO, E_MAIL, TELEFONOUSUARIO ) values( '" +
                        IDROLPARQUEO + "', '" +
                        IDROLADMIN + "', '" +
                        NOMBREUSUARIO + "', '" +
                        APELLIDOUSUARIO + "', '" +
                        E_MAIL + "', '" +
                        TELEFONOUSUARIO + "' )";
                } else {
                        sql = "update USUARIOSISTEMA set IDROLPARQUEO = '" +
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
     public String getHtmlRow() {
        String sz = "";
        sz += "<td class='st4middle'>" + CEDULAUSUARIO + "</td>";
        sz += "<td class='st4middle'>" + IDROLPARQUEO + "</td>";
        sz += "<td class='st4middle'>" + IDROLADMIN + "</td>";
        sz += "<td class='st4middle'>" + NOMBREUSUARIO + "</td>";
        sz += "<td class='st4middle'>" + APELLIDOUSUARIO + "</td>";
        sz += "<td class='st4middle'>" + E_MAIL + "</td>";
        sz += "<td class='st4middle'>" + TELEFONOUSUARIO + "</td>";
        return sz;
    }

    @Override
    public String getIdentifier() {
        return "idUsuarioSistema=" + id;
    }



   }