
<%@include file="checksession.jsp"%>
<%@page import="conection.*"%>
<%
String uname = request.getParameter("usuario");
String passw = request.getParameter("passwd");
        
             requestLogin newLogin = new requestLogin();
             login =  newLogin.BuscarLogin(uname, passw);
            
            int tipoLogin;
            if (login == null) {
               // tipoLogin = newLogin.getTipoPerfil(login);
                tipoLogin=1;
                session.setAttribute("TIPO_USUARIO",tipoLogin);
                session.setAttribute("USUARIO", login);
                if(tipoLogin==1){
                response.sendRedirect("../Coordinador/index.jsp");
                }else if(tipoLogin==2){
                response.sendRedirect("../Cajero/index.jsp");
                }else if(tipoLogin==3){
                response.sendRedirect("../Parqueador/index.jsp");
                }else if(tipoLogin==4){
                response.sendRedirect("../Tesorero/index.jsp");
                }
            } else {
               
                 //response.sendRedirect("../Coordinador/index.jsp");
                
                 response.sendRedirect("LoginFormError.jsp");
    }
%>
   