
package viewsHtml;

/**
 *
 * @author eagle
 */

public class HtmlPagina {
    public  boolean session;
    private boolean BotonContratosCoo;
    private boolean BotonUsuariosCoo;
    private boolean BotonContratosCaj;
    private boolean BotonDanosParq;
    private boolean BotonDatosPersonales;
    private boolean BotonInformeTes;
    private int tipodesesion;
    private FreeHtml freehtml;

    public String getSource(){
        String sc;
        sc = getHead();
        sc += getBody();
        return sc;
    }

    public void setBotonContratosCoo(boolean b){
        BotonContratosCoo = b;
    }


    public void setBotonUsuariosCoo(boolean b){
        BotonUsuariosCoo = b;
    }

    public void setBotonDatosPersonales(boolean b){
        BotonDatosPersonales = b;
    }

    public void setBotonContratosCaj(boolean b){
        BotonContratosCaj = b;
    }

    public void setBotonDanhosParq(boolean b){
        BotonDanosParq = b;
    }
    public void setBotonInformeTes(boolean b){
        BotonInformeTes = b;
    }

    public void setFreeHtml(String sc){
        freehtml = new FreeHtml();
        this.freehtml.setHtmltext(sc);
    }


    public void setTipodeSesion(int x){
        tipodesesion = x;
    }
    
    public String getHead(){

       String sc = "<html xmlns=\"http://www.w3.org/1999/xhtml\"> \n";
               sc +="<head>\n";
               sc +="<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n";
               sc +="<title>Parqueadero Car Run</title>\n";
               sc +=" <style type=\"text/css\">\n";
               sc +=" <!-- \n";
               sc +="body  {\n";
    	sc +="font: 70%  Geneva, Arial, Helvetica, sans-serif;\n";
    	sc +="background: #FFFFFF;\n";
    	sc +="margin: 0; \n";
    	sc +="padding: 0;\n";
    	sc +="text-align: center;\n";
    	sc +="color: #000000;\n";
    sc +="}\n";

    sc +=".twoColElsLtHdr #container {\n";
    sc +="	width: 1000px;\n";
    sc +="	background: #FFFFFF;\n";
    sc +="	margin: 0 auto;\n";
    sc +="	border: 1px solid #000000;\n";
    sc +="	text-align: left; \n";
    sc +="}\n";
    sc +=".twoColElsLtHdr #header {\n";
    sc +="	background: #FFFFFF;\n";
    sc+="	padding: 0 10px; \n";
    sc +="}\n";
    sc +=".twoColElsLtHdr #header h1 {\n";
    sc +="	margin: 0; \n";
    sc +="	padding: 10px 0; \n";
    sc +="}\n";
    sc +="#apDiv1 {\n";
    sc +="position:absolute;\n";
    sc +="	left:950px;\n";
sc +="	top:10px;\n";
sc +="	width:160px;\n";
sc +="	height:60px;\n";
sc +="	z-index:1;\n";
sc +="}\n";

    sc +=".twoColElsLtHdr #sidebar1 {\n";
    sc +="	float: left;\n";
    sc +="	width: 12em;\n";
    sc +="	background: #FFFFFF; \n";
    sc +="	padding: 15px 0; \n";
    sc +="}\n";
    sc +=".twoColElsLtHdr #sidebar1 h3, .twoColElsLtHdr #sidebar1 p {\n";
    sc +="	margin-left: 10px; \n";
    sc +="	margin-right: 10px;\n";
    sc +="}\n";
    sc +=".twoColElsLtHdr #mainContent {\n";
    sc +="	margin: 0 1.5em 0 13em; \n";
    sc +="}\n";
    sc +=".twoColElsLtHdr #footer {\n";
    sc +="	padding: 0 10px; \n";
    sc +="	background:#FFFFFF;\n";
    sc +="}\n";
    sc +=".twoColElsLtHdr #footer p {\n";
    sc +="	margin: 0; \n";
    sc +="	padding: 10px 0;\n";
    sc +="}\n";
    sc +=".fltrt { \n";
    sc +="	float: right;\n";
    sc +="	margin-left: 8px;\n";
    sc +="}\n";
    sc +=".fltlft { \n";
    sc +="	float: left;\n";
    sc +="	margin-right: 8px;\n";
    sc +="}\n";
    sc +=" .clearfloat { \n";
    sc +=" 	clear:both;\n";
    sc +="    height:0;\n";
    sc +="    font-size: 1px;\n";
    sc +="    line-height: 0px;\n";
    sc +="}\n";
    sc +="a:link { \n";
    sc +="color: #87CEFA;\n";
    sc +="}\n";
    sc +="a:visited {\n";
    sc +="color: #87CEFA;\n";
    sc +="}\n";
    sc +="a:active {color: #87CEFA;}";
    sc +="a:hover {background-color: #ffffff;}";

    sc +="-->\n";
    sc +="</style><!--[if IE]>\n";
    sc +="<style type=\"text/css\">\n";
    sc +=".twoColElsLtHdr #sidebar1 { padding-top: 30px; }\n";
    sc +=".twoColElsLtHdr #mainContent { zoom: 1; padding-top: 15px; }\n";
   
    sc +="</style>\n";
    sc +="<![endif]--></head>\n";
    return sc;
    }

