<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page1 = new HtmlPagina();
    if (session.getAttribute("TIPO_USUARIO") != null) {
        page1.session=true;
    }
    //h.setTipodeSesion(Tipo_Usuario);
    page1.setPath(2);
    page1.setTipodeSesion(1);
    
    page1.setFreeHtml("<h1>Bienvenidos a Car Run</h1> \n"+
"<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\"> \n"+
  "<h2>Administrar contratos e informes</h2> \n"+
  "<table width=\"526\" border=\"0\"> \n"+
    "<tr>\n"+
      "<td width=\"275\" height=\"162\"><p>\n"+
        "<label for=\tBuscar3\">Buscar</label>\n"+
        "<input type=\"text\" name=\"tBuscar\" id=\"tBuscar3\" />\n"+
      "</p></td>\n"+
      "<td width=\"241\" rowspan=\"2\" align=\"left\"><p>\n"+
        "<input type=\"button\" name=\"bInfoContrato\" id=\"bInfoContrato\" value=\"Información Contrato\" />\n"+
      "</p>\n"+
      "<p>\n"+
        "<input type=\"button\" name=\"bEliminarContrato\" id=\"bEliminarContrato\" value=\"Eliminar Contrato\" />\n"+
      "</p>\n"+
      "<p>\n"+
        "<input type=\"button\" name=\"bCrearContrato\" id=\"bCrearContrato\" value=\"Crear contrato\" />\n "+
      "</p>\n"+
      "<p>\n"+
        "<input type=\"button\" name=\"bEditarClientesContratos\" id=\"bEditarClientesContratos\" value=\"Editar Clientes Contratos\" />\n"+
      "</p>\n"+
      "<p>\n"+
        "<input type=\"button\" name=\"bGenerarReporte\" id=\"bGenerarReporte\" value=\"GENERAR REPORTE\" />\n"+
      "</p></td>\n"+
    "</tr>\n"+
    "<tr>\n"+
      "<td height=\"22\" align=\"center\"><input type=\"button\" name=\"bGenerarRecibo\" id=\"bGenerarRecibo\" value=\"Generar Recibo\" /></td>\n"+
    "</tr>\n"+
  "</table>\n"+
  "<p id=\"AdminContrato\">\n"+
    "<label for=\"listaContratos\"></label>\n"+
    "<textarea name=\"listaContratos\" id=\"listaContratos\" cols=\"85\" rows=\"5\"></textarea>\n"+
  "</p>\n"+
"</form>\n");
%>

<%=page1.getSource()%>