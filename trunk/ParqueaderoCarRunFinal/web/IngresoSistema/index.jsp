<%--
    Document   : index
    Created on : May 17, 2011, 4:58:15 PM
    Author     : eagle
--%>

<%@page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina pag = new HtmlPagina();
   HtmlForm form1 = new HtmlForm();
    form1.HtmlFormulario("Login", "/ParqueaderoCarRunFinal/IngresoSistema/doLogin.jsp", "Ingreso a Car Run","300");
    form1.addTextField("Usuario :", "usuario", "20",null);
    form1.addPaswdField("Password:", "passwd", "20","");
    pag.setFreeHtml(form1.getForm());
    
%>

<%=pag.getSource()%>
