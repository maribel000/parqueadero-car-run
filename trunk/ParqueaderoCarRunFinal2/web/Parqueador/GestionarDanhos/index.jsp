<%-- 
    Document   : index
    Created on : Jun 7, 2011, 8:08:12 PM
    Author     : eagle
--%>


<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page1 = new HtmlPagina();
    HtmlForm f = new HtmlForm();
    page1.session=true;
    page1.setTipodeSesion(Tipo_Usuario);
    page1.setBotonDanhosParq(true);
    //f.HtmlBasicForm("Contratos", "", "Contratos Coordinador","400"); Implementar
   // f.TituloContrato();

%>

<%=page1.getSource()%>
