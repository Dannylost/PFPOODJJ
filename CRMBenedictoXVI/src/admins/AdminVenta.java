
package admins;

import crmbenedictoxvi.Venta;
import interfases.IPrinterVentas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdminVenta extends AdminDocumento implements IPrinterVentas{
    
    public ArrayList<Venta> tablaVentas() {     
        Venta sale = new Venta();
        ArrayList<Venta> listVentas = new ArrayList<Venta>();
        Venta venta = new Venta ("Factura","00001", "Educacion: Curso de Redes Inalambricas", "15/01/2012", "15/02/2012", 
                "14/02/2012","Luz del Sur","CANCELADA",250.25,0.18,sale.calcularTotal(250.25,0.18),"SOL","Se pago a tiempo");
        listVentas.add(venta);
        
        venta = new Venta ("Factura","00002", "Educacion: Curso de Ofimatica", "18/01/2012", "01/02/2012", 
                "01/02/2012","Industrias del Zinc SA","CANCELADA",350.25,0.18,sale.calcularTotal(350.25,0.18),"SOL","Se pago el tipo de estudio a plazos");
        listVentas.add(venta);
        
        venta = new Venta ("Boleta","00001", "Educacion: Curso Programacion Orientada a Objetos", "24/06/2012", "24/07/2012", 
                "20/07/2012","Metales y Mas SAC","CANCELADA",400.00,0.18,sale.calcularTotal(400.00,0.18),"SOL","Se pago el tipo de estudio a plazos");
        listVentas.add(venta);

        venta = new Venta ("Sin Documento","00001", "Material de trabajo del Curso POO", "24/06/2012", "24/06/2012", 
                "24/06/2012","Pedro Ramos Vilchez","CANCELADA",11.25,0.00,sale.calcularTotal(11.25,0.18),"SOL","Se pago el tipo de estudio a plazos");
        listVentas.add(venta);
        
        return listVentas;
        
    }
    

    @Override
    public String buscarDocumentoPorConcepto(String concepto) {
        ArrayList<Venta> geResult= new ArrayList<Venta>();
        ArrayList<Venta> dbVentas = tablaVentas();
        String result="";
        try{
        for (int i = 0; i < dbVentas.size() ; i++){
            if(dbVentas.get(i).getConcepto().equalsIgnoreCase(concepto)){
                geResult.add(dbVentas.get(i));
            }
        }
        }catch (NullPointerException e) {
            result="No existe la venta con ese concepto";
        }
        
        if (geResult.size()>0){
           result=imprimir(geResult);
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
        
    }

    public String buscarDocumentoPorTipoNumero(String tipo, String numero) {
        
        ArrayList<Venta> geResult= new ArrayList<Venta>();
        ArrayList<Venta> dbVentas = tablaVentas();
        String result="";
        try{
        for (int i = 0; i < dbVentas.size() ; i++){
            if (dbVentas.get(i).getTipo().equalsIgnoreCase(tipo)){
                if(dbVentas.get(i).getNumero().equals(numero)){
                    geResult.add(dbVentas.get(i));
                }
            } else {
                result="\nNo existe el tipo de documento ingresado.";
            }
        }
        }catch (NullPointerException e) {
            result="No existe la venta de tipo "+tipo+" con el numero: "+numero;
        }
        
        if (geResult.size()>0){
            result=imprimir(geResult);
        } else {
            result="\nNo se ha encontrado ningun registro";
        }
        return result;
        
    }
    
    @Override
    public String buscarDocumentoPorFechaEmision(String fechaemi1, String fechaemi2) {
        
        ArrayList<Venta> geResult= new ArrayList<Venta>();
        ArrayList<Venta> dbVentas = tablaVentas();
        String result="";
        Date xfechaemi1;
        Date xfechaemi2;
        Date f1;
        
        try{
            if (fechaemi1.equals("") || fechaemi2.equals("")){
                result="No puede dejar uno de los campos de fecha en blanco";
                return result;
            } else {
            SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
            xfechaemi1 = dformat.parse(fechaemi1);
            xfechaemi2 = dformat.parse(fechaemi2);
                for (int i = 0; i < dbVentas.size() ; i++){
                    f1=dformat.parse(dbVentas.get(i).getFechaemi());
                    if((f1.compareTo(xfechaemi1))>=0 && (f1.compareTo(xfechaemi2))<=0){
                        geResult.add(dbVentas.get(i));
                    }
                }
            }
        }catch (NullPointerException e) {
            result="No hay Ventas entre las fechas proporcionadas";
        }catch (ParseException e){
            result=e.getMessage();
        }
        
        if (geResult.size()>0){
            result=imprimir(geResult);
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
        
    }

    @Override
    public String buscarDocumentoPorFechaVencimiento(String fechaven1, String fechaven2) {
        
        ArrayList<Venta> geResult= new ArrayList<Venta>();
        ArrayList<Venta> dbVentas = tablaVentas();
        String result="";
        Date xfechaven1;
        Date xfechaven2;
        Date f1;
        
        try{
            if (fechaven1.equals("") || fechaven2.equals("")){
                result="No puede dejar uno de los campos de fecha en blanco";
                return result;
            } else {
            SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
            xfechaven1 = dformat.parse(fechaven1);
            xfechaven2 = dformat.parse(fechaven2);
                for (int i = 0; i < dbVentas.size() ; i++){
                    f1=dformat.parse(dbVentas.get(i).getFechaven());
                    if((f1.compareTo(xfechaven1))>=0 && (f1.compareTo(xfechaven2))<=0){
                        geResult.add(dbVentas.get(i));
                    }
                }
            }
        }catch (NullPointerException e) {
            result="No hay Ventas entre las fechas proporcionadas";
        }catch (ParseException e){
            result=e.getMessage();
        }
        
        if (geResult.size()>0){
            result=imprimir(geResult);
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
    }

    @Override
    public String buscarDocumentoPorFechaPago(String fechapago1, String fechapago2) {
        
        ArrayList<Venta> geResult= new ArrayList<Venta>();
        ArrayList<Venta> dbVentas = tablaVentas();
        String result="";
        Date xfechapago1;
        Date xfechapago2;
        Date f;
        
        try{
            if (fechapago1.equals("") || fechapago2.equals("")){
                result="No puede dejar uno de los campos de fecha en blanco";
                return result;
            } else {
            SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
            xfechapago1 = dformat.parse(fechapago1);
            xfechapago2 = dformat.parse(fechapago2);
                for (int i = 0; i < dbVentas.size() ; i++){
                    f=dformat.parse(dbVentas.get(i).getFechapago());
                    if((f.compareTo(xfechapago1))>=0 && (f.compareTo(xfechapago2))<=0){
                        geResult.add(dbVentas.get(i));
                    }
                }
            }
        }catch (NullPointerException e) {
            result="No hay Ventas entre las fechas proporcionadas";
        }catch (ParseException e){
            result=e.getMessage();
        }
        
        if (geResult.size()>0){
           result=imprimir(geResult);
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
    }
    
    @Override
    public String buscarDocumentoPorEmpresa(String empresa) {
        
        ArrayList<Venta> geResult= new ArrayList<Venta>();
        ArrayList<Venta> dbVentas = tablaVentas();
        String result="";
        try{
        for (int i = 0; i < dbVentas.size() ; i++){
            if(dbVentas.get(i).getEmpresa().equalsIgnoreCase(empresa)){
                geResult.add(dbVentas.get(i));
                //break;
            }
        }
        }catch (NullPointerException e) {
            result="No existe la venta con la empresa: ";
        }
        
        if (geResult.size()>0){
            result=imprimir(geResult);
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
    }
    
    @Override
    public String buscarDocumentoPorEstado(String estado) {
        
        ArrayList<Venta> geResult= new ArrayList<Venta>();
        ArrayList<Venta> dbVentas = tablaVentas();
        String result;
        try{
        for (int i = 0; i < dbVentas.size() ; i++){
            if(dbVentas.get(i).getEstado().equalsIgnoreCase(estado)){
                geResult.add(dbVentas.get(i));
                //break;
            }
        }
        }catch (NullPointerException e) {
            result="No existe la venta con el estado: ";
        }
        
        if (geResult.size()>0){
            result=imprimir(geResult);
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
    }
    
    public String agregarDocumento(Venta doc) {
        tablaVentas();
        ArrayList<Venta> nuevoDoc = new ArrayList<Venta>();
        String concepto=doc.getConcepto();
        String fechaemi=doc.getFechaemi();
        String fechaven=doc.getFechaven();
        double subtotal=doc.getSubtotal();
        double igv=doc.getIgv();
        double total=doc.calcularTotal(subtotal, igv);
        String moneda=doc.getMoneda();
        
        String result="";
        
        if (concepto.equals("") || fechaemi.equals("") || fechaven.equals("") || subtotal==0 || igv==0
                || total==0 || moneda.equals("")){
            result+="Los campos: Concepto, Fecha de Emision, Fecha de Vencimiento, Subtotal, IGV y Moneda son Obligatorios."; 
            result+= "\nNo se ha agregado el registro"+subtotal+" "+igv+" "+total;
            return result;
        } else {
            result="Se ha dado de alta el registro satisfactoriamente";
            nuevoDoc.add(doc);
            return result;
        }
    }

    @Override
    public String imprimir(ArrayList<Venta> geResult) {
        String result="";
        for (int i = 0; i < geResult.size() ; i++) {

                result="\nRegistros encontrados: ";
                result+="\nTipo de Documento: " + geResult.get(i).getTipo();
                result+="\nNumero: " + geResult.get(i).getNumero();
                result+="\nConcepto: " + geResult.get(i).getConcepto();
                result+="\nEmpresa: " + geResult.get(i).getEmpresa();
                result+="\nFecha de Emision: " + geResult.get(i).getFechaemi();
                result+="\nFecha de Vencimiento: " + geResult.get(i).getFechaven();
                result+="\nFecha de Pago: " + geResult.get(i).getFechapago();
                result+="\nEstado: " + geResult.get(i).getEstado();
                result+="\n----------------------";
                
        }
        return result;
    }

}
