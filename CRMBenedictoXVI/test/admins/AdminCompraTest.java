
package admins;

import crmbenedictoxvi.Compra;
import java.text.ParseException;
import junit.framework.Assert;
import org.junit.Test;

public class AdminCompraTest {
    
    @Test
    public void buscarCompraPorConcepto() {
        String concepto="Hojas Bond 500";
        AdminCompra admcompra = new AdminCompra();
        String result;
        
        result=admcompra.buscarDocumentoPorConcepto(concepto);
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void buscarCompraPorTipoYNumero() {
        String tipo="Factura";
        String numero="00201";
        AdminCompra admcompra = new AdminCompra();
        String result;
        
        result=admcompra.buscarDocumentoPorTipoNumero(tipo,numero);
        Assert.assertNotNull(result);
        System.out.println(result);
    }
    
    @Test
    public void buscarCompraPorFechaDeEmision() throws ParseException {
        
        String fechaemi1 = "01/01/2012";
        String fechaemi2 = "01/05/2012";
        
        AdminCompra admcompra = new AdminCompra();
        String result;
        result = admcompra.buscarDocumentoPorFechaEmision(fechaemi1,fechaemi2);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void buscarCompraPorFechaDeVencimiento() {
        
        String fechaven1 = "01/01/2012";
        String fechaven2 = "01/05/2012";
        
        AdminCompra admcompra = new AdminCompra();
        String result;
        result = admcompra.buscarDocumentoPorFechaVencimiento(fechaven1,fechaven2);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
        
    @Test
    public void buscarCompraPorFechaDePago() {
        
        String fechapago1 = "14/02/2012";
        String fechapago2 = "01/05/2012";
        
        AdminCompra admcompra = new AdminCompra();
        String result;
        result = admcompra.buscarDocumentoPorFechaPago(fechapago1,fechapago2);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }

    @Test
    public void buscarCompraPorEmpresa() {
        String empresa="SERVICOM SA";
        AdminCompra admcompra = new AdminCompra();
        String result;
        
        result=admcompra.buscarDocumentoPorEmpresa(empresa);
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void buscarCompraPorEstado() {
        String estado="NUEVO";
        AdminCompra admcompra = new AdminCompra();
        String result;
        
        result=admcompra.buscarDocumentoPorEstado(estado);
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    @Test
    public void darDeAltaUnaNuevaCompraValidandoLosCamposNecesarios(){
        String tipo="Boleta";
        String numero="00250";
        String concepto="Compra: Combo Mouse y Teclado Microsoft";
        String fechaemi="08/08/2012";
        String fechaven="08/09/2012";
        String fechapago="";
        String empresa="Suministros Peru SA";
        String estado="NUEVO";
        double subtotal=600.00;
        double igv=0.18;
        
        String moneda="USD";
        String obs="Pendiente por pagar"; 
        
        AdminCompra admcompra = new AdminCompra();
        Compra buy = new Compra();
        double total=buy.calcularTotal(subtotal, igv);
        Compra compra = new Compra(tipo, numero, concepto, fechaemi, fechaven, fechapago, empresa, estado, subtotal, igv, 
                total, moneda, obs);
        Assert.assertNotNull(admcompra.agregarDocumento(compra));
        System.out.println(admcompra.agregarDocumento(compra));//VALIDA LOS CAMPOS FECHA INICIO, FECHA FIN Y NOMBRE
    }
}
