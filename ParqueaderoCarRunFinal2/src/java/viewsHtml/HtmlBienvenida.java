
package viewsHtml;

/**
 *
 * @author eagle
 */
public class HtmlBienvenida {
    
    
   private String sc;
    public String getBienvenida(){
        return sc;
    }

    public void setBienvenida(String Nombre,String Apellidos, String Rol){
        sc="<Center><IMG SRC=\"/ParqueaderoCarRunFinal2/images/bienvenida.png\"><br><table width=\"500\" border=\"1\" bordercolor=\"#87CEFA\" bgcolor=\"#FFFFFF\"><br>\n";
        sc+="<tr>\n";
        sc+="<td width=\"150\" ><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=#87CEFA>Nombre</b></font></td>\n";
        sc+="<td width=\"350\"><FONT FACE=\"Verdana\" SIZE=3 COLOR=#87CEFA>"+Nombre+" "+Apellidos+"</font></td>\n";
        sc+="</tr>\n";
        sc+="<tr>\n";
        sc+="<td width=\"150\" ><b><FONT FACE=\"Verdana\" SIZE=3 COLOR=#87CEFA>Rol</b></font></td>\n";
        sc+="<td width=\"350\"><FONT FACE=\"Verdana\" SIZE=3 COLOR=#87CEFA>"+Rol+"</font></td>\n";
        sc+="</tr>\n";
        sc+="</table></center>\n";
          
    
    }
      
    
    
    
    
    
}
