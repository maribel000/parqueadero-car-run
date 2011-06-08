
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page1 = new HtmlPagina();
   page1.session=true;
   page1.setTipodeSesion(Tipo_Usuario);
   HtmlBienvenida welc1= new HtmlBienvenida();
   welc1.setBienvenida("Pedro","Perez","Coordinador"); //falta leer el nombre
   page1.setFreeHtml(welc1.getBienvenida() );
%>

<%=page1.getSource()%>