    public String getBody(){
     String sc =   "<body class=\"twoColElsLtHdr\">\n";
    sc +="<div id=\"container\">\n";
      //CABEZA DEL DOCUMENTO
    sc +="  <div id=\"header\">\n";
    sc +="<br><br><FONT FACE=\"Verdana\" SIZE=6 Color=#ff8c00><b>Parqueadero Car Run </b></FONT>"+this.getTipoDeSesionTitulo() +" <br><br> <div id=\"apDiv1\">   "+this.getBotonLogin()+"</div> <hr width=\"100%\" color=\"#ff8c00\" size=\"2\"/> \n";
    sc +=" <!-- end #header --></div>\n";
        // BOTONES
    sc +="<div id=\"sidebar1\">\n";
    sc +=this.getBotones();
    sc +="  <!-- end #sidebar1 --></div>\n";
        // CONTENIDO PRINCIPAL
   
    sc +="  <div id=\"mainContent\">\n";
    if(BotonContratosCoo) sc+=this.getBotonesGeneralGestion();
    if(BotonUsuariosCoo) sc+=this.getBotonesGestionarUsuarios();
    if(BotonContratosCaj) sc+=this.getBotonesGeneralGestion();
    if(BotonDanosParq) sc+=this.getBotonesGeneralGestion();
    if(BotonInformeTes) sc+=this.getBotonesGeneralGestion();
    if(BotonDatosPersonales) sc+=this.getBotonesDatosPersonales();
    
    if(this.freehtml!=null)
        sc+=this.freehtml.getHtmltext();
    sc +="   </div>\n";
    sc +="	<br class=\"clearfloat\" />\n";
        // PIE DE PAGINA
    sc +="   <div id=\"footer\">\n";
    sc +="     <FONT FACE=\"Verdana\" SIZE=2.5 FONT COLOR=#CDC9C9>Elaborado por UNDevelopment\n";
    sc +="    </div\n";
    sc +="</div>\n";
    sc +="</body>\n";
    sc +="</html>\n";
    return sc;
    }

    public String getBotonLogin(){
        String sc="";
        if(!session){
        sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/1.png\" align=\"left\"><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=#87CEFA>Ingresar</b></FONT></a>";

        return sc;
        }else{
        /*Coordinador (a)*/
        if(this.tipodesesion==1){
        sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/3.png\" align=\"left\"><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=#87CEFA>Inicio</b></FONT></a><pre></pre><IMG SRC=\"/ParqueaderoCarRunFinal2/images/2.png\" align=\"left\"><a href='/ParqueaderoCarRunFinal2/exit.jsp'><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=#87CEFA>Salir</b></FONT></a>";
        return sc;
        }
        /*Cajero (a)*/
        else if(this.tipodesesion==2){
        sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/3.png\" align=\"left\"><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=#87CEFA>Inicio</b></FONT></a><pre></pre><IMG SRC=\"/ParqueaderoCarRunFinal2/images/2.png\" align=\"left\"><a href='/ParqueaderoCarRunFinal2/exit.jsp'><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=#87CEFA>Salir</b></FONT></a>";
        return sc;
        }
        /*Parqueador (a)*/
        else if(this.tipodesesion==3){
        sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/3.png\" align=\"left\"><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=#87CEFA>Inicio</b></FONT></a><pre></pre><IMG SRC=\"/ParqueaderoCarRunFinal2/images/2.png\" align=\"left\"><a href='/ParqueaderoCarRunFinal2/exit.jsp'><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=#87CEFA>Salir</b></FONT></a>";
        return sc;
        }
        /*Tesorero (a)*/
        else if(this.tipodesesion==4){
        sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/3.png\" align=\"left\"><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=#87CEFA>Inicio</b></FONT></a><pre></pre><IMG SRC=\"/ParqueaderoCarRunFinal2/images/2.png\" align=\"left\"><a href='/ParqueaderoCarRunFinal2/exit.jsp'><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=#87CEFA>Salir</b></FONT></a>";
        return sc;
        }
        else{
        return sc;

        }
        }    
    }

