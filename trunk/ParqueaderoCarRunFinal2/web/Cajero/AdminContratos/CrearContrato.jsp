<%-- 
    Document   : CrearContrato
    Created on : May 18, 2011, 4:51:00 AM
    Author     : eagle
--%>


<%@page import="viewsHtml.HtmlForm"%>
<%@page import="viewsHtml.HtmlPagina"%>
<%@include file="checksession.jsp"%>
<%@page import="viewHtml.*"%>
<%@page import="entity.VIEWCLIENTE"%>
<%@page import="entity.VIEWCONTRATO"%>
<%@page import="Controller.viewClienteMgr"%>



<%

    HtmlPagina page1 = new HtmlPagina();
    HtmlForm form1 = new HtmlForm();
    page1.session=true;
    page1.setTipodeSesion(Tipo_Usuario);


 VIEWCLIENTE client = new VIEWCLIENTE();
 //VIEWCONTRATO cont= new VIEWCONTRATO();

 form1.HtmlSourceForm("Crear Cliente", "/ParqueaderoCarRunFinal2/Cajero/AdminContratos/CrearContrato.jsp", "Crear Nuevo cliente","500");
 form1.addTextSourceField("Cedula :", "CEDULACLIENTE", "40",null);
 form1.addTextSourceField("Nombres :", "NOMBRECLIENTE", "40",null);
 form1.addTextSourceField("Apellidos :", "APELLIDOCLIENTE", "40",null);
 form1.addTextSourceField("Telefono:", "TELEFONOCLIENTE", "40",null);

 page1.setFreeHtml(form1.getFormSource());


client.CEDULACLIENTE = request.getParameter("CEDULACLIENTE") == null ? "" : request.getParameter("CEDULACLIENTE");
client.NUMEROCOTRATO="2";
client.NOMBRECLIENTE = request.getParameter("NOMBRECLIENTE") == null ? "" : request.getParameter("NOMBRECLIENTE");
client.APELLIDOCLIENTE = request.getParameter("APELLIDOCLIENTE") == null ? "" : request.getParameter("APELLIDOCLIENTE");
client.TELEFONOCLIENTE = request.getParameter("TELEFONOCLIENTE") == null ? "" : request.getParameter("TELEFONOCLIENTE");

viewClienteMgr.mgr.execute(client.getUpdateSql());


%>

<%=page1.getSource()%>

