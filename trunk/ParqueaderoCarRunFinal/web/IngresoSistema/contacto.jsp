<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina h = new HtmlPagina();
if (session.getAttribute("TIPO_USUARIO") != null) {
h.session=true;
}
    h.setTipodeSesion(Tipo_Usuario);
    h.setFreeHtml(" <FONT FACE=\"Verdana\" SIZE=4><b> CONTACTO</b></font><br> " +
            "<p><FONT FACE=\"Verdana\" SIZE=3>Si desea conocer más acerca del proyecto" +
            " visite nuestra página web:</font></p><br><br>" +
            " <FONT FACE=\"Verdana\" SIZE=4><a href='http://unr.sytes.net/dbd'>Grupo 2</font> </a>");
%>

<%=h.getSource()%>