    public String getTipoDeSesionTitulo(){
        String sc="";
        /*sin tener sesion*/if(this.tipodesesion==0){
        sc=""; return sc;
        }else/*Coordinador*/ if(this.tipodesesion==1){
        sc="<FONT FACE=\"Verdana\" SIZE=3 COLOR=#ff8c00>Coordinador (a)</b></FONT>\n";return sc;
        }else/*Cajero*/ if(this.tipodesesion==2){
        sc="<FONT FACE=\"Verdana\" SIZE=3 COLOR=#ff8c00>Cajero (a)</b></FONT>\n";return sc;
        }else/*Parqueador*/ if(this.tipodesesion==3){
        sc="<FONT FACE=\"Verdana\" SIZE=3 COLOR=#ff8c00>Parqueador (a)</b></FONT>\n";return sc;
        }else if(this.tipodesesion==4){
        sc="<FONT FACE=\"Verdana\" SIZE=3 COLOR=#ff8c00>Tesorero (a)</b></FONT>\n";
        return sc;
        }else return sc;
    }

    public String getBotones(){
      
        String sc="";
        if(this.tipodesesion==0){
         sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/inicio.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Inicio\"> </a>\n";
         sc+="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/contacto.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Contacto.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Contactenos\"> </a>\n";
        return sc;
        }
        /*Coordinador*/
        else if(this.tipodesesion==1){
        sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/inicio.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Inicio\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/Coordinador/PersonalInfo/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Mdatos.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Mi Perfil\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarContratos/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/CoorContratos.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Contratos\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarUsuarios/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/CoorUsuarios.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Usuarios\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/contacto.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Contacto.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Contactenos\"> </a>\n";
        return sc;
        }
        /*Cajero (a)*/
        else if(this.tipodesesion==2){
        sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/inicio.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Inicio\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/Cajero/PersonalInfo/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Mdatos.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Mi Perfil\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/Cajero/AdminContratos/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/CoorContratos.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Contratos\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/contacto.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Contacto.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Contactenos\"> </a>\n";
        return sc;
        }
        /*Parqueador (a)*/
        else if(this.tipodesesion==3){
        sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/inicio.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Inicio\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/Parqueador/GestionarDanhos/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Danhos.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Danhos\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/Parqueador/PersonalInfo/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Mdatos.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Mi Perfil\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/contacto.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Contacto.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Contactenos\"> </a>\n";
        return sc;
        }
        /*Tesorero (a)*/
        else if(this.tipodesesion==4){
        sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/inicio.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Inicio\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/Tesorero/InformeEc/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Informes.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Reporte\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/Tesorero/PersonalInfo/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Mdatos.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Mi Perfil\"> </a>\n\n";
        sc+="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/contacto.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Contacto.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Contactenos\"> </a>\n";
        return sc;
        }

        else{
            sc="<a href='/ParqueaderoCarRunFinal2/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/inicio.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Inicio\"> </a>\n";
            return sc;
        }
   }

