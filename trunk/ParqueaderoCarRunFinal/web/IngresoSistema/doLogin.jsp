<%@page import="entity.LOGIN"%>
<%@include file="checksession.jsp"%>
<%@page import="Controller.LoginMgr"%>
<%

   String uname = request.getParameter("uname") == null ? "" : request.getParameter("uname");
   String passw = request.getParameter("passwd")== null ? "" : request.getParameter("passwd");
 
        LOGIN person = new LOGIN();
          /*Usuarios: pperez, jcperez,joseperez,mperez (C, Ca, Pa, Tes) */
           if (!uname.equals("")) {
           person = LoginMgr.mgr.doLogin(uname, passw);
           if (person != null) {
              HttpSession sesionOK = request.getSession();
              sesionOK.setAttribute("rol", person.CEDULAUSUARIO);
              if(person.IDROLPARQUEO.equals("1"))
                {
                 response.sendRedirect("../Coordinador/index.jsp");
                }else if(person.IDROLPARQUEO.equals("2"))
                        {
                         response.sendRedirect("../Cajero/indexCajero.jsp");
                       }else if(person.IDROLPARQUEO.equals("3"))
                               {
                                response.sendRedirect("../Parqueador/IndexParq.jsp");
                             }else if(person.IDROLPARQUEO.equals("4"))
                                     {
                                      response.sendRedirect("../Tesorero/index.jsp");
                                    }

               System.out.println("soy diferente de null ");
                }
             else{ response.sendRedirect("LoginFormError.jsp");}
            }


       else { response.sendRedirect("LoginFormError.jsp");}
               
         
    
%>

