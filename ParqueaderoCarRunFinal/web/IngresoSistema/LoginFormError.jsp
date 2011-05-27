<%-- 
    Document   : LoginFormError
    Created on : May 17, 2011, 6:33:58 PM
    Author     : eagle
--%>

<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina h = new HtmlPagina();
   HtmlForm f = new HtmlForm();
    f.HtmlFormulario("Login", "/ParqueaderoCarRunFinal/IngresoSistema/doLogin.jsp", "Ingreso al Sistema Car Run","300");
    f.addTextField("Usuario :", "usuario", "20",null);
    f.addPaswdField("Password:", "passwd", "20","");
    f.errorLogin();
    h.setFreeHtml(f.getForm());

%>

<%=h.getSource()%>
