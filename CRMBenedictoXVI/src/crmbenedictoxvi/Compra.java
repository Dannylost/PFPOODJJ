
package crmbenedictoxvi;

public class Compra extends Documento{
    double total;
    
    public Compra(String tipo, String numero, String concepto, String fechaemi, String fechaven, String fechapago, 
            String empresa, String estado, double subtotal, double igv, double total, String moneda, String obs) {
        super(tipo, numero, concepto, fechaemi, fechaven, fechapago, empresa, estado, subtotal, igv, moneda, obs);
        this.total=total;
    }

    public Compra() {
    }

    @Override
    public double calcularTotal(double subtotal, double igv) {
        double result;
        result = subtotal*igv + subtotal;
        return result;
    }
    
    
}
