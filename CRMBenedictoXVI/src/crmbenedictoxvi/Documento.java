
package crmbenedictoxvi;

public abstract class Documento {
    protected String tipo;
    protected String numero;
    protected String concepto;
    protected String fechaemi;
    protected String fechaven;
    protected String fechapago;
    protected String empresa;
    protected String estado;
    protected double subtotal;
    protected double igv;
    protected double total;
    protected String moneda;
    protected String obs;

    public Documento(String tipo, String numero, String concepto, String fechaemi, String fechaven, String fechapago, 
            String empresa, String estado, double subtotal, double igv, String moneda, String obs) {
        this.tipo = tipo;
        this.numero = numero;
        this.concepto = concepto;
        this.fechaemi = fechaemi;
        this.fechaven = fechaven;
        this.fechapago = fechapago;
        this.empresa = empresa;
        this.estado = estado;
        this.subtotal = subtotal;
        this.igv = igv;
        this.moneda = moneda;
        this.obs = obs;
    }

    public Documento() {
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaemi() {
        return fechaemi;
    }

    public void setFechaemi(String fechaemi) {
        this.fechaemi = fechaemi;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    public String getFechaven() {
        return fechaven;
    }

    public void setFechaven(String fechaven) {
        this.fechaven = fechaven;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public abstract double calcularTotal(double subtotal, double igv);
    
    
}
