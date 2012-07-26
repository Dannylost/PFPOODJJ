package admins;

import crmbenedictoxvi.Usuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class AdminUsuario {
    
    private ArrayList<Usuario> data= new ArrayList<Usuario>();
    private boolean resultado;

    public ArrayList<Usuario> getData() {
        return data;
    }
    
    
    private void tablaDeUsuarios() {
        this.data.add(new Usuario("45434413", "Jorge", "Pereira", "Lopez", "jpereira", "jpereira@upc.com", "12/04/2012", "Asistente de RRHH", "usuario", "a1b2c3"));
        this.data.add(new Usuario("47254512", "Helen", "Alva", "Marquez", "halva", "halva@upc.com", "24/05/2012", "Analista de RRHH", "usuario", "123456"));
        this.data.add(new Usuario("47254513", "Jam", "Valdivia", "Campos", "jvaldivia", "jvaldivia@upc.com", "31/03/2012", "Analista de Red", "usuario", "12345"));
    
    }

    public boolean isResultado() {
        return resultado;
    }
    
    
    public void loginUser(String user, String pass) {
        int cond=0;
        
        if (user.equals("") || pass.equals("")){
            System.out.println("No Ha ingresado Usuario y/o contraseña...");
            //cond=1;
            //return false;
            resultado = false;
        } else {
            
            tablaDeUsuarios();
            for (int i = 0; i < this.data.size(); i++){
            String uname=data.get(i).getUsername();
            String pwd=data.get(i).getPass();
            if (user.equals(uname)){
                if (pass.equals(pwd)){
                    System.out.println("Ingreso Correcto");
                    resultado = true;
                    cond=1;
                    break;
                    
                } else {
                    System.out.println("Contraseña Incorrecta");
                    cond=1;
                    resultado = false;
                    break;
                }
                
            } 
            
            }
            if (cond == 0){
                System.out.println("No existe el usuario ingresado...");
                //return false;
            }
        }
          
    }
    
}