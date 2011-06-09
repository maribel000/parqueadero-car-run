<%-- 
    Document   : index
    Created on : Jun 6, 2011, 12:41:33 AM
    Author     : eagle
--%>

<%@page import="java.util.ArrayList"%>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>
<%@page import="Controller.viewUsuarioSistemaMgr"%>

<% HtmlPagina page2 = new HtmlPagina();
    HtmlForm form1 = new HtmlForm();
    page2.session=true;
    page2.setTipodeSesion(Tipo_Usuario);
    page2.setBotonUsuariosCoo(true);
    form1.HtmlSourceForm("Trabajadores", "", "Trabajadores del Parqueadero","700");
    form1.TituloTrabajador();
    ArrayList <VIEWUSUARIOSISSTEMA> u= viewUsuarioSistemaMgr.mgr.getListUsuarios();
    for (VIEWUSUARIOSISSTEMA it : u) {
          form1.addLabelField(it.CEDULAUSUARIO, it.NOMBREUSUARIO, it.APELLIDOUSUARIO, it.IDROLPARQUEO);
   }

   page2.setFreeHtml(form1.getFormSinBoton());
   

%>

<%=page2.getSource()%>
