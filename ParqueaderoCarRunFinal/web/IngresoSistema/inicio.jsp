<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page0 = new HtmlPagina();
if (session.getAttribute("TIPO_USUARIO") != null) {
page0.session=true;
}
    //h.setTipodeSesion(Tipo_Usuario);
page0.setPath(1);
 page0.setFreeHtml("<h1>Parqueadero CarRun</h1>" +
            "<p>Es una aplicacion web que sirve para la administración del "+ 
            "parqueadero del mismo nombre. Fue desarrollado por UNDevelopment "+ 
            "como proyecto final de la materia Diseño de bases de datos, "+
            "en la Universidad Nacional de Colombia.</p>\n"+
            "<p>Visita <a href=\"http://unr.sytes.net/dbd/\" title=\"DBD UNAL\">nuestro sitio web</a> para más información.</p>");
%>

<%=page0.getSource()%>
<%%>