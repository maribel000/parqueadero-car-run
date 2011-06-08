<%-- 
    Document   : index
    Created on : Jun 7, 2011, 6:33:06 PM
    Author     : eagle
--%>


<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page1 = new HtmlPagina();
    HtmlForm f = new HtmlForm();
    page1.session=true;
    page1.setTipodeSesion(Tipo_Usuario);
    page1.setBotonContratosCaj(true);
    //f.HtmlBasicForm("Contratos", "", "Contratos Cajero (a)","400"); Implementar
    f.TituloContrato();

%>

<%=page1.getSource()%>
