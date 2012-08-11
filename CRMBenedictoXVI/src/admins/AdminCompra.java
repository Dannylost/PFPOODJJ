
package admins;

import crmbenedictoxvi.Compra;
import interfases.IPrinterCompras;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdminCompra extends AdminDocumento implements IPrinterCompras{
    
    public ArrayList<Compra> tablaCompras() {     
        Compra buy = new Compra();
        ArrayList<Compra> listCompras = new ArrayList<Compra>();
        Compra compra = new Compra ("Factura","00201", "Hojas Bond 500", "15/01/2012", "15/02/2012", 
                "14/02/2012","CopyMas SAC","CANCELADA",25.00,0.18,buy.calcularTotal(25.00,0.18),"SOL","Se va para el area de impresiones");
        listCompras.add(compra);
        
        compra = new Compra ("Factura","00402", "Lapiceros, Plumones y LiquidPaper", "15/02/2012", "15/03/2012", 
                "14/03/2012","SERVICOM SA","CANCELADA",12.00,0.18,buy.calcularTotal(25.00,0.18),"SOL","Se va para el area de impresiones");
        listCompras.add(compra);
        
        compra = new Compra ("Factura","00311", "Cuadernillos para presentacion", "15/03/2012", "15/04/2012", 
                "14/04/2012","CopyMas SAC","ANULADA",52.00,0.18,buy.calcularTotal(25.00,0.18),"SOL","Se va para el area de impresiones");
        listCompras.add(compra);

        compra = new Compra ("Factura","00334", "Sillas MODELO GIRATORIO VERDE", "15/07/2012", "15/08/2012", 
                "","Fursys SA","NUEVO",25.00,0.18,buy.calcularTotal(25.00,0.18),"USD","Se va para el area de impresiones");
        listCompras.add(compra);
        
        return listCompras;
        
    }
    
    @Override
    public String buscarDocumentoPorConcepto(String concepto) {
        
        ArrayList<Compra> geResult= new ArrayList<Compra>();
        ArrayList<Compra> dbCompras = tablaCompras();
        String result="";
        try{
        for (int i = 0; i < dbCompras.size() ; i++){
            if(dbCompras.get(i).getConcepto().equalsIgnoreCase(concepto)){
                geResult.add(dbCompras.get(i));
            }
        }
        }catch (NullPointerException e) {
            result="No existe la compra con ese concepto";
        }
        
        if (geResult.size()>0){
            result=imprimir(geResult);
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
        
    }

    public String buscarDocumentoPorTipoNumero(String tipo, String numero) {
        
        ArrayList<Compra> geResult= new ArrayList<Compra>();
        ArrayList<Compra> dbCompras = tablaCompras();
        String result="";
        try{
        for (int i = 0; i < dbCompras.size() ; i++){
            
            if (dbCompras.get(i).getTipo().equalsIgnoreCase(tipo)){
                if(dbCompras.get(i).getNumero().equals(numero)){
                    geResult.add(dbCompras.get(i));
                }
            } else{
                result="\nNo existe el tipo de documento ingresado.";
            }
        }
        }catch (NullPointerException e) {
            result="No existe la compra de tipo "+tipo+" con el numero: "+numero;
        }
        
        if (geResult.size()>0){
            result=imprimir(geResult);
        } else {
            result+="\nNo se ha encontrado ningun registro";
        }
        return result;
        
    }
    
    @Override
    public String buscarDocumentoPorFechaEmision(String fechaemi1, String fechaemi2) {
        
        ArrayList<Compra> geResult= new ArrayList<Compra>();
        ArrayList<Compra> dbCompras = tablaCompras();
        String result="";
        Date xfechaemi1;
        Date xfechaemi2;
        Date f;
        
        try{
            if (fechaemi1.equals("") || fechaemi2.equals("")){
                result="No puede dejar uno de los campos de fecha en blanco";
                return result;
            } else {
            SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
            xfechaemi1 = dformat.parse(fechaemi1);
            xfechaemi2 = dformat.parse(fechaemi2);
                for (int i = 0; i < dbCompras.size() ; i++){
                    f=dformat.parse(dbCompras.get(i).getFechaemi());
                    if((f.compareTo(xfechaemi1))>=0 && (f.compareTo(xfechaemi2))<=0){
                        geResult.add(dbCompras.get(i));
                    }
                }
            }
        }catch (NullPointerException e) {
            result="No hay Compras entre las fechas proporcionadas";
        }catch (ParseException e){
            result="Las fechas no tienen el formato correcto: "+e.getMessage();
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
        ArrayList<Compra> geResult= new ArrayList<Compra>();
        ArrayList<Compra> dbCompras = tablaCompras();
        String result="";
        Date xfechaven1;
        Date xfechaven2;
        Date f;
        
        try{
            if (fechaven1.equals("") || fechaven2.equals("")){
                result="No puede dejar uno de los campos de fecha en blanco";
                return result;
            } else {
            SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
            xfechaven1 = dformat.parse(fechaven1);
            xfechaven2 = dformat.parse(fechaven2);
                for (int i = 0; i < dbCompras.size() ; i++){
                    f=dformat.parse(dbCompras.get(i).getFechaven());
                    if((f.compareTo(xfechaven1))>=0 && (f.compareTo(xfechaven2))<=0){
                        geResult.add(dbCompras.get(i));
                    }
                }
            }
        }catch (NullPointerException e) {
            result="No hay Compras entre las fechas proporcionadas";
        }catch (ParseException e){
            result="Las fechas no tienen el formato correcto: "+e.getMessage();
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
        ArrayList<Compra> geResult= new ArrayList<Compra>();
        ArrayList<Compra> dbCompras = tablaCompras();
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
                for (int i = 0; i < dbCompras.size() ; i++){
                    f=dformat.parse(dbCompras.get(i).getFechapago());
                    if((f.compareTo(xfechapago1))>=0 && (f.compareTo(xfechapago2))<=0){
                        geResult.add(dbCompras.get(i));
                    }
                }
            }
        }catch (NullPointerException e) {
            result="No hay Compras entre las fechas proporcionadas";
        }catch (ParseException e){
            result="Las fechas no tienen el formato correcto: "+e.getMessage();
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
        
        ArrayList<Compra> geResult= new ArrayList<Compra>();
        ArrayList<Compra> dbCompras = tablaCompras();
        String result="";
        try{
        for (int i = 0; i < dbCompras.size() ; i++){
            if(dbCompras.get(i).getEmpresa().equalsIgnoreCase(empresa)){
                geResult.add(dbCompras.get(i));
            }
        }
        }catch (NullPointerException e) {
            result="No existe la compra con la empresa: "+empresa;
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
        
        ArrayList<Compra> geResult= new ArrayList<Compra>();
        ArrayList<Compra> dbCompras = tablaCompras();
        String result="";
        try{
        for (int i = 0; i < dbCompras.size() ; i++){
            if(dbCompras.get(i).getEstado().equalsIgnoreCase(estado)){
                geResult.add(dbCompras.get(i));
            }
        }
        }catch (NullPointerException e) {
            result="No existe la compra con el estado: "+estado;
        }
        
        if (geResult.size()>0){
            result=imprimir(geResult);
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
    }

   
    public String agregarDocumento(Compra doc) {
        tablaCompras();
        ArrayList<Compra> nuevoDoc = new ArrayList<Compra>();
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
    public String imprimir(ArrayList<Compra> geResult) {
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
