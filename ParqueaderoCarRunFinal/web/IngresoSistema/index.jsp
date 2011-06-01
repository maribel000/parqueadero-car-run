
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<%  HtmlPagina pag = new HtmlPagina();
    HtmlForm form1 = new HtmlForm();
    form1.HtmlFormLogin("Login", "/ParqueaderoCarRunFinal/IngresoSistema/doLogin.jsp", "Ingreso a Car Run","300");
    form1.addTextField("Usuario :", "uname", "20",null);
    form1.addPaswdField("Password:", "passwd", "20","");
    pag.setPath(1);
    pag.setFreeHtml(form1.getForm());
%>

<%=pag.getSource()%>