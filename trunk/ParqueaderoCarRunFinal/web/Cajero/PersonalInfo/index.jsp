<%-- 
    Document   : index
    Created on : Jun 5, 2011, 10:52:02 PM
    Author     : eagle
--%>

<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page0 = new HtmlPagina();
   // HtmlForm form1 = new HtmlForm();
    page0.session=true;
    page0.setTipodeSesion(Tipo_Usuario);
    page0.setBotonDatosPersonales(true);
   // form1.HtmlBasicForm("datospersonales", "", "Datos Personales","300");
    //form1.addLabelField("Nombre :", login.getPersonaidPersona().getNombre());
    //form1.addLabelField("Apellidos :", login.getPersonaidPersona().getApellidos());
    //form1.addLabelField("Documento :", login.getPersonaidPersona().getIdPersona());
    //form1.addLabelField("Direccion :", login.getPersonaidPersona().getDireccion());
    //form1.addLabelField("Email :", login.getPersonaidPersona().getEmail());
    //form1.addLabelField("Telefono :", login.getPersonaidPersona().getTelefono());
   // page0.setFreeHtml(form1.getFormSinBoton());

%>

<%=page0.getSource()%>