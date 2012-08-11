package admins;

import crmbenedictoxvi.Usuario;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.BeforeClass;

public class AdminUsuarioTest {
    
    
    
        String code = "u70480792";
        String name = "Johns";
        String surname1 = "Rivas";
        String surname2 = "Gómez";
        String username = "jorgito";
        String mail = "jrivas@upc.edu.pe";
        String date = "12/08/1984";
        String position = "Ejecutivo de Ventas";
        String rol = "usuario";
        String pass = "loki123";
        boolean move = true;
    
    Usuario user = new Usuario(code, name, surname1, surname2, username, mail, date, position, rol, pass);
    
    AdminUsuario admUser = new AdminUsuario();
    
    
    @Test
    public void ValidarQueElCodigoSeaMandatorio(){
        
        Assert.assertNotSame("Debe ingresar un código","", user.getCode());
    }
    
    @Test
    public void ValidarQueElNombreSeaMandatorio(){
        
        Assert.assertNotSame("Debe ingresar un nombre","", user.getName());
    }
    
    @Test
    public void ValidarQueElApellidoPaternoSeaMandatorio(){
        
        Assert.assertNotSame("Debe ingresar Apellido Materno","", user.getSurname1());
    }
    
    @Test
    public void ValidarQueElApellidoMaternoSeaMandatorio(){
        
        Assert.assertNotSame("Debe ingresar Apellido Materno","", user.getSurname2());
    }
    
    @Test
    public void ValidarQueElNombreDeUsuarioSeaMandatorio(){
        
        Assert.assertNotSame("Debe ingresar Nombre de Usuario","", user.getUsername());
    }
    
    @Test
    public void ValidarQueElMailSeaMandatorio(){
        
        Assert.assertNotSame("Debe ingresar una dirección de correo","", user.getMail());
    }
    
    @Test
    public void ValidarQueLaFechaDeIngresoSeaMandatoria(){
        
        Assert.assertNotSame("Debe ingresar fecha de ingreso","", user.getDate());
    }
    
    @Test
    public void ValidarQueLaPosiciónSeaMandatoria(){
        
        Assert.assertNotSame("Debe ingresar el cargo que tiene el usuario","", user.getPosition());
    }
    
    @Test
    public void ValidarQueElRolSeaMandatorio(){
        
        Assert.assertNotSame("Debe ingresar el rol del usuario","", user.getRol());
    }
    
    @Test
    public void ValidarQueElPasswordSeaMandatorio(){
        
        Assert.assertNotSame("El password no debe estar en blanco","", user.getPass());
    }
    
    @Test
    public void ValidarQueElUsuarioNoSePuedaEliminarSiYaHaRealizadoAlgunaTransaccion(){
        //Si move es igual a True quiere decir que el usuario ha hecho transacciones.
        //por tanto no puede ser eliminado
        boolean validar = admUser.validarEliminar(true);
        Assert.assertEquals(false, validar);
    }
    
    @Test
    public void ValidarElFuncionamientoBotonAgregar(){
        int validar = admUser.agregarUsuario("70480791", "Alonso", "Jaime", "Gómez", "ajaime", "ajaime@gmail.com", "25/07/2012", "Finanzas", "UsuarioComun", "admin1234");
        Assert.assertEquals(0, validar);
        
    }
    
    @Test
    public void ValidarElFuncionamientoDelBotonBuscarPorCodigo(){
        String validar = admUser.buscarUsuariosPorCode("70480792");
        System.out.println(validar);
        Assert.assertEquals("70480792", validar);
        
    }
    
    @Test
    public void ValidarElFuncionamientoDelBotonBuscarporNombre(){
        String validar = admUser.buscarUsuariosPorNombre("eddie");
        System.out.println(validar);
        Assert.assertEquals("Eddie", validar);
        
    }
    
    @Test
    public void ValidarQueElNombreDeUsuarioEsteDisponible(){
        int validar = admUser.ValidarUserName("ajaimeg");
        Assert.assertEquals(0, validar);
        
    }
    
    @Test
    public void ValidarQueElUsuarioRequeridoHaSidoEliminado(){
        int validar = admUser.eliminarUsuario("70480792");
        Assert.assertEquals(1, validar);
        
    }
    
    @Test
    public void ValidarEdicionDeDatos(){
        String validar = admUser.editarUsuario("70480792", "PRUEBAAAA", "Jaime", "Gonzales", "ejaimed", "ejaimed@gmail.com", "25/07/2012", "Ventas", "UsuarioComun", "qwer1234");
        
        Assert.assertNotNull(validar);
        System.out.println(validar);
    }
}
        

