package admins;

import crmbenedictoxvi.Modulo;
import crmbenedictoxvi.Rol;
import crmbenedictoxvi.Permisos;
import java.util.ArrayList;

public class AdminRol {
    
    //private ArrayList<Rol> rol = new ArrayList<>();
    
    public ArrayList<Rol> tablaRoles(){
        ArrayList<Rol> roles = new ArrayList<Rol>();
        
        Modulo modulo = new Modulo(1001, "Clientes");
        Permisos permiso = new Permisos(modulo, true, true, true, true);
        Rol rol = new Rol("Administrador", "Administrador del Sistema",permiso);
        roles.add(rol);
        modulo = new Modulo(1002, "Administracion de Roles");
        permiso = new Permisos(modulo, true, true, true, true);
        rol = new Rol("Administrador", "Administrador del Sistema",permiso);
        roles.add(rol);
        
        modulo = new Modulo(1003, "Oportunidad");
        permiso = new Permisos(modulo, true, true, true, false);
        rol = new Rol("UsuarioVentas", "Usuario del Dpto de Ventas", permiso);
        roles.add(rol);
        modulo = new Modulo(1001, "Clientes");
        permiso = new Permisos(modulo, true, true, true, false);
        rol = new Rol("UsuarioVentas", "Usuario del Dpto de Ventas", permiso);
        roles.add(rol);
        
        return roles;
    }
}
