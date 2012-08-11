
package admins;

import crmbenedictoxvi.Venta;
import java.text.ParseException;
import junit.framework.Assert;
import org.junit.Test;

public class AdminVentaTest {
    
    @Test
    public void buscarVentaPorConcepto() {
        String concepto="Educacion: Curso de Redes Inalambricas";
        AdminVenta admventa = new AdminVenta();
        String result;
        
        result=admventa.buscarDocumentoPorConcepto(concepto);
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void buscarVentaPorTipoYNumero() {
        String tipo="Factura";
        String numero="00002";
        AdminVenta admventa = new AdminVenta();
        String result;
        
        result=admventa.buscarDocumentoPorTipoNumero(tipo,numero);
        Assert.assertNotNull(result);
        System.out.println(result);
    }
    
    @Test
    public void buscarVentaPorFechaDeEmision() throws ParseException {
        
        String fechaemi1 = "01/01/2012";
        String fechaemi2 = "01/05/2012";
        
        AdminVenta admventa = new AdminVenta();
        String result;
        result = admventa.buscarDocumentoPorFechaEmision(fechaemi1,fechaemi2);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void buscarVentaPorFechaDeVencimiento() {
        
        String fechaven1 = "01/01/2012";
        String fechaven2 = "01/05/2012";
        
        AdminVenta admventa = new AdminVenta();
        String result;
        result = admventa.buscarDocumentoPorFechaVencimiento(fechaven1,fechaven2);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
        
    @Test
    public void buscarVentaPorFechaDePago() {
        
        String fechapago1 = "14/02/2012";
        String fechapago2 = "01/05/2012";
        
        AdminVenta admventa = new AdminVenta();
        String result;
        result = admventa.buscarDocumentoPorFechaPago(fechapago1,fechapago2);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }

    @Test
    public void buscarVentaPorEmpresa() {
        String empresa="Industrias del Zinc SA";
        AdminVenta admventa = new AdminVenta();
        String result;
        
        result=admventa.buscarDocumentoPorEmpresa(empresa);
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void buscarVentaPorEstado() {
        String estado="CANCELADA";
        AdminVenta admventa = new AdminVenta();
        String result;
        
        result=admventa.buscarDocumentoPorEstado(estado);
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    @Test
    public void darDeAltaUnaNuevaVentaValidandoLosCamposNecesarios(){
        String tipo="Factura";
        String numero="00004";
        String concepto="Educacion: Curso de Lectores de huellas digitales";
        String fechaemi="02/08/2012";
        String fechaven="02/09/2012";
        String fechapago="";
        String empresa="Comercial del Acero SA";
        String estado="NUEVO";
        double subtotal=245.22;
        double igv=0.18;
        
        String moneda="USD";
        String obs="Pendiente por pagar"; 
        
        AdminVenta admventa = new AdminVenta();
        Venta sale = new Venta();
        double total=sale.calcularTotal(subtotal, igv);
        Venta venta = new Venta(tipo, numero, concepto, fechaemi, fechaven, fechapago, empresa, estado, subtotal, igv, 
                total, moneda, obs);
        Assert.assertNotNull(admventa.agregarDocumento(venta));
        //System.out.println(admventa.agregarDocumento(venta));//VALIDA LOS CAMPOS FECHA INICIO, FECHA FIN Y NOMBRE
    }
}
