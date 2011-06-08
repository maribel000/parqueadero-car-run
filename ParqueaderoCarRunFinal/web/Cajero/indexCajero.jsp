<%-- 
    Document   : IndexCajero
    Created on : 13/05/2011, 11:17:05 PM
    Author     : eagle
--%>


<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page1 = new HtmlPagina();
   page1.session=true;
   page1.setTipodeSesion(Tipo_Usuario);
   HtmlBienvenida welc2= new HtmlBienvenida();
   welc2.setBienvenida("Juan Carlos","Perez","Cajero"); //falta leer el nombre
   page1.setFreeHtml(welc2.getBienvenida());
%>

<%=page1.getSource()%>
