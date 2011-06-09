

<%@page import="java.util.ArrayList"%>
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>
<%--@page import="Controller.viewContratoMgr"--%>
<%@page import="Controller.viewClienteMgr"%>



<%
    HtmlPagina page1 = new HtmlPagina(); //Listar  contratos
    HtmlForm form1 = new HtmlForm();
 
    page1.session=true;
    page1.setTipodeSesion(Tipo_Usuario);
    page1.setBotonContratosCoo(true);
    
     //ArrayList <VIEWCONTRATO> lst = viewContratoMgr.mgr.getListContratos();
     ArrayList <VIEWCLIENTE> cli= viewClienteMgr.mgr.getListClientes();
  
    page1.setFreeHtml(form1.getFormSinBoton());
      form1.HtmlSourceForm("Clientes", "", "Contratos Clientes","700");
      form1.TituloPersona();

      for (VIEWCLIENTE it : cli) {
          form1.addLabelField(it.NUMEROCOTRATO, it.NOMBRECLIENTE, it.APELLIDOCLIENTE, it.CEDULACLIENTE);
 }

   page1.setFreeHtml(form1.getFormSinBoton());

%>

<%=page1.getSource()%>