        public String getBotonesGeneralGestion(){
        String sc="";
        /*Coordinador*/
        if(this.tipodesesion==1){
        sc="<center><FONT FACE=\"Verdana\" SIZE=5 Color=#87cefa>Gestionar Contratos</FONT><br><br> <a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarContratos/CrearContartos.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Crear.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Crear\"></a>";
        sc+="<a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarContratos/BorrarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Borrar.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Borrar\"></a>";
        sc+="<a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarContratos/ActualizarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
        sc+="<a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarContratos/BuscarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Buscar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"buscar\"></a></center><br><br>\n";
        return sc;
        }
        /*Cajero (a)*/
        else if(this.tipodesesion==2){
             sc="<center><FONT FACE=\"Verdana\" SIZE=5 Color=#87cefa>Gestionar Contratos</FONT><br><br><a href='/ParqueaderoCarRunFinal2/Cajero/AdminContratos/CrearContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Crear.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Crear\"></a>";
             sc+="<a href='/ParqueaderoCarRunFinal2/Cajero/AdminContratos/BorrarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Borrar.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Borrar\"></a>";
             sc+="<a href='/ParqueaderoCarRunFinal2/Cajero/AdminContratos/ActualizarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
             sc+="<a href='/ParqueaderoCarRunFinal2/Cajero/AdminContratos/BuscarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Buscar.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"buscar\"></a></center><br><br>\n";
             return sc;
        }
        /*Parqueador (a)*/
        else if(this.tipodesesion==3){
        sc="<center><FONT FACE=\"Verdana\" SIZE=5 Color=#87cefa>Gestionar Da&ntilde;os</FONT><br><br><a href='/ParqueaderoCarRunFinal2/Parqueador/GestionarDanhos/index.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Report.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Crear\"></a>";
        sc+="<a href='/ParqueaderoCarRunFinal2/Parqueador/GestionarDanhos/ActualizarRep.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/ActualizarR.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
        return sc;
        }
        /*Tesorero*/
        else if(this.tipodesesion==4){
        sc="<center><FONT FACE=\"Verdana\" SIZE=5 Color=#87cefa>Reporte Econ&oacute;mico</FONT><br><br><a href='/ParqueaderoCarRunFinal2/Tesorero/InformeEc/index.jsp'></a>";
        return sc;
        }

         else return sc;
        }


        public String getBotonesDatosPersonales(){
        String sc="";
        /*Coordinador*/ if(this.tipodesesion==1){
         sc="<center><FONT FACE=\"Verdana\" SIZE=5 Color=#87cefa>Datos Personales</FONT><br><br><a href='/ParqueaderoCarRunFinal2/Cordinador/PersonalInfo/index.jsp'></a>";
         sc+="<a href='/ParqueaderoCarRun/Coordinador/ActualizarDatos.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Actualizar.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Actualizar Datos\"></a></center><br><br>\n";
         return sc;
        }
        /*Cajero (a)*/
        else if(this.tipodesesion==2){
        sc="<center><FONT FACE=\"Verdana\" SIZE=5 Color=#87cefa>Datos Personales</FONT><br><br><a href='/ParqueaderoCarRunFinal2/Cajero/PersonalInfo/index.jsp'></a>";
        return sc;
        }
        /*Parqueador*/
        else if(this.tipodesesion==3){
        sc="<center><FONT FACE=\"Verdana\" SIZE=5 Color=#87cefa>Datos Personales</FONT><br><br><a href='/ParqueaderoCarRunFinal2/Parqueador/PersonalInfo/index.jsp'></a>";
        return sc;
        }
        /*Tesorero*/
        else if(this.tipodesesion==4){
        sc="<center><FONT FACE=\"Verdana\" SIZE=5 Color=#87cefa>Datos Personales</FONT><br><br><a href='/ParqueaderoCarRunFinal2/Tesorero/PersonalInfo/index.jsp'></a>";
        return sc;
        }
        else return sc;
        }

        public String getBotonesGestionarUsuarios(){
        String sc="";
        /*Coordinador*/ 
          if(this.tipodesesion==1){
        sc="<center><FONT FACE=\"Verdana\" SIZE=5 Color=#87cefa>Gestionar Usuarios</FONT><br><br> <a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarUsuarios/CrearUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Crear.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Crear\"></a>";
        sc+="<a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarUsuarios/EliminarUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Borrar.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Borrar\"></a>";
        sc+="<a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarUsuarios/editarUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
        sc+="<a href='/ParqueaderoCarRunFinal2/Coordinador/AdministrarUsuarios/buscarUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal2/images/Buscar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"buscar\"></a></center><br><br>\n";
        return sc;
        }
            else return sc;
        }


}
