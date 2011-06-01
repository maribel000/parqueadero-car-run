<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina h = new HtmlPagina();
if (session.getAttribute("TIPO_USUARIO") != null) {
h.session=true;
}
h.setPath(1);
    //h.setTipodeSesion(Tipo_Usuario);
    h.setFreeHtml(" <h1> CONTACTO</h1> " +
            "<p>Si desea conocer más acerca del proyecto" +
            " visite nuestra página web:</p>" +
            "<a href=\"http://unr.sytes.net/dbd\">Grupo 2</a>");
%>

<%=h.getSource()%>
