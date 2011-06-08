<%-- 
    Document   : index
    Created on : Jun 6, 2011, 12:41:33 AM
    Author     : eagle
--%>

<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page2 = new HtmlPagina();
    HtmlForm form2 = new HtmlForm();
    page2.session=true;
    page2.setTipodeSesion(Tipo_Usuario);
    page2.setBotonUsuariosCoo(true);
    //f.HtmlBasicForm("Usuarios", "", "Trabajadores","400"); Implementar
    form2.TituloContrato();

%>

<%=page2.getSource()%>
