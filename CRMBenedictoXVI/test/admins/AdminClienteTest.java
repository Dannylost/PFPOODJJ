
package admins;

import junit.framework.Assert;
import org.junit.Test;


public class AdminClienteTest {
    
    AdminCliente admCliente = new AdminCliente();
    
    
//    @Test
//    public void validarElFuncionamientoDelBotonBuscarPorNombre(){
//    
//        String validar = admCliente.buscarClientePorNombre("Luis");
//        System.out.println(validar);
//        Assert.assertEquals("Luis", validar);
//    }
//    
//    @Test
//    public void validarElFuncionamientoDelBotonBuscarPorApellidoPaterno(){
//    
//        
//        String validar = admCliente.buscarClientePorApellidoPaterno("Angulo");
//        System.out.println(validar);
//        Assert.assertEquals("Angulo", validar);
//    }
//    
//    @Test
//    public void validarElFuncionamientoDelBotonBuscarPorApellidoMaterno(){
//    
//        
//        String validar = admCliente.buscarClientePorApellidoMaterno("Paredes");
//        System.out.println(validar);
//        Assert.assertEquals("Paredes", validar);
//    }
//    
//    @Test
//    public void validarElFuncionamientoDelBotonBuscarPorCorreo(){
//    
//        
//        String validar = admCliente.buscarClientePorCorreo("dpastor@gmail.com");
//        System.out.println(validar);
//        Assert.assertEquals("dpastor@gmail.com", validar);
//    }
//    
//    @Test
//    public void validarElFuncionamientoDelBotonBuscarPorDNI(){
//    
//        
//        String validar = admCliente.buscarClientePorDNI("59038572");
//        System.out.println(validar);
//        Assert.assertEquals("59038572", validar);
//    }
//    
//    
//    @Test
//    public void validarElFuncionamientoDelBotonBuscarPorTelefono(){
//    
//        
//        String validar = admCliente.buscarClientePorTelefono("2258849");
//        System.out.println(validar);
//        Assert.assertEquals("2258849", validar);
//    }
//    
//    @Test
//    public void validarElFuncionamientoDelBotonBuscarPorFechaDeContacto(){
//    
//        String validar = admCliente.buscarClientePorFecha("19/04/2012");
//        System.out.println(validar);
//        Assert.assertEquals("19/04/2012", validar);
//    }
//    
//    @Test
//    public void validarElFuncionamientoDelBotonNuevo(){
//        
//        int validar = admCliente.agregarCliente("Cesar", "Meneses", "Medina", "cmeneses@gmail.com", "70670398", "5337667", "10/03/2012", "no");
//        Assert.assertEquals(0, validar);
//    }
//    
//    @Test
//      public void validarElFuncionamientoDelBotonEliminar(){
//        
//        int validar = admCliente.eliminarCliente("59038572");
//        Assert.assertEquals(1, validar);
//    }
    
    @Test
    public void validarElFuncionamientoDelBotonConvertir(){
        
        String validar = admCliente.convertirACliente("28374957");
        Assert.assertEquals("c", validar);
        
        
        
    }
}
