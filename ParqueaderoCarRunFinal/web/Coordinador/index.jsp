<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina h = new HtmlPagina();
    h.session=true;
    h.setTipodeSesion(1);
   HtmlBienvenida bi= new HtmlBienvenida();
   bi.setBienvenida(login.getCedulausuario(),login.getCedulausuario(),login.getCedulausuario());
   h.setFreeHtml(bi.getBienvenida() );
%>

<%=h.getSource()%>
