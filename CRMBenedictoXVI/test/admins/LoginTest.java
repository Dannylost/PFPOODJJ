package admins;

import crmbenedictoxvi.Usuario;
import junit.framework.Assert;
import org.junit.Test;


public class LoginTest {
    
    AdminUsuario admin = new AdminUsuario();
    
    @Test
    public void testDeLoginValidandoUsuarioYContrasenyaEnLaBD() {
        String user = "jvaldivia";
        String pass = "12345";
        
        admin.loginUser(user, pass);
        Assert.assertEquals(true, admin.isResultado());
    }
    
    @Test
    public void testDeLoginValidandoUsuarioYContrasenyaNoNulos() {
        String user = "jvaldivia";
        String pass = "12345";
        
        admin.loginUser(user,pass);
        Assert.assertEquals(true, admin.isResultado());
    }
    
    
//    @Test
//    public void validarNombreDeUsuario(){
//        Usuario user = new Usuario("123", "Jam", "Valdivia", "Campos", "jvaldivia", "jvaldivia@benedicto.com", "24/07/2012", "JefeVentas", "Admin", "123");
//        Assert.failNotEquals("Usted debe Ingresar cuenta", "jvaldivia", user.getUsername());
//        
//    }
}
