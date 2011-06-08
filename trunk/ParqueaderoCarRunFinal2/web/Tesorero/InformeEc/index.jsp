<%-- 
    Document   : index
    Created on : Jun 8, 2011, 2:21:32 AM
    Author     : eagle
--%>

<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page2 = new HtmlPagina();
    HtmlForm form2 = new HtmlForm();
    page2.session=true;
    page2.setTipodeSesion(Tipo_Usuario);
    page2.setBotonInformeTes(true);
    //f.HtmlBasicForm("Usuarios", "", "Trabajadores","400"); Implementar
    form2.TituloContrato();

%>

<%=page2.getSource()%>