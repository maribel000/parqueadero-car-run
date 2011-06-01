
package viewsHtml;

/**
 *
 * @author eagle
 */

public class HtmlPagina {
    public boolean  session;
    private boolean BotonGestionCoord;
    private boolean BotonGestionCajera;
    private boolean BotonGestionParque;
    private boolean BotonesDatosPersonales;
    private String m_path = "";
    
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
        String x = "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"es\" lang=\"es\"> \n";
               x +="<head>\n";
               x +="<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n";
               x +="<link rel=\"stylesheet\" href=\"" + m_path + "desig.css\" type=\"text/css\" />\n";
               x +="<title>Parqueadero Car Run</title>\n";
               x +="</head>\n";
        return x;
    }

    public String getBody(){
        String x = "<body>\n";
        x +="<div id=\"wrapper\">\n";
        //CABEZA DEL DOCUMENTO
        x +="<div id=\"encabezado\">\n";
        x +="<h1><img src=\"/ParqueaderoCarRunFinal/images/pcr.png\" alt=\"Parqueadero Car - Run\" width=\"500\" height=\"61\" /></h1> \n";
        x +="<p>" +this.getTipoDeSesionTitulo() + "</p>\n";
        x +="</div><!-- fin del encabezado --> \n";
        x +="<div id=\"sesion\"> \n";
        x += this.getBotonLogin();
        x +="\n</div><!-- Fin #sesion -->\n";
        // BOTONES
        x +="<div id=\"navegacion\">\n";
        x +=this.getBotones();
        x +="</div><!-- Fin #navegacion -->\n";
        // CONTENIDO PRINCIPAL
        x +="<div id=\"areatexto\">\n";
        if(BotonGestionCoord) {
            x+=this.getBotonesGestionRoles();
        }
        if(BotonGestionCajera){
            x+=this.getBotonesGestionarUsuarios();
        }
        if(BotonGestionParque){
            x+=this.getBotonesGestionRoles();
        }
        if(BotonesDatosPersonales){
            x+=this.getBotonesDatosPersonales();
        }
        if(this.freehtml!=null){
            x+=this.freehtml.getHtmltext();
        }
        x +="\n</div><!-- Fin #areatexto -->\n";
        // PIE DE PAGINA
        x +="<div id=\"pie\">\n";
        x +="Elaborado por UNdevelopment.\n";
        x +="</div> <!-- Fin #pie -->\n";
        x +="</div><!-- Fin #wrapper -->\n";
        x +="</body>\n";
        x +="</html>\n";
        return x;
    }

    public String getBotonLogin(){
        String x="";
        if(!session){
            x="<a href=\"/ParqueaderoCarRunFinal/IngresoSistema/index.jsp\">Ingresar</a>";
        }else{
            /*Administrador Principal*/ 
            if(this.tipodesesion==1){
                x = "<a href=\"/ParqueaderoCarRunFinal/IngresoSistema/inicio.jsp\">Inicio</a> \n";
                x += "<a href=\"/ParqueaderoCarRunFinal/exit.jsp\">Salir</a>";
        }else if(this.tipodesesion==4){
            x="";
        }
        }
        return x;
    }

    public String getTipoDeSesionTitulo(){
        String x="";
        /*sin tener sesion*/
        if(this.tipodesesion==0){
            x="";
        }else/*Coordinador*/ if(this.tipodesesion==1){
            x="Coordinador.";
        }else/*Cajero*/ if(this.tipodesesion==2){
            x="Cajero.";
        }else/*Parqueador*/ if(this.tipodesesion==3){
            x="Parqueador.";
        }else{
            x="Otro Rol.";
        }
        return x;
    }

    public String getBotones(){
        String x="";
        x="<a href=\"/ParqueaderoCarRunFinal/IngresoSistema/inicio.jsp\"><IMG SRC=\"/ParqueaderoCarRunFinal/images/inicio.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Inicio\"></a>\n";
        x+="<a href='/ParqueaderoCarRunFinal/IngresoSistema/contacto.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/Contacto.png\" WIDTH=110 HEIGHT=50 Border=0 VSPACE=3 HSPACE=3 ALT=\"Contáctenos\"></a>\n";
        return x; 
    }
    
    public String getBotonesGestionRoles(){
        String x="";
        /*Coordinador*/ 
        if(this.tipodesesion==1){
            x ="<center><IMG SRC=\"/ParqueaderoCarRunFinal/images/gestionarContratos.png\"><br> <a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarContratos/CrearContratos.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/crearContrato.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Crear\"></a>";
            x +="<a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarContratos/BorrarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/borrar.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Borrar\"></a>";
            x +="<a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarContratos/ActualizarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
            x +="<a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarContratos/BuscarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/buscar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"buscar\"></a></center><br><br>\n";
        }else/*Cajero*/ if(this.tipodesesion==2){
            x="<center><IMG SRC=\"/ParqueaderoCarRunFinal/images/gesContratosCajero.png\"><br><a href='/ParqueaderoCarRunFinal/Cajero/AdminContratos/CrearContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/crear.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Crear\"></a>";
            x+="<a href='/ParqueaderoCarRunFinal/Cajero/AdminContratos/BorrarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/borrar.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Borrar\"></a>";
            x+="<a href='/ParqueaderoCarRunFinal/Cajero/AdminContratos/ActualizarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
            x+="<a href='/ParqueaderoCarRunFinal/Cajero/AdminContratos/BuscarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/buscar.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"buscar\"></a></center><br><br>\n";
        }else/*Parqueador*/ if(this.tipodesesion==3){
            x="<center><IMG SRC=\"/ParqueaderoCarRunFinal/images/CrearReporteDa.png\"><br><a href='/ParqueaderoCarRunFinal/Parqueador/GestionarDanhos/CrearReporte.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/crear.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Crear\"></a>";
        }else/*Tesorero*/ if(this.tipodesesion==4){
            x="<center><IMG SRC=\"/ParqueaderoCarRunFinal/images/gestionarContratos.png\"><br> <a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarContratos/CrearContartos.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/crearContrato.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Crear\"></a>";
            x+="<a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarContratos/BorrarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/borrar.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Borrar\"></a>";
            x+="<a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarContratos/ActualizarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
            x+="<a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarContratos/BuscarContrato.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/buscar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"buscar\"></a></center><br><br>\n";
        }
        return x;
    }
    
    public String getBotonesDatosPersonales(){
        String x="";
        /*Coordinador*/ 
        if(this.tipodesesion==1){
            x="<center><IMG SRC=\"/ParqueaderoCarRunFinal/images/datapersonal.png\"><br><a href='/ParqueaderoCarRunFinal/Cordinador/MiPerfil/VerDatos.jsp'><IMG SRC=\"/AUM_FINAL/images/verdatos.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Ver Datos\"></a>";
            x+="<a href='/ParqueaderoCarRun/Coordinador/ActualizarDatos.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/actualizardatos.png\" WIDTH=110 HEIGHT=50 Border=0 ALT=\"Actualizar Datos\"></a></center><br><br>\n";
        }
        return x;
    }
    
    public String getBotonesGestionarUsuarios(){
        String x="";
        /*Cordinador*/ 
        if(this.tipodesesion==1){
            x="<center><IMG SRC=\"/ParqueaderoCarRun/images/gestionarem.png\"><br> <a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarUsuarios/CrearUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/crear.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Crear\"></a>";
            x+="<a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarUsuarios/EliminarUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/borrar.png\" WIDTH=110 HEIGHT=50 Border=0   ALT=\"Borrar\"></a>";
            x+="<a href='/ParqueaderoCarRunFianl/Coordinador/AdministrarUsuarios/editarUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/actualizar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"Actualizar\"></a>";
            x+="<a href='/ParqueaderoCarRunFinal/Coordinador/AdministrarUsuarios/buscarUsuarios.jsp'><IMG SRC=\"/ParqueaderoCarRunFinal/images/buscar.png\" WIDTH=110 HEIGHT=50 Border=0  ALT=\"buscar\"></a></center><br><br>\n";    
        }
        return x;
    }
    
    /*Debido a la diferente ubicación de las páginas, se hace necesario
     referenciar el path del archivo css desde distintas ubicaciones.*/
    public String setPath  (int path){
        if (path == 0){
            m_path = "";
        }
        if (path == 1){
            m_path = "../";
        }
        if (path == 2){
            m_path = "../../";
        }
        return m_path;
    }
}
