
package admins;

import crmbenedictoxvi.Prospecto;
import crmbenedictoxvi.Cliente;
import java.util.ArrayList;


public class AdminProspecto {
    
    private ArrayList<Prospecto> datos= new ArrayList<Prospecto>();
    private String cadena;
    private String cadena2;
    private String resultBusqueda = "";
    private int indice;
    AdminCliente clientes = new AdminCliente();
    ArrayList<Cliente> db_Cliente= new ArrayList<Cliente>();
    ArrayList<Prospecto> db_Temp = new ArrayList<Prospecto>();
    
    public ArrayList<Prospecto> tablaDeProspectos() {
        this.datos.add(new Prospecto("Eddie", "Jaime", "Gomez", "ejaime@gmail.com", "70480792", "4851812", "10/07/2012"));
        this.datos.add(new Prospecto("Jam", "Valdivia", "Campos", "jvaldivia@gmail.com", "46837452", "6873498", "08/06/2012"));
        this.datos.add(new Prospecto("Daniel", "Ramos", "Rafael", "drafael@gmail.com", "28374957", "3572849", "25/05/2012"));
        this.datos.add(new Prospecto("Daniel", "Cuadros", "Gomez", "dcuadros@gmail.com", "2575957", "8432863", "02/06/2012"));
        return datos;
    }
    
    public String buscarProspectoPorNombre(String name){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeProspectos();
        
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

    public String buscarProspectoPorApellidoPaterno(String surname1){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeProspectos();
        
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
    
    public String buscarProspectoPorApellidoMaterno(String surname2){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeProspectos();
        
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
    
    public String buscarProspectoPorCorreo(String mail){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeProspectos();
        
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
    
    public String buscarProspectoPorDNI(String DNI){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeProspectos();
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
    
    public String buscarProspectoPorTelefono(String telefono){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeProspectos();
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
    
    public String buscarProspectoPorFecha(String fecha){
        
        //##########################CARGA_BASE DE DATOS#############
        tablaDeProspectos();
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

    public void mostrar(int indice){
        tablaDeProspectos();
        
        System.out.println("DNI: \t" + "\t" + "\t" + db_Temp.get(indice).getDNI());
        System.out.println("Nombre: \t" + "\t" + db_Temp.get(indice).getName());
        System.out.println("Apellido Paterno: \t" + db_Temp.get(indice).getSurname1());
        System.out.println("Apellido Materno: \t" + db_Temp.get(indice).getSurname2());
        System.out.println("Email: \t" + "\t" + "\t" + db_Temp.get(indice).getMail());
        System.out.println("Fecha de contacto: \t" + db_Temp.get(indice).getContact_date());
        System.out.println("Telefono: \t" + "\t" + db_Temp.get(indice).getTelefono());
        System.out.println("\n" + "---------------------------------");
    }

    public int agregarProspecto(String name, String surname1, String surname2, String mail, String DNI, String telefono, String contact_date) {
        
        boolean Nocaracter = validarFormato(name);
        boolean Nocaracter2 = validarFormato(surname1);
        boolean Nocaracter3 = validarFormato(mail);
        
        int condicion = 0;
        
        //###########Validando existe como prospecto o como cliente?############
        
        tablaDeProspectos();
        db_Cliente = clientes.tablaDeClientes();
     
        for (Prospecto prospecto : datos){
            if(prospecto.getDNI().equals(DNI)){
                condicion = 1;
                System.out.println("El prospecto ya existe");
            }
        }
        
        for (Cliente cliente : db_Cliente){
            if(cliente.getDNI().equals(DNI)){
                condicion = 1;
                System.out.println("No puede crear este Prospecto puesto que ya es un Cliente");
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
            Prospecto nuevoProspecto = new Prospecto(name, surname1, surname2, mail, DNI, telefono, contact_date);
            datos.add(nuevoProspecto);
            System.out.println("\n" + "PROSPECTO AGREGADO CORRECTAMENTE" + "\n" + "Los datos agregados se muestran a continuación:" + "\n");
            System.out.println("DNI: \t" + "\t" + "\t" + DNI);
            System.out.println("Nombre: \t" + "\t" + name);
            System.out.println("Apellido Paterno: \t" + surname1);
            System.out.println("Apellido Materno: \t" + surname2);
            System.out.println("Email: \t" + "\t" + "\t" + mail);
            System.out.println("Fecha de contacto: \t" + contact_date);
            System.out.println("Telefono: \t" + "\t" + telefono);
            System.out.println("\n" + "---------------------------------");
        }else {
            
            System.out.println("El prospecto no ha sido agregado");
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
    
    
    public int eliminarProspecto(String DNI){
        
        int condicion = 0;
        tablaDeProspectos();
        
        for(int i = 0; i < datos.size();i++){
            
            String valorEliminar = datos.get(i).getDNI();
                if(valorEliminar.equals(DNI)){
                System.out.println("El registro " + "'" + datos.get(i).getName() + "'" + "con DNI: " + datos.get(i).getDNI() + " ha sido eliminado satisfactoriamente");
                condicion = 1;
                datos.remove(i);
            }
      
        }
        if(condicion == 0){
            
            System.out.println("El usuario con DNI: " + "'" + DNI + "'" + " no ha sido eliminado");
        }
           
        return condicion;
    }
    
    
    public int actualizarProspecto(String name, String surname1, String surname2, String mail, String DNI, String telefono, String contact_date){
        int validar=0;
        Prospecto p = new Prospecto(name, surname1, surname2, mail, DNI, telefono, contact_date);
        System.out.println(p.getName());
        String busqueda = buscarProspectoPorDNI(DNI);
        
        int index = datos.indexOf(p);
        System.out.println(index);
        
        
        
        
        return validar;
    }
    
    
    
    
    
    
}
