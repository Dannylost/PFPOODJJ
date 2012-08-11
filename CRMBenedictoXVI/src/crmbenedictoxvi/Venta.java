
package crmbenedictoxvi;

public class Venta extends Documento{
    double total;

    public Venta(String tipo, String numero, String concepto, String fechaemi, String fechaven, String fechapago, 
            String empresa, String estado, double subtotal, double igv, double total, String moneda, String obs) {
        super(tipo, numero, concepto, fechaemi, fechaven, fechapago, empresa, estado, subtotal, igv, moneda, obs);
        this.total=total;
    }

    public Venta() {
        //super();
    }


    @Override
    public double calcularTotal(double subtotal, double igv) {
        double result;
        result = subtotal*igv + subtotal;
        return result;
    }
    
}
