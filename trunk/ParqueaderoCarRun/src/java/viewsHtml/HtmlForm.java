
package viewsHtml;

/**
 *
 * @author eagle
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

    public void HtmlFormulario(String Nombre_Formulario, String Direccion, String Nombre_Tabla,String Dim ){
        form="<center><form action="+Direccion+" method=\"get\" name="+Nombre_Formulario+" target=\"_self\">\n";
        form+="<table width=\""+Dim+"\" height=\"110\" border=\"1\" cellspacing=\"1\" bordercolor=\"#FFFFFF\" bgcolor=\"#FF8C00\">\n";
        form+="<tr>\n";
        form+="<td colspan=\"2\"><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre_Tabla+"</b></FONT></td>\n";
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

    public void addLabelField(String Nombre, String Value){
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre+"</FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Value+"</FONT></td>";
        form+="</tr>";
    }
    
    
    public void addLabelFieldPersona(String Documento,String Nombre, String Apellido,String Rol){
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Documento+"</FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre+" "+Apellido+"</FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Rol+"</FONT></td>";
        form+="</tr>";
    }
    
    public void TituloPersona(){
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white><b>DOCUMENTO</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white><b>NOMBRES</b></FONT></td>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white><b>ROL</b></FONT></td>";
        form+="</tr>";
    }
    
  

    public void addOptionField(String Nombre){
        form+="<tr>";
        form+="<td><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre+"</FONT></td>";
        form+="<td><label><select name=\"optionpanel\" id=\"optionpanel\"><option value=\"2\">Adminitrador</option><option value=\"3\">Trabajador</option><option value=\"4\">Otro Rol</option></select></label></td>";
        form+="</tr>";
    }
    
}
