<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page0 = new HtmlPagina();
if (session.getAttribute("TIPO_USUARIO") != null) {
page0.session=true;
}
    //h.setTipodeSesion(Tipo_Usuario);

 page0.setFreeHtml(" <FONT FACE=\"Verdana\" SIZE=3 COLOR=#87CEFA><b> Parqueadero CarRun</b></font><br> " +
            "<p><FONT FACE=\"Verdana\" SIZE=3 COLOR=#C0C0C0>Este proyecto es una aplicacion web que sirve para la administración del " +
            "parqueadero del mismo nombre. Fue desarrollado por Raúl Villabona Suárez como proyecto final de la materia " +
            "Diseño de bases de datos, en la Universidad Nacional de Colombia" +".</font></p>");



%>

<%=page0.getSource()%>
