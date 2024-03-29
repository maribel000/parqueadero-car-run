
package viewsHtml;

/**
 *
 * @author eagle
 */

public class HtmlPagina {
    public boolean session;
    private boolean BotonGestionCoord;
    private boolean BotonGestionCajera;
    private boolean BotonGestionParque;
    private boolean BotonesDatosPersonales;
    
    private int tipodesesion;
    private FreeHtml freehtml;

    public String getSource(){
        String x;
        x = getHead();
        x += getBody();
        return x;
    }
    public void setBotonGestionCoord(boolean b){
        BotonGestionCoord = b;
    }


    public void setBotonGestionCajera(boolean b){
        BotonGestionCajera = b;
    }

    public void setBotonGestionParque(boolean b){
        BotonGestionParque = b;
    }

    
    public void setFreeHtml(String x){
        freehtml = new FreeHtml();
        this.freehtml.setHtmltext(x);
    }


    public void setTipodeSesion(int x){
        tipodesesion = x;
    }
    
    public String getHead(){
        String x = "<html xmlns=\"http://www.w3.org/1999/xhtml\"> \n";
               x +="<head>\n";
               x +="<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n";
               x +=" <title>Parqueadero Car Run</title>\n";
               x +=" <style type=\"text/css\">\n";
               x +=" <!-- \n";
               x +="body  {\n";
    	x +="font: 70%  Geneva, Arial, Helvetica, sans-serif;\n";
    	x +="background: #FFFFFF;\n";
    	x +="margin: 0; \n";
    	x +="padding: 0;\n";
    	x +="text-align: center; \n";
    	x +="color: #000000;\n";
    x +="}\n";

    x +=".twoColElsLtHdr #container {\n";
    x +="	width: 1000px;  \n";
    x +="	background: #FFFFFF;\n";
    x +="	margin: 0 auto; \n";
    x +="	border: 1px solid #000000;\n";
    x +="	text-align: left;\n";
    x +="}\n";
    x +=".twoColElsLtHdr #header {\n";
    x +="	background: #ff8c00;\n";
    x +="	padding: 0 10px;\n";
    x +="}\n";
    x +=".twoColElsLtHdr #header h1 {\n";
    x +="	margin: 0; \n";
    x +="	padding: 10px 0; \n";
    x +="}\n";
    x +="#apDiv1 {\n";
    x +="position:absolute;\n";
    x +="	left:950px;\n";
x +="	top:10px;\n";
x +="	width:160px;\n";
x +="	height:60px;\n";
x +="	z-index:1;\n";
x +="}\n";
    
    
    x +=".twoColElsLtHdr #sidebar1 {\n";
    x +="	float: left;\n";
    x +="	width: 12em; \n";
    x +="	background: #FFFFFF; \n";
    x +="	padding: 15px 0; \n";
    x +="}\n";
    x +=".twoColElsLtHdr #sidebar1 h3, .twoColElsLtHdr #sidebar1 p {\n";
    x +="	margin-left: 10px; \n";
    x +="	margin-right: 10px;\n";
    x +="}\n";

    
    x +=".twoColElsLtHdr #mainContent {\n";
    x +="	margin: 0 1.5em 0 13em; \n";
    x +="}\n";
    x +=".twoColElsLtHdr #footer {\n";
    x +="	padding: 0 10px; \n";
    x +="	background:#FFFAFA;\n";
    x +="}\n";
    x +=".twoColElsLtHdr #footer p {\n";
    x +="	margin: 0; \n";
    x +="	padding: 10px 0; \n";
    x +="}\n";

   
    x +=".fltrt { \n";
    x +="	float: right;\n";
    x +="	margin-left: 8px;\n";
    x +="}\n";
    x +=".fltlft { \n";
    x +="	float: left;\n";
    x +="	margin-right: 8px;\n";
    x +="}\n";
    x +=" .clearfloat { \n";
    x +=" 	clear:both;\n";
    x +="    height:0;\n";
    x +="    font-size: 1px;\n";
    x +="    line-height: 0px;\n";
    x +="}\n";
    x +="-->\n";
    x +="</style><!--[if IE]>\n";
    x +="<style type=\"text/css\">\n";
   
    x +=".twoColElsLtHdr #sidebar1 { padding-top: 30px; }\n";
    x +=".twoColElsLtHdr #mainContent { zoom: 1; padding-top: 15px; }\n";
   
    x +="</style>\n";
    x +="<![endif]--></head>\n";
    return x;
    }

