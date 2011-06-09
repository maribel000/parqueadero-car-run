<%-- 
    Document   : CrearUsuarios
    Created on : 16/05/2011, 06:53:42 PM
    Author     : eagle
--%>



<%@page import="viewsHtml.HtmlForm"%>
<%@page import="viewsHtml.HtmlPagina"%>
<%@include file="checksession.jsp"%>
<%@page import="viewHtml.*"%>
<%@page import="entity.VIEWUSUARIOSISSTEMA"%>
<%@page import="Controller.viewUsuarioSistemaMgr"%>

<%


HtmlPagina page1 = new HtmlPagina();
    HtmlForm form1 = new HtmlForm();
    page1.session=true;
    page1.setTipodeSesion(Tipo_Usuario);


 VIEWUSUARIOSISSTEMA us = new VIEWUSUARIOSISSTEMA();
 //VIEWCONTRATO cont= new VIEWCONTRATO();

 form1.HtmlSourceForm("Crear Cliente", "/ParqueaderoCarRunFinal2/Coordinador/AdministrarUsuarios/CrearUsuarios.jsp", "Crear Nuevo cliente","500");
 form1.addTextSourceField("Cedula :", "CEDULACLIENTE", "40",null);
 form1.addTextSourceField("Nombres :", "NOMBRECLIENTE", "40",null);
 form1.addTextSourceField("Apellidos :", "APELLIDOCLIENTE", "40",null);
 form1.addTextSourceField("Telefono:", "TELEFONOCLIENTE", "40",null);

 page1.setFreeHtml(form1.getFormSource());


us.NOMBREUSUARIO = request.getParameter("NOMBREUSUARIO") == null ? "" : request.getParameter("NOMBREUSUARIO");
us.APELLIDOUSUARIO= request.getParameter("APELLIDOUSUARIO") == null ? "" : request.getParameter("APELLIDOUSUARIO");
us.CEDULAUSUARIO = request.getParameter("CEDULAUSUARIO") == null ? "" : request.getParameter("CEDULAUSUARIO");
us.IDROLPARQUEO = request.getParameter("IDROLPARQUEO") == null ? "" : request.getParameter("IDROLPARQUEO");
us.TELEFONOUSUARIO = request.getParameter("TELEFONOUSUARIO") == null ? "" : request.getParameter("TELEFONOUSUARIO");
us.E_MAIL = request.getParameter("E_MAIL") == null ? "" : request.getParameter("E_MAIL");

viewUsuarioSistemaMgr.mgr.execute(us.getUpdateSql());


%>

<%=page1.getSource()%>






















