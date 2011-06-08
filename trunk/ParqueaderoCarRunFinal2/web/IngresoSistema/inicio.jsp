
<%@include file="checksession.jsp"%>
<%@page import="viewsHtml.*"%>

<%
HtmlPagina page0 = new HtmlPagina();
if (session.getAttribute("TIPO_ROL") != null) {
page0.session=true;
}

  page0.setTipodeSesion(Tipo_Usuario);
  page0.setFreeHtml(" <FONT FACE=\"Verdana\" SIZE=3 COLOR=#87CEFA align=\"justify\" ><b> Parqueadero Car Run</b></font><br> " +
            "<p><FONT FACE=\"Verdana\" SIZE=3 COLOR=#C0C0C0>Este proyecto es una aplicaci&oacute;n web que sirve para la administraci&oacute;n del " +
            "parqueadero del mismo nombre. Fue desarrollado por UNDevelopment como proyecto final de la materia " +
            "Dise&ntilde;o de bases de datos, en la Universidad Nacional de Colombia" +".</font></p>");
%>

<%=page0.getSource()%>
