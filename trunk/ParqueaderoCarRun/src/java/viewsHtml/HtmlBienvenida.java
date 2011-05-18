
package viewsHtml;

/**
 *
 * @author eagle
 */
public class HtmlBienvenida {
    
    
   private String x;
    public String getBienvenida(){
        return x;
    }

    public void setBienvenida(String Nombre,String Apellidos, String Rol){
        x="<Center><IMG SRC=\"/ParqueaderoCarRun/images/bienvenida.png\"><br><table width=\"500\" border=\"2\" bordercolor=\"#FFFFFF\" bgcolor=\"#FF8C00\">\n";
        x+="<tr>\n";
        x+="<td width=\"150\" ><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>Nombre</b></font></td>\n";
        x+="<td width=\"350\"><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Nombre+" "+Apellidos+"</font></td>\n";
        x+="</tr>\n";
        x+="<tr>\n";
        x+="<td width=\"150\" ><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>Rol</b></font></td>\n";
        x+="<td width=\"350\"><FONT FACE=\"Verdana\" SIZE=3 COLOR=white>"+Rol+"</font></td>\n";
        x+="</tr>\n";
        x+="</table></center>\n"; 
          
    
    }
      
    
    
    
    
    
}
