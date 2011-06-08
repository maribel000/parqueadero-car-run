<%@page import="entity.LOGIN"%>
<%@include file="checksession.jsp"%>
<%@page import="Controller.LoginMgr"%>
<%

   String uname = request.getParameter("uname") == null ? "" : request.getParameter("uname");
   String passw = request.getParameter("passwd")== null ? "" : request.getParameter("passwd");
 
        LOGIN personLogin = new LOGIN();
           int tipoRol;
          /*Usuarios: pperez, jcperez,joseperez,mperez (Coo, Ca, Parq, Tes) */
           if (!uname.equals("")) {
              personLogin = LoginMgr.mgr.doLogin(uname, passw);
              tipoRol= Integer.parseInt(personLogin.IDROLPARQUEO);
           if (personLogin != null) {
                session.setAttribute("USUARIO", personLogin); //persona logueada
                 session.setAttribute("TIPO_ROL", tipoRol); //id del rol
              if(tipoRol==1)
                {
                response.sendRedirect("../Coordinador/index.jsp");
                }else if(tipoRol==2)
                        {
                         response.sendRedirect("../Cajero/indexCajero.jsp");
                       }else if(tipoRol==3)
                               {
                                response.sendRedirect("../Parqueador/IndexParq.jsp");
                             }else if(tipoRol==4)
                                     {
                                      response.sendRedirect("../Tesorero/index.jsp");
                                    }

            }
             else{ response.sendRedirect("LoginFormError.jsp");}
            }


       else { response.sendRedirect("LoginFormError.jsp");}
               
         
    
%>

