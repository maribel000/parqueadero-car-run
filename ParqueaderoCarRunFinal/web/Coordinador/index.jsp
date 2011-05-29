
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<% HtmlPagina page1 = new HtmlPagina();
    //h.session=true;
   // h.setTipodeSesion(1);
   HtmlBienvenida bi= new HtmlBienvenida();
  // bi.setBienvenida(login.getCedulausuario(),login.getCedulausuario(),login.getCedulausuario());
   page1.setFreeHtml(bi.getBienvenida() );
%>

<%=page1.getSource()%>
