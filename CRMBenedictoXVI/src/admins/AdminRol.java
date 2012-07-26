package admins;

import crmbenedictoxvi.Modulo;
import crmbenedictoxvi.Rol;
import crmbenedictoxvi.Permiso;
import java.util.ArrayList;

public class AdminRol {
    
    AdminModulo amod = new AdminModulo();
    ArrayList<Modulo> dbMod = amod.tablaModulos();
//    Modulo clientes = dbMod.get(0);
//    Modulo adminroles = dbMod.get(1);
//    Modulo oportunidad = dbMod.get(2);
//    Modulo adminusers = dbMod.get(3);
    
    public ArrayList<Rol> tablaRoles(){
        Modulo clientes = this.dbMod.get(0);
        Modulo adminroles = this.dbMod.get(1);
        Modulo oportunidad = this.dbMod.get(2);
        Modulo adminusers = this.dbMod.get(3);
        ArrayList<Rol> roles = new ArrayList<Rol>();
        
        Permiso permiso = new Permiso(clientes, true, true, true, true);
        Rol rol = new Rol("Administrador", "Administrador del Sistema",permiso);
        roles.add(rol);
        
        permiso = new Permiso(adminroles, true, true, true, true);
        rol = new Rol("Administrador", "Administrador del Sistema",permiso);
        roles.add(rol);
        
        permiso = new Permiso(oportunidad, true, true, true, false);
        rol = new Rol("UsuarioVentas", "Usuario del Dpto de Ventas", permiso);
        roles.add(rol);
        
        permiso = new Permiso(adminusers, true, true, true, false);
        rol = new Rol("UsuarioVentas", "Usuario del Dpto de Ventas", permiso);
        roles.add(rol);
        
        return roles;
    }
    
    public Rol buscarRol (String name){
        Rol rol=null;
        ArrayList<Rol> dbRol = tablaRoles();
        for (Rol r : dbRol){
            if(r.getNombre().equals(name)){
                rol = r;
            }
        }
        
        return rol;
    }

    public Rol agregarRol(String name, String descrip, Permiso permiso) {
        ArrayList<Rol> roles = new ArrayList<Rol>();
        Rol rol = new Rol(name,descrip,permiso);
        roles.add(rol);
        return rol;
    }
    
    public String eliminarRol (String name) {
        Rol rol = null;
        ArrayList<Rol> dbRol = tablaRoles();
        String msg = ""; 
        for (Rol r : dbRol){
            if(r.getNombre().equals(name)){
                rol = r;
                msg = rol.getNombre();
                return "Se ha eliminado el rol " + msg;
            }
        }
        dbRol.remove(rol);
        
        return "NO Se ha eliminado ningun rol";
    }
    
}
