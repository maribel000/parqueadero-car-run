
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page1 = new HtmlPagina();
    HtmlForm f = new HtmlForm();
    page1.session=true;
    page1.setTipodeSesion(Tipo_Usuario);
    page1.setBotonContratosCoo(true);
    //f.HtmlBasicForm("Contratos", "", "Contratos Coordinador","400"); Implementar
    f.TituloContrato();

%>

<%=page1.getSource()%>
