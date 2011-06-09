<%-- 
    Document   : CrearReporte
    Created on : May 18, 2011, 4:59:40 AM
    Author     : eagle
--%>

<%@page import="viewsHtml.HtmlForm"%>
<%@page import="viewsHtml.HtmlPagina"%>
<%@include file="checksession.jsp"%>
<%@page import="entity.VIEWDANHOS"%>
<%@page import="Controller.viewDanhosMgr"%>

<%

 HtmlPagina page1 = new HtmlPagina();
 HtmlForm form1 = new HtmlForm();
 page1.session=true;
 page1.setTipodeSesion(Tipo_Usuario);

 VIEWDANHOS client = new VIEWDANHOS();

 form1.HtmlSourceForm("Crear Reporte", "/ParqueaderoCarRunFinal2/Parqueador/GestionarDanhos/CrearReporte.jsp", "Crear Reorte de da&ntilde;os","500");
 form1.addTextSourceField("Placa :", "PLACA", "50",null);
 form1.addTextSourceField("Fecha Reg.(D/M/Y) :", "FECHAREGDANHOS", "50",null);
 form1.addTextSourceField("Hora Registro :", "HORAREGDANHOS", "50",null);
 form1.addTextSourceField("Lista de da&ntilde;os", "LISTADANHOS", "50",null);

 page1.setFreeHtml(form1.getFormSource());



client.PLACA = request.getParameter("PLACA") == null ? "" : request.getParameter("PLACA");
//client.NUMEROCOTRATO="1";
client.FECHAREGDANHOS = request.getParameter("FECHAREGDANHOS") == null ? "" : request.getParameter("FECHAREGDANHOS");
client.HORAREGDANHOS = request.getParameter("HORAREGDANHOS") == null ? "" : request.getParameter("HORAREGDANHOS");
client.LISTADANHOS = request.getParameter("LISTADANHOS") == null ? "" : request.getParameter("LISTADANHOS");

viewDanhosMgr.mgr.execute(client.getUpdateSql());



%>
<%=page1.getSource()%>