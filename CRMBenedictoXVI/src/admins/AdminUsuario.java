package admins;

import crmbenedictoxvi.Usuario;
import java.util.ArrayList;

public class AdminUsuario {
    
    private ArrayList<Usuario> data= new ArrayList<Usuario>();

    public ArrayList<Usuario> getData() {
        return data;
    }
    
    
    private void tablaDeUsuarios() {
        this.data.add(new Usuario("45434413", "Jorge", "Pereira", "Lopez", "jpereira", "jpereira@upc.com", "12/04/2012", "Asistente de RRHH", "usuario", "a1b2c3"));
        this.data.add(new Usuario("47254512", "Helen", "Alva", "Marquez", "halva", "halva@upc.com", "24/05/2012", "Analista de RRHH", "usuario", "123456"));
    
    }
    
   
//    public boolean NotDelete(boolean s){
//        if(s==false){
//            return true;
//        }
//        return false;
//    }
    
    
}
