package entity;

import java.sql.ResultSet;

public class CLIENTE extends BasicBean {

        public String   CEDULACLIENTE        = "";
        public String   NUMEROCOTRATO        = "";
        public String   NOMBRECLIENTE        = "";
        public String   APELLIDOCLIENTE      = "";
        public String   TELEFONOCLIENTE      = "";

        public CLIENTE() {
        }

        public CLIENTE( ResultSet rs ) {
                try {
                        CEDULACLIENTE        = validateString( rs.getString( "CEDULACLIENTE" ) );
                        NUMEROCOTRATO        = validateString( rs.getString( "NUMEROCOTRATO" ) );
                        NOMBRECLIENTE        = validateString( rs.getString( "NOMBRECLIENTE" ) );
                        APELLIDOCLIENTE      = validateString( rs.getString( "APELLIDOCLIENTE" ) );
                        TELEFONOCLIENTE      = validateString( rs.getString( "TELEFONOCLIENTE" ) );
                } catch ( Exception e ) { System.out.println( e ); }
        }

    @Override
        public String getUpdateSql() {
                String sql = "";
                if( id.equals( "" ) ){
                        sql = "insert into CLIENTE( NUMEROCOTRATO, NOMBRECLIENTE, APELLIDOCLIENTE, TELEFONOCLIENTE ) values( '" +
                        NUMEROCOTRATO + "', '" +
                        NOMBRECLIENTE + "', '" +
                        APELLIDOCLIENTE + "', '" +
                        TELEFONOCLIENTE + "' )";
                } else {
                        sql = "update CLIENTE set NUMEROCOTRATO = '" +
                        NUMEROCOTRATO + "', NOMBRECLIENTE= '" +
                        NOMBRECLIENTE + "', APELLIDOCLIENTE= '" +
                        APELLIDOCLIENTE + "', TELEFONOCLIENTE= '" +
                        TELEFONOCLIENTE + "' where id = '" + id + "'";
                }
           return sql;
        }
   }