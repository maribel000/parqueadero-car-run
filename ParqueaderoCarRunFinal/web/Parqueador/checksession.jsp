<%@page session="true"%>
<%@page import="entity.*"%>
<%
    Integer Tipo_Usuario;
    LOGIN login;
     if (session.getAttribute("TIPO_ROL") == null) {
     Tipo_Usuario = 0;
     login = null; 
    }else{
         Tipo_Usuario = (Integer) session.getAttribute("TIPO_ROL");
         login = (LOGIN) session.getAttribute("USUARIO");
    }
%>