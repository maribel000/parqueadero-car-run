<%-- 
    Document   : IntroCajero
    Created on : 01-jun-2011, 11:48:21
    Author     : Edwin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="viewsHtml.*"%>
<%HtmlPagina page1 = new HtmlPagina();
    if (session.getAttribute("TIPO_USUARIO") != null) {
        page1.session=true;
    }
    page1.setPath(1);
    page1.setFreeHtml("<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\"> \n"+
  "<p align=\"center\"> \n"+
    "<input type=\"button\" name=\"bAdminVehicContratos\" id=\"bAdminVehicContratos\" value=\"Administrar vehículos y contratos\" /> \n"+
  "</p> \n"+
  "<p align=\"center\"> \n"+
    "<input type=\"button\" name=\"bRegVehicParticular\" id=\"bRegVehicParticular\" value=\"Registrar vehículos particulares\" /> \n"+
  "</p> \n"+
  "<p align=\"center\"> \n"+
    "<label for=\"atInfoCajero\">Información del cajero.<br /> \n"+
    "</label> \n"+
    "<textarea name=\"atInfoCajero\" id=\"atInfoCajero\" cols=\"45\" rows=\"5\"></textarea> \n"+
  "</p> \n"+
"</form> \n");
%>
<%=page1.getSource() %>