    public String getBody(){
     String x =   "<body class=\"twoColElsLtHdr\">\n";
    x +="<div id=\"container\">\n";
      //CABEZA DEL DOCUMENTO
    x +="  <div id=\"header\">\n";
    x +="    <br><br><FONT FACE=\"Verdana\" SIZE=6 Color=White><b>Parqueadero Car Run </b></FONT>"+this.getTipoDeSesionTitulo() +" <br><br> <div id=\"apDiv1\">   "+this.getBotonLogin()+"</div> \n";
    x +="    <!-- end #header --></div>\n";
        // BOTONES
    x +="  <div id=\"sidebar1\">\n";
    x +=this.getBotones();
    x +="  <!-- end #sidebar1 --></div>\n";
        // CONTENIDO PRINCIPAL
    x +="  <div id=\"mainContent\">\n";
    if(BotonGestionCoord) 
    x+=this.getBotonesGestionRoles();
    if(BotonGestionCajera)
        x+=this.getBotonesGestionarUsuarios();
    if(BotonGestionParque)
        x+=this.getBotonesGestionRoles();
     if(BotonesDatosPersonales)
        x+=this.getBotonesDatosPersonales();
    
    if(this.freehtml!=null)
        x+=this.freehtml.getHtmltext();
    x +="   </div>\n";
    x +="	<br class=\"clearfloat\" />\n";
        // PIE DE PAGINA
    x +="   <div id=\"footer\">\n";
    x +="     <FONT FACE=\"Verdana\" SIZE=2.5 FONT COLOR=gray>Elaborado por UNdevelopment\n";
    x +="    </div\n";
    x +="</div>\n";
    x +="</body>\n";
    x +="</html>\n";
    return x;
    }

    public String getBotonLogin(){
        String x="";
        if(!session){
        x="<a href='/ParqueaderoCarRun/IngresoSistema/index.jsp'><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=white>Ingresar</b></FONT></a>";
        return x;    
        }else{
        /*Administrador Principal*/ if(this.tipodesesion==1){
        x="<a href='/ParqueaderoCarRun/IngresoSistema/inicio.jsp'><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=white>Inicio</b></FONT></a><pre>   </pre><a href='/ParqueaderoCarRun/exit.jsp'><b><FONT FACE=\"Verdana\" SIZE=2.5 COLOR=white>Salir</b></FONT></a>";return x;
        }
        
        
        else if(this.tipodesesion==4){
        x="";return x;
        }else{
        x="";return x;

        }
        }    
    }

    public String getTipoDeSesionTitulo(){
        String x="";
        /*sin tener sesion*/if(this.tipodesesion==0){
        x=""; return x;
        }else/*Coordinador*/ if(this.tipodesesion==1){
        x="<FONT FACE=\"Verdana\" SIZE=3 COLOR=white>Coordinador</b></FONT>\n";return x;
        }else/*Cajero*/ if(this.tipodesesion==2){
        x="<FONT FACE=\"Verdana\" SIZE=3 COLOR=white>Cajero (a)</b></FONT>\n";return x;
        }else/*Parqueador*/ if(this.tipodesesion==3){
        x="<FONT FACE=\"Verdana\" SIZE=3 COLOR=white>Parqueador</b></FONT>\n";return x;
        }else{
        x="<FONT FACE=\"Verdana\" SIZE=3 COLOR=white>Otro Rol</b></FONT>\n";
        return x;
        }
    }

