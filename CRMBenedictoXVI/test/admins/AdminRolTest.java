package admins;
import crmbenedictoxvi.Modulo;
import crmbenedictoxvi.Permisos;
import crmbenedictoxvi.Rol;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class AdminRolTest {
    
    @Test
    public void validarElNoIngresoDeLosCamposDelFormularioEnVacio(){
        String name = "";
        String desc = "";
        Permisos permisos = null;
        
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
        Permisos permisos1 = new Permisos(mod1,true,true,true,false);
        Permisos permisos2 = new Permisos(mod2, true, true, true, false);
        
        System.out.println("Rol: "+name);
        System.out.println("Desripcion: "+desc);
        System.out.println("Permisos:");
        System.out.println(permisos1.getModulo().getName()+" --> "+"Acceso="+permisos1.isAcceso() + " Adicionar="+permisos1.isAdicionar()
                +" Editar="+permisos1.isEditar()+" Eliminar="+permisos1.isEliminar());
        System.out.println(permisos2.getModulo().getName()+" --> "+"Acceso="+permisos2.isAcceso() + " Adicionar="+permisos2.isAdicionar()
                +" Editar="+permisos2.isEditar()+" Eliminar="+permisos2.isEliminar());
    }
}
