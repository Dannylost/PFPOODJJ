
package admins;

import crmbenedictoxvi.Cliente;
import crmbenedictoxvi.Prospecto;
import java.util.ArrayList;


public class AdminCliente {
    
    public ArrayList<Cliente> datos= new ArrayList<Cliente>();
    
    public ArrayList<Cliente> tablaDeClientes() {
        this.datos.add(new Cliente("Hernan", "Gonzales", "Pardo", "hgonzales@gmail.com", "75687692", "3852312", "23/02/2012", "no"));
        this.datos.add(new Cliente("Daniel", "Pastor", "Paredes", "dpastor@gmail.com", "74378343", "2643768", "19/04/2012", "yes"));
        this.datos.add(new Cliente("Luis", "Angulo", "Mesa", "langulo@gmail.com", "59038572", "2258849", "12/06/2012", "no"));
        return datos;
    }
    
    private String cadena;
    private String cadena2;
    private String resultBusqueda = "";
    private int indice;
    ArrayList<Cliente> db_Temp = new ArrayList<Cliente>();
    ArrayList<Cliente> db_Temp2 = new ArrayList<Cliente>();
    
    public String buscarClientePorNombre(String name){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeClientes();
        
        //##########################INGRESO_VACIO###################
        if(name.equals("")){
            name = "No busque nada";
            resultBusqueda = "Debe ingresar datos a buscar";
        }
        //##########################CONVIRTIENDO A MAYUSCULA################################
        cadena = name.substring(0,1).toUpperCase() + name.substring(1, name.length());
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String NombreBuscado = datos.get(i).getName();
           
                if (NombreBuscado.equals(cadena)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getName();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR NOMBRE MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
    
    
    public String buscarClientePorApellidoPaterno(String surname1){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeClientes();
        
        //##########################INGRESO_VACIO###################
        if(surname1.equals("")){
            surname1 = "No busque nada";
            resultBusqueda = "Debe ingresar datos a buscar";
        }
        //##########################CONVIRTIENDO A MAYUSCULA################################
        cadena = surname1.substring(0,1).toUpperCase() + surname1.substring(1, surname1.length());
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String PaternoBuscado = datos.get(i).getSurname1();
           
                if (PaternoBuscado.equals(cadena)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getSurname1();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR APELLIDO PATERNO MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
    
    
    public String buscarClientePorApellidoMaterno(String surname2){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeClientes();
        
        //##########################INGRESO_VACIO###################
        if(surname2.equals("")){
            surname2 = "No busque nada";
            resultBusqueda = "Debe ingresar datos a buscar";
        }
        //##########################CONVIRTIENDO A MAYUSCULA################################
        cadena = surname2.substring(0,1).toUpperCase() + surname2.substring(1, surname2.length());
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String MaternoBuscado = datos.get(i).getSurname2();
           
                if (MaternoBuscado.equals(cadena)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getSurname2();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR APELLIDO MATERNO MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
    
    public String buscarClientePorCorreo(String mail){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeClientes();
        
        //##########################INGRESO_VACIO###################
        if(mail.equals("") || !mail.contains("@")){
            mail = "No busque nada";
            return resultBusqueda = "Debe ingresar datos a buscar y asegurese que el campo correo este bien escrito";
        }
        
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String MailBuscado = datos.get(i).getMail();
           
                if (MailBuscado.equals(mail)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getMail();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR MAIL MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
    
    public String buscarClientePorDNI(String DNI){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeClientes();
        //##########################INGRESO_VACIO###################
        if(DNI.equals("")){
            DNI = "No busque nada";
            return resultBusqueda = "Debe ingresar datos a buscar";
        }
        
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String DNIBuscado = datos.get(i).getDNI();
           
                if (DNIBuscado.equals(DNI)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getDNI();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR DNI MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
    
    public String buscarClientePorTelefono(String telefono){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeClientes();
        //##########################INGRESO_VACIO###################
        if(telefono.equals("")){
            telefono = "No busque nada";
            return resultBusqueda = "Debe ingresar datos a buscar";
        }
        
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String TelefonoBuscado = datos.get(i).getTelefono();
           
                if (TelefonoBuscado.equals(telefono)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getTelefono();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR TELEFONO MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
    
    public String buscarClientePorFecha(String fecha){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeClientes();
        //##########################INGRESO_VACIO###################
        if(fecha.equals("")){
            fecha = "No busque nada";
            return resultBusqueda = "Debe ingresar datos a buscar";
        }
        
        int longitud = datos.size();
            for(int i = 0; i<longitud;i++){
            
                String FechaBuscado = datos.get(i).getContact_date();
           
                if (FechaBuscado.equals(fecha)){
                
                    db_Temp.add(datos.get(i));
                    
                resultBusqueda = datos.get(i).getContact_date();
                
                }
            }
                if (db_Temp.size()>0){
                    for (int j=0; j<db_Temp.size();j++){
                        System.out.println("SU BÚSQUEDA POR FECHA DE CONTACTO MUESTRA LOS SIGUIENTES RESULTADOS\t" + "\n");
                        mostrar(j);
                    }
                }else{
                resultBusqueda = "No se encontraron registros para los filtros ingresados";
                }
        return resultBusqueda;    
    }
    
    public int agregarCliente(String name, String surname1, String surname2, String mail, String DNI, String telefono, String contact_date, String transaccion) {
        
        boolean Nocaracter = validarFormato(name);
        boolean Nocaracter2 = validarFormato(surname1);
        int condicion = 0;
        
        //###########Validando existe como prospecto o como cliente?############
        
        tablaDeClientes();
       
        for (Cliente cliente : datos){
            if(cliente.getDNI().equals(DNI)){
                condicion = 1;
                System.out.println("El prospecto ya existe");
            }
        }
       
        //Refactorizado name.equals("") || surname1.equals("") || surname2.equals("")
        if (Nocaracter == true || Nocaracter2==true || mail.isEmpty()){
            System.out.println("Hay un error en el ingreso de los campos: 'Nombre', 'Email' o 'Apellido Paterno'" + "\n" + "Recuerde que estos campos son mandatorios");
            condicion = 1;
        }
        //Si el prospecto ya existe entonces "condicion" será igual a 1 y no ingresará en la sentencia "if"
        //Ahora agregaremos el usuario:
        if(condicion == 0){
            Cliente nuevoCliente = new Cliente(name, surname1, surname2, mail, DNI, telefono, contact_date, transaccion);
            datos.add(nuevoCliente);
            System.out.println("\n" + "CLIENTE AGREGADO CORRECTAMENTE" + "\n" + "Los datos agregados se muestran a continuación:" + "\n");
            System.out.println("DNI: \t" + "\t" + "\t" + DNI);
            System.out.println("Nombre: \t" + "\t" + name);
            System.out.println("Apellido Paterno: \t" + surname1);
            System.out.println("Apellido Materno: \t" + surname2);
            System.out.println("Email: \t" + "\t" + "\t" + mail);
            System.out.println("Fecha de contacto: \t" + contact_date);
            System.out.println("Telefono: \t" + "\t" + telefono);
            System.out.println("\n" + "---------------------------------");
        }else {
            
            System.out.println("El cliente no ha sido agregado");
        }
        
        return condicion;
    }
    
    public boolean validarFormato(String vIngreso){
        
        if (vIngreso.isEmpty()){
            return true;
        }
        
        for(int i = 0; i < vIngreso.length(); i++){
            if(!((vIngreso.charAt(i) > 64 && vIngreso.charAt(i) < 91) || (vIngreso.charAt(i) > 96 && vIngreso.charAt(i) < 123))){
                return true;
            }
        }
        return false;
    }
    
    
    public int eliminarCliente(String DNI){
        ArrayList<Cliente>dbTemp=new ArrayList<>();
        int condicion = 0;
        dbTemp=tablaDeClientes();
        
        for(int i = 0; i < dbTemp.size();i++){
            
            String valorEliminar = dbTemp.get(i).getDNI();
            String valorTransaccion = dbTemp.get(i).getTransaccion();
            
            if(valorEliminar.equals(DNI)){

                if(dbTemp.get(i).getTransaccion().equalsIgnoreCase("yes")){
                    condicion = 0;
                    
                }else {
                System.out.println("\n" +"REGISTRO ELIMINADO" + "\n" + "El registro " + "'" + datos.get(i).getName() + "'" + "con DNI: " + datos.get(i).getDNI() + " ha sido eliminado satisfactoriamente" + "\n");
                condicion = 1;
                dbTemp.remove(i);
                datos=dbTemp;
                }

            }
        
        }
        if(condicion == 0){    
            System.out.println("El usuario con DNI: " + "'" + DNI + "'" + " no ha sido eliminado, ya que tiene transacciones hechas");
        } 
        return condicion;
    }
    
    public String convertirACliente(String DNI){
        String confirmacion = "";
        AdminProspecto nuevoADMPRO = new AdminProspecto();
        ArrayList<Cliente>dbTempCliente=new ArrayList<Cliente>();
        ArrayList<Prospecto>dbTempProspecto=new ArrayList<Prospecto>();
        ArrayList<Prospecto>dbTraspaso=new ArrayList<Prospecto>();
        
        int condicion = 0;
        dbTempCliente=tablaDeClientes();
        
        AdminProspecto admP = new AdminProspecto();
        dbTempProspecto = admP.tablaDeProspectos();
        
        for(int i = 0; i < dbTempProspecto.size();i++){
            
            String valorEliminar = dbTempProspecto.get(i).getDNI();
                if(valorEliminar.equals(DNI)){
                    dbTraspaso.add(dbTempProspecto.get(i));
                    String nuevoNombre = dbTraspaso.get(0).getName();
                    String nuevoPaterno = dbTraspaso.get(0).getSurname1();
                    String nuevoMaterno = dbTraspaso.get(0).getSurname2();
                    String nuevoMail = dbTraspaso.get(0).getMail();
                    String nuevoDNI = dbTraspaso.get(0).getDNI();
                    String nuevoTelefono = dbTraspaso.get(0).getTelefono();
                    String nuevaFecha = dbTraspaso.get(0).getContact_date();
                    String nuevaTransaccion = "yes";
                    
                    agregarCliente(nuevoNombre, nuevoPaterno, nuevoMaterno, nuevoMail, nuevoDNI, nuevoTelefono, nuevaFecha, nuevaTransaccion);
                    
                System.out.println("El registro " + "'" + dbTempProspecto.get(i).getName() + "'" + "con DNI: " + dbTempProspecto.get(i).getDNI() + " ha sido convertido satisfactoriamente");
                confirmacion = "c";
                condicion = 1;
                dbTempProspecto.remove(i);
                
                }
                
        }return confirmacion;
        
        //return confirmacion;
        
    }
    
    
    public void mostrar(int indice){
        tablaDeClientes();
        
        System.out.println("DNI: \t" + "\t" + "\t" + db_Temp.get(indice).getDNI());
        System.out.println("Nombre: \t" + "\t" + db_Temp.get(indice).getName());
        System.out.println("Apellido Paterno: \t" + db_Temp.get(indice).getSurname1());
        System.out.println("Apellido Materno: \t" + db_Temp.get(indice).getSurname2());
        System.out.println("Email: \t" + "\t" + "\t" + db_Temp.get(indice).getMail());
        System.out.println("Fecha de contacto: \t" + db_Temp.get(indice).getContact_date());
        System.out.println("Telefono: \t" + "\t" + db_Temp.get(indice).getTelefono());
        System.out.println("Transacción: \t" + "\t" + db_Temp.get(indice).getTransaccion());
        System.out.println("\n" + "---------------------------------");
    }
    
    
    
}
