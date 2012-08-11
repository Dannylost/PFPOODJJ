
package admins;

public abstract class AdminDocumento {
    
    public abstract String buscarDocumentoPorConcepto(String concepto);
    public abstract String buscarDocumentoPorFechaEmision(String fechaemi1,String fechaemi2);
    public abstract String buscarDocumentoPorFechaVencimiento(String fechaven1,String fechaven2);
    public abstract String buscarDocumentoPorFechaPago(String fechapago1,String fechapago2);
    public abstract String buscarDocumentoPorEmpresa(String empresa);
    public abstract String buscarDocumentoPorEstado(String estado);
    
}
