package admins;

import crmbenedictoxvi.Modulo;
import java.util.ArrayList;

public class AdminModulo {
    private ArrayList<Modulo> modulos = new ArrayList<Modulo>();
    
    public ArrayList<Modulo> tablaModulos() {
        
        
        Modulo modulo0 = new Modulo(1001, "Clientes");
        modulos.add(modulo0);
        Modulo modulo1 = new Modulo(1002, "Administracion de Roles");
        modulos.add(modulo1);
        Modulo modulo2 = new Modulo(1003, "Oportunidad");
        modulos.add(modulo2);
        Modulo modulo3 = new Modulo(1004, "Administracion de Usuarios");
        modulos.add(modulo3);
        
        //modulos.add(modulo0);
        //modulos.add(modulo1);
        //modulos.add(modulo2);
        //modulos.add(modulo3);
        
        return modulos;
        
    }

    public  ArrayList<Modulo> getModulos() {
        return modulos;
    }    
    
}
