<%-- 
    Document   : index
    Created on : Jun 5, 2011, 10:52:02 PM
    Author     : eagle
--%>

<%@page import="java.util.ArrayList"%>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>
<%@page import="Controller.viewUsuarioSistemaMgr"%>

<% HtmlPagina page0 = new HtmlPagina();
    HtmlForm form1 = new HtmlForm();
    page0.session=true;
    page0.setTipodeSesion(Tipo_Usuario);
    page0.setBotonDatosPersonales(true);
    ArrayList  <VIEWUSUARIOSISSTEMA> us = viewUsuarioSistemaMgr.mgr.getListDaP("2");

      form1.HtmlSourceForm("Datos personales", "", "Datos Personales","300");
      form1.TituloDatosP();
      for (VIEWUSUARIOSISSTEMA it : us) {
           form1.addLabelField(it.NOMBREUSUARIO, it.APELLIDOUSUARIO, it.E_MAIL, it.TELEFONOUSUARIO);
       }

    page0.setFreeHtml(form1.getFormSinBoton());
   

%>

<%=page0.getSource()%>