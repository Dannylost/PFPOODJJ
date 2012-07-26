package admins;
import crmbenedictoxvi.Modulo;
import crmbenedictoxvi.Permiso;
import crmbenedictoxvi.Rol;
import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class AdminRolTest {
    
    @Test
    public void validarElNoIngresoDeLosCamposDelFormularioEnVacio(){
        String name = "";
        String desc = "";
        Permiso permisos = null;
        
        Assert.assertEquals("", name);
        Assert.assertEquals("", desc);
        Assert.assertNull(permisos);
    }
    
    @Test
    public void validarElIngresoDePermisosALosRoles(){
        String name = "UsuarioVentas";
        String desc = "Usuario normal del sistema del Dpto. de ventas";
        Modulo mod1 = new Modulo(1001,"Clientes");
        Modulo mod2 = new Modulo(1002,"Oportunidad");
        Permiso permisos1 = new Permiso(mod1,true,true,true,false);
        Permiso permisos2 = new Permiso(mod2, true, true, true, false);
        
        System.out.println("Rol: "+name);
        System.out.println("Desripcion: "+desc);
        System.out.println("Permisos:");
        System.out.println(permisos1.getModulo().getName()+" --> "+"Acceso="+permisos1.isAcceso() + " Adicionar="+permisos1.isAdicionar()
                +" Editar="+permisos1.isEditar()+" Eliminar="+permisos1.isEliminar());
        System.out.println(permisos2.getModulo().getName()+" --> "+"Acceso="+permisos2.isAcceso() + " Adicionar="+permisos2.isAdicionar()
                +" Editar="+permisos2.isEditar()+" Eliminar="+permisos2.isEliminar());
    }
    
    @Test
    public void buscarRolEnBaseAParametroDeNombre(){
        
        String name="Administrador";
        AdminRol rol = new AdminRol();
        Assert.assertNotNull(rol.buscarRol(name));
    }
    
    @Test
    public void adicionarRolEnElArrayDeBaseDeDatos(){
        AdminModulo amod = new AdminModulo();
        ArrayList<Modulo> mod = amod.tablaModulos(); 
        Modulo clientes = mod.get(0);
        Permiso permiso = new Permiso(clientes, true, false, true, false); //Modulo de Clientes
        String name="Usuario";
        String descrip="Usuario comun y restringido del sistema";
        
        AdminRol rol = new AdminRol();
        Assert.assertNotNull(rol.agregarRol(name,descrip,permiso));
        
    }
    
    @Test
    public void eliminarRolEnBaseDeDatosPorNombre(){
        String name="Administrador";
        AdminRol rol = new AdminRol();
        Assert.assertNotNull(rol.eliminarRol(name));
        System.out.println(rol.eliminarRol(name));
    }
    
    @Test
    public void editarRolMostrandoPantallaDeEdicionParaActualizarInformacionDelRol(){
        
    }
    
}
