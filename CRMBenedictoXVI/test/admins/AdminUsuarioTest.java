package admins;

import crmbenedictoxvi.Usuario;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.BeforeClass;

public class AdminUsuarioTest {
    
    AdminUsuario admin = new AdminUsuario();
    
    @Test
    public void testDeLoginValidandoUsuarioYContrasenyaEnLaBD() {
        String user = "jpereira";
        String pass = "a1b2c3";
        
        admin.loginUser(user, pass);
        
    }
    
    @Test
    public void testDeLoginValidandoUsuarioYContrasenyaNoNulos() {
        String user = "";
        String pass = "";
        
        admin.loginUser(user,pass);
        
    }
    
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
        boolean move = false;
    
    Usuario user = new Usuario(code, name, surname1, surname2, username, mail, date, position, rol, pass);
    
    @Test
    public void ValidarQueElCodigoSeaMandatorio(){
        
        Assert.assertNotSame("", user.getCode());
    }
    
    @Test
    public void ValidarQueElNombreSeaMandatorio(){
        
        Assert.assertNotSame("", user.getName());
    }
    
    @Test
    public void ValidarQueElApellidoPaternoSeaMandatorio(){
        
        Assert.assertNotSame("", user.getSurname1());
    }
    
    @Test
    public void ValidarQueElApellidoMaternoSeaMandatorio(){
        
        Assert.assertNotSame("", user.getSurname2());
    }
    
    @Test
    public void ValidarQueElNombreDeUsuarioSeaMandatorio(){
        
        Assert.assertNotSame("", user.getUsername());
    }
    
    @Test
    public void ValidarQueElMailSeaMandatorio(){
        
        Assert.assertNotSame("", user.getMail());
    }
    
    @Test
    public void ValidarQueLaFechaDeIngresoSeaMandatoria(){
        
        Assert.assertNotSame("", user.getDate());
    }
    
    @Test
    public void ValidarQueLaPosiciónSeaMandatoria(){
        
        Assert.assertNotSame("", user.getPosition());
    }
    
    @Test
    public void ValidarQueElRolSeaMandatorio(){
        
        Assert.assertNotSame("", user.getRol());
    }
    
    @Test
    public void ValidarQueElPasswordSeaMandatorio(){
        
        Assert.assertNotSame("", user.getPass());
    }
    
    @Test
    public void ValidarQueElUsuarioNoSePuedaEliminarSiYaHaRealizadoAlgunaTransaccion(){
        
        Assert.assertEquals(true, user.isMove());
        
        
//        if(user.isMove()==true){
//            System.out.println("El usuario no puede ser eliminado");
//        }else{
//            System.out.println("Usuario eliminado");
//        }
        
        //Assert.assertNotSame("", user.getName());
    }
    
//    @Test
//    public void ValidarQueElBotonAgregarSoloRealizaEstaAccionCuandoTodosLosCamposSonLlenados(){
//        
//        
//    }
    
}
