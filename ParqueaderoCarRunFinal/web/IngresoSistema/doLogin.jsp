<%@page import="entity.LOGIN"%>
<%@page import="Controller.LoginMgr"%>
<%

   String uname = request.getParameter("uname") == null ? "" : request.getParameter("uname");
   String passw = request.getParameter("passwd")== null ? "" : request.getParameter("passwd");
 
        LOGIN person = new LOGIN();
        if (!uname.equals("")) {
           person = LoginMgr.mgr.doLogin(uname, passw);
           if (person != null) {
               //response.sendRedirect("../Cajero/indexCajero.jsp");
              // HttpSession sesionOK = request.getSession();
               // session.setAttribute("USUARIO", login);
               // if(tipoLogin==1){
                //response.sendRedirect("../Coordinador/index.jsp");
                //}else if(tipoLogin==2){
                 //}else if(tipoLogin==3){
                //response.sendRedirect("../Parqueador/index.jsp");
               // }else if(tipoLogin==4){
                //response.sendRedirect("../Tesorero/index.jsp");
               System.out.println("soy diferente de null ");
                }
             else{ response.sendRedirect("LoginFormError.jsp");}
            }


       // else { response.sendRedirect("LoginFormError.jsp");}
               
         
    
%>

