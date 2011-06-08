<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina h = new HtmlPagina();
if (session.getAttribute("TIPO_ROL") != null) {
h.session=true;
}

    h.setTipodeSesion(Tipo_Usuario);
    h.setFreeHtml(" <FONT FACE=\"Verdana\" SIZE=4 color=#87CEFA><b> CONTACTO</b></font><br> " +
            "<p><FONT FACE=\"Verdana\" SIZE=3 color=#C0C0C0>Si desea conocer mas acerca de la creacion de esta pagina" +
            " haga click en el siguiente link:</font></p>" +
            " <FONT FACE=\"Verdana\" SIZE=4><a href='http://unr.sytes.net/dbd'>Grupo 2</font> </a>");
%>

<%=h.getSource()%>
