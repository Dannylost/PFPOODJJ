
package admins;

import junit.framework.Assert;
import org.junit.Test;


public class AdminProspectoTest {
    
    
    @Test
    public void validarElFuncionamientoDelBotonBuscarPorNombre(){
    
        AdminProspecto admProspecto = new AdminProspecto();
        String validar = admProspecto.buscarProspectoPorNombre("Eddie");
        System.out.println(validar);
        Assert.assertEquals("Eddie", validar);
    }
    
    @Test
    public void validarElFuncionamientoDelBotonBuscarPorApellidoPaterno(){
        AdminProspecto admProspecto = new AdminProspecto();
        String validar = admProspecto.buscarProspectoPorApellidoPaterno("Jaime");
        System.out.println(validar);
        Assert.assertEquals("Jaime", validar);
    }
    
    @Test
    public void validarElFuncionamientoDelBotonBuscarPorApellidoMaterno(){
        AdminProspecto admProspecto = new AdminProspecto();
        String validar = admProspecto.buscarProspectoPorApellidoMaterno("Gomez");
        System.out.println(validar);
        Assert.assertEquals("Gomez", validar);
    }
    
    @Test
    public void validarElFuncionamientoDelBotonBuscarPorCorreo(){
        AdminProspecto admProspecto = new AdminProspecto();
        String validar = admProspecto.buscarProspectoPorCorreo("ejaime@gmail.com");
        System.out.println(validar);
        Assert.assertEquals("ejaime@gmail.com", validar);
    }
    
    @Test
    public void validarElFuncionamientoDelBotonBuscarPorDNI(){
        AdminProspecto admProspecto = new AdminProspecto();
        String validar = admProspecto.buscarProspectoPorDNI("70480792");
        System.out.println(validar);
        Assert.assertEquals("70480792", validar);
    }
    
    @Test
    public void validarElFuncionamientoDelBotonBuscarPorTelefono(){
        AdminProspecto admProspecto = new AdminProspecto();
        String validar = admProspecto.buscarProspectoPorTelefono("4851812");
        System.out.println(validar);
        Assert.assertEquals("4851812", validar);
    }
    
    @Test
    public void validarElFuncionamientoDelBotonBuscarPorFechaDeContacto(){
        AdminProspecto admProspecto = new AdminProspecto();
        String validar = admProspecto.buscarProspectoPorFecha("25/05/2012");
        System.out.println(validar);
        Assert.assertEquals("25/05/2012", validar);
    }
    

    @Test
    public void validarElFuncionamientoDelBotonNuevo(){
        AdminProspecto admProspecto = new AdminProspecto();
        int validar = admProspecto.agregarProspecto("Pablo", "Pinto", "Monzon", "pmonzon@gmail.com", "70470371", "5443465", "02/02/2012");
        Assert.assertEquals(0, validar);
    }
    
      @Test
      public void validarElFuncionamientoDelBotonEliminar(){
        AdminProspecto admProspecto = new AdminProspecto();
        int validar = admProspecto.eliminarProspecto("70480792");
        Assert.assertEquals(1, validar);
    }
      
      @Test
      public void validarElFuncionamientoDelBotonActualizar(){
        AdminProspecto admProspecto = new AdminProspecto();
        int validar = admProspecto.actualizarProspecto("Daniel", "Ramos", "Rafael", "drafael@gmail.com", "28374957", "3572849", "25/05/2012");
        Assert.assertEquals(0, validar);
    }  
    
}