    public String getBotones(){
      
        String x="";
        if(this.tipodesesion==0){
        x="<a href='/ParqueaderoCarRun/IngresoSistema/inicio.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/inicio.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Inicio\"> </a>\n";
        x+="<a href='/ParqueaderoCarRun/IngresoSistema/contacto.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/Contacto.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Contactenos\"> </a>\n";
        return x;
        }
      return x; 

    }



        public String getBotonesGestionRoles(){
        String x="";
        /*Coordinador*/ if(this.tipodesesion==1){
        x="<center><IMG SRC=\"/ParqueaderoCarRun/images/gestionarContratos.png\"><br> <a href='/ParqueaderoCarRun/Coordinador/AdministrarContratos/CrearContartos.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/crearContrato.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Crear\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/AdministrarContratos/BorrarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/borrar.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Borrar\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/AdministrarContratos/ActualizarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/AdministrarContratos/BuscarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/buscar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"buscar\"></a></center><br><br>\n";
        return x;
        }else/*Cajero*/ if(this.tipodesesion==2){
        x="<center><IMG SRC=\"/ParqueaderoCarRun/images/gesContratosCajero.png\"><br><a href='/ParqueaderoCarRun/Cajero/AdminContratos/CrearContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/crear.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Crear\"></a>";
        x+="<a href='/ParqueaderoCarRun/Cajero/AdminContratos/BorrarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/borrar.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Borrar\"></a>";
        x+="<a href='/ParqueaderoCarRun/Cajero/AdminContratos/ActualizarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
        x+="<a href='/ParqueaderoCarRun/Cajero/AdminContratos/BuscarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/buscar.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"buscar\"></a></center><br><br>\n";
        return x;
        }else/*Parqueador*/ if(this.tipodesesion==3){
        x="<center><IMG SRC=\"/ParqueaderoCarRun/images/CrearReporteDa.png\"><br><a href='/ParqueaderoCarRun/Parqueador/GestionarDanhos/CrearReporte.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/crear.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Crear\"></a>";
        }else/*Tesorero*/ if(this.tipodesesion==4){
        x="<center><IMG SRC=\"/ParqueaderoCarRun/images/gestionarContratos.png\"><br> <a href='/ParqueaderoCarRun/Coordinador/AdministrarContratos/CrearContartos.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/crearContrato.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Crear\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/AdministrarContratos/BorrarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/borrar.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Borrar\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/AdministrarContratos/ActualizarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/AdministrarContratos/BuscarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/buscar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"buscar\"></a></center><br><br>\n";
        return x;
        }
        return x;
        }


        public String getBotonesDatosPersonales(){
        String x="";
        /*Coordinador*/ if(this.tipodesesion==1){
         x="<center><IMG SRC=\"/ParqueaderoCarRun/images/datapersonal.png\"><br><a href='/ParqueaderoCarRun/Cordinador/MiPerfil/VerDatos.jsp'><IMG SRC=\"/AUM_FINAL/images/verdatos.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Ver Datos\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/ActualizarDatos.jsp'><IMG SRC=\"/AUM_FINAL/images/actualizardatos.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Actualizar Datos\"></a></center><br><br>\n";
        return x;
        }
        return x;
        }

       public String getBotonesGestionarUsuarios(){
        String x="";
        /*Cordinador*/ if(this.tipodesesion==1){
        x="<center><IMG SRC=\"/ParqueaderoCarRun/images/gestionarem.png\"><br> <a href='/ParqueaderoCarRun/Coordinador/AdministrarUsuarios/CrearUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/crear.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Crear\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/AdministrarUsuarios/EliminarUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/borrar.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Borrar\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/AdministrarUsuarios/editarUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
        x+="<a href='/ParqueaderoCarRun/Coordinador/AdministrarUsuarios/buscarUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRun/images/buscar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"buscar\"></a></center><br><br>\n";
        return x;
        }else{
        return x;
        }


    }

}
