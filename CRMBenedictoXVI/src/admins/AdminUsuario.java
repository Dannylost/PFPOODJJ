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
        this.data.add(new Usuario("13307922", "Helen", "Alva", "Marquez", "halva", "halva@upc.com", "24/05/2012", "Analista de RRHH", "usuario", "123456"));
        this.data.add(new Usuario("70480792", "Eddie", "Jaime", "Diaz", "ejaimed", "ejaimed@gmail.com", "25/07/2012", "Ventas", "UsuarioComun", "qwer1234"));
    }

    public boolean isResultado() {
        return resultado;
    }
    
    
    public int agregarUsuario(String code, String name, String surname1, String surname2, String username, String mail, String date, String position, String rol, String pass){
        
        int condicion = 0;
        //Validando si usuario existe
        tablaDeUsuarios();
        for (Usuario Usuario : data){
            if(Usuario.getCode().equals(code)){
                condicion = 1;
                System.out.println("El usuario ya existe");
                
            }
        }
        //Si el usuaio ya existe entonces "condicion" será igual a 1 y no ingresará en la sentencia "if"
        //Ahora agregaremos el usuario
        if(condicion == 0){
            Usuario nuevoUsuario = new Usuario(code, name, surname1, surname2, username, mail, date, position, rol, pass);
            data.add(nuevoUsuario);
            System.out.println("Usuario agregado correctamente");
        }else {
            
            System.out.println("El usuario no se agregó");
        }
        
        return condicion;
        
    }
    
    public String buscarUsuariosPorCode(String code){
        
        String resultBusqueda = "No se encuentra registro";
        tablaDeUsuarios();
        for(int i = 0; i<data.size();i++){
            String codeBuscado = data.get(i).getCode();
            if (codeBuscado.equals(code)){
                resultBusqueda = data.get(i).getCode();
                System.out.println("SU BÚSQUEDA POR CÓDIGO MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                System.out.println("Código: \t" + "\t" + data.get(i).getCode());
                System.out.println("Nombre: \t" + "\t" + data.get(i).getName());
                System.out.println("Apellido Paterno: \t" + data.get(i).getSurname1());
                System.out.println("Apellido Materno: \t" + data.get(i).getSurname2());
                System.out.println("Nombre de usuario: \t" + data.get(i).getUsername());
                System.out.println("Email: \t" + "\t" + "\t" + data.get(i).getMail());
                System.out.println("Fecha de ingreso: \t" + data.get(i).getDate());
                System.out.println("Cargo: \t" + "\t" + "\t" + data.get(i).getPosition());
                System.out.println("Rol: \t" + "\t" + "\t" + data.get(i).getRol());
                
                
            }else{
                resultBusqueda = "La busqueda no produjo ningún resultado";
            }
        }
        return resultBusqueda;
    }

    
    public String buscarUsuariosPorNombre(String name){
        String cadena;
        String resultBusqueda = "No se encuentra registro";
        tablaDeUsuarios();
        cadena = name.substring(0,1).toUpperCase() + name.substring(1, name.length());
        for(int i = 0; i<data.size();i++){
            String NombreBuscado = data.get(i).getName();
            
            if (NombreBuscado.equals(cadena)){
                resultBusqueda = data.get(i).getName();
                System.out.println("SU BÚSQUEDA POR NOMBRE MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                System.out.println("Código: \t" + "\t" + data.get(i).getCode());
                System.out.println("Nombre: \t" + "\t" + data.get(i).getName());
                System.out.println("Apellido Paterno: \t" + data.get(i).getSurname1());
                System.out.println("Apellido Materno: \t" + data.get(i).getSurname2());
                System.out.println("Nombre de usuario: \t" + data.get(i).getUsername());
                System.out.println("Email: \t" + "\t" + "\t" + data.get(i).getMail());
                System.out.println("Fecha de ingreso: \t" + data.get(i).getDate());
                System.out.println("Cargo: \t" + "\t" + "\t" + data.get(i).getPosition());
                System.out.println("Rol: \t" + "\t" + "\t" + data.get(i).getRol());
                
                
            }else{
                resultBusqueda = "La busqueda por nombre no produjo ningún resultado";
            }
        }
        return resultBusqueda;
    }

//    public boolean isResultado() {
//        return resultado;
//    }
    
    
    public int ValidarUserName(String username){
        int condicion = 0;
        tablaDeUsuarios();
        for(Usuario Usuario:data){
            if(Usuario.getUsername().equals(username)){
                condicion = 1;
                System.out.println(username + " No está disponible");
            }
            
        }
        if(condicion == 0){
            System.out.println("'"+username+"'" + " NOMBRE DE USUARIO DISPONIBLE");
        }
        
        return condicion;
    }
    
    
    public boolean validarEliminar(boolean move){
       boolean movimiento;
                if(move == false){
                System.out.println("El registro puede ser eliminado");
                movimiento = true;
                }else{
                    movimiento = false;
                    System.out.println("El registro no puede ser eliminado, ya que tiene transacciones realizadas");
                }
        return movimiento;
    }
    
    
    public int eliminarUsuario(String code){
        
        int condicion = 0;
        tablaDeUsuarios();
        
        for(int i = 0; i < data.size();i++){
            
            String valorEliminar = data.get(i).getCode();
            
                
                if(valorEliminar.equals(code)){
                System.out.println("El registro " + "'" + data.get(i).getName() + "'" + " ha sido eliminado satisfactoriamente");
                condicion = 1;
                data.remove(i);
            }
      
        }
        if(condicion == 0){
            
            System.out.println("El usuario con código: " + "'" + code + "'" + " no ha sido eliminado");
        }
           
        return condicion;
    }
    
//    public String Editar(String tipo,String cambiar, String code){
//        String resultBusqueda = "";
//        Usuario nuevoUsuario = new Usuario(code);
//        tablaDeUsuarios();
//        for(int i = 0; i<data.size();i++){
//            String codeBuscado = data.get(i).getCode();
//            if (codeBuscado.equals(code)){
//                resultBusqueda = data.get(i).getCode();
//                switch (tipo){
//                    
//                    case "Nombre" : data.set(i, nuevoUsuario):break;
//                    
//                }
//                
//            }else{
//                resultBusqueda = "La busqueda no produjo ningún resultado";
//            }
//        }
//        return resultBusqueda;
//    }
    
    
    
    
    
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

