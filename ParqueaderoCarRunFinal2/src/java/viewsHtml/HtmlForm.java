
package viewsHtml;

/**
 *  * @author eagle
 */
public class HtmlForm {
    
 private String form = "";   
    

    public String getForm(){
        form+="<tr>\n";
        form+="<label>";
        form+="<td colspan=\"2\"><div align=\"right\"><input type=\"submit\" name=\"idx\" id=\"idx\" value=\"Ingresar\" />";
        form+="</label></div></td>\n</tr></table>\n</form></center>\n";
        return form;
    }

    public void errorLogin(){
        form+="<tr>\n";
        form+="<td colspan=\"2\"><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>Error! Usuario o Password Errados</b></FONT></td>\n";
        form+="</tr>\n";
    }

    public String getFormSinBoton(){
        form+="</table></center>\n";
        return form;
    }
     
    public void HtmlBasicForm(String Nombre_Formulario, String Direccion, String Nombre_Tabla, String tam ){
        form="<center><form action="+Direccion+" method=\"post\" onSubmit="+"name="+Nombre_Formulario+" target=\"_self\">\n";
        form+="<table width=\""+tam+"\" height=\"110\" border=\"1\" cellspacing=\"1\" bordercolor=\"#FFFFFF\" bgcolor=\"#FF8C00\">\n";
        form+="<tr>\n";
        form+="<td colspan=\"2\"><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre_Tabla+"</b></FONT></td>\n";
        form+="</tr>\n";
    }

    public void HtmlSourceForm(String Nombre_Formulario, String Direccion, String Nombre_Tabla, String tam ){
        form="<center><form action="+Direccion+" method=\"post\" onSubmit="+"name="+Nombre_Formulario+" target=\"_self\">\n";
        form+="<table width=\""+tam+"\" height=\"30\" border=\"1\" cellspacing=\"1\" bordercolor=\"#87CEFA\" bgcolor=\"#FFFFFF\">\n";
        form+="<tr>\n";
        form+="<td colspan=\"4\"><b><FONT FACE=\"Verdana\" SIZE=1 COLOR=#87CEFA>"+Nombre_Tabla+"</b></FONT></td>\n";
        form+="</tr>\n";
    }

    public void addTextField(String Nombre, String Nombre_Text,String Max, String Value){
        if(Value==null)
            Value="";
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre+"</FONT></td>";
        form+="<td><label><input name="+Nombre_Text+" type=\"text\" id="+Nombre_Text+" size="+Max+" maxlength="+Max+" value='"+Value+"' /></label></td>";
        form+="</tr>";
    }

    public void addPaswdField(String Nombre, String Nombre_Text,String Max,String Value){
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre+"</FONT></td>";
        form+="<td><label><input name="+Nombre_Text+" type=\"password\" id="+Nombre_Text+" size="+Max+" maxlength="+Max+" value='"+Value+"' /></label></td>";
        form+="</tr>";
    }

    public void addLabelField(String a, String b, String c, String d){
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black>"+a+"</FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black>"+b+"</FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black>"+c+"</FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black>"+d+"</FONT></td>";
        form+="</tr>";
    }
    public void TituloContrato(){
        form+="<tr>";
        form+="<td><center><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=black>Numero Contrato</FONT></b></center></td>";
        form+="<td><center><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=black>Tipo</FONT></center></b></td>";
        form+="<td><center><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=black>Fecha Inicio</FONT></center></b></td>";
        form+="<td><center><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=black>Fecha Fin</FONT></center></b></td>";
        form+="</tr>";
    }

        public void TituloPersona(){
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Numero Contrato</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Nombres</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Apellidos</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Cedula</b></FONT></td>";
        form+="</tr>";
    }

       public void TituloTrabajador(){
      
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Cedula</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Nombres</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Apellidos</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Rol Parqueadero</b></FONT></td>";
        form+="</tr>";
    }


      public void TituloDatosP(){

        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Nombres</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Apellidos</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>E-mail</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=black><b>Telefono</b></FONT></td>";
        form+="</tr>";
    }


    public void addLabelFieldPersona(String Documento,String Nombre, String Apellido,String Rol){
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Documento+"</FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre+" "+Apellido+"</FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Rol+"</FONT></td>";
        form+="</tr>";
    }
    



     
  

    public void addOptionField(String Nombre){
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre+"</FONT></td>";
        form+="<td><label><select name=\"optionpanel\" id=\"optionpanel\"><option value=\"2\">Adminitrador</option><option value=\"3\">Trabajador</option><option value=\"4\">Otro Rol</option></select></label></td>";
        form+="</tr>";
    }
    
}
