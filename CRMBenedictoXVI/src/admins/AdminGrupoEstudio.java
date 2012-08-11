package admins;

import crmbenedictoxvi.GrupoEstudio;
import crmbenedictoxvi.Instructor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdminGrupoEstudio {

    public ArrayList<GrupoEstudio> tablaGrupoEstudio() {     
    
        ArrayList<GrupoEstudio> listGE = new ArrayList<GrupoEstudio>();
        ArrayList<Instructor> instructores = new ArrayList<Instructor>();
        Instructor instructor = new Instructor ("Jose", "Perez");
        instructores.add(instructor);
        instructor = new Instructor("Pedro", "Lopez");
        instructores.add(instructor);
        GrupoEstudio ge = new GrupoEstudio ("A01","Curso de Office 2010 Plus", "TI", "Ofimatica", "15/01/2012", "15/03/2012", 
                instructores,"enlace01","Miraflores","A-41","45.2154","-54.3214","FINALIZADO");
        listGE.add(ge);
        
        instructores = new ArrayList<Instructor>();
        instructor = new Instructor ("Daniel", "Avalos");
        instructores.add(instructor);
        ge = new GrupoEstudio("A02","Programacion Orientada a Objetos", "TI", "POO", "03/01/2012", "27/03/2012", 
                instructores,"enlace02","San Borja","B-12","42.2451","-50.2419","FINALIZADO");
        listGE.add(ge);
        
        instructores = new ArrayList<Instructor>();
        instructor = new Instructor ("Daniel", "Avalos");
        instructores.add(instructor);
        instructor = new Instructor ("Jorge", "Alvares");
        instructores.add(instructor);
        ge = new GrupoEstudio("A03","Curso de configuracion de APs", "TI", "Redes Inalambricas", "01/04/2012", "27/06/2012", 
                instructores,"enlace03","Miraflores","A-21","45.2154","-54.3214","EN CURSO");
        listGE.add(ge);

        instructores = new ArrayList<Instructor>();
        instructor = new Instructor ("Daniel", "Avalos");
        instructores.add(instructor);
        instructor = new Instructor ("Antonio", "Alva");
        instructores.add(instructor);
        ge = new GrupoEstudio("A04","Curso de Cableado estructurado", "Electricidad", "Cableado Estructurado", "02/07/2012", "28/09/2012", 
                instructores,"enlace04","San Borja","A-12","42.2451","-50.2419","NINGUNO");
        listGE.add(ge);
        
        return listGE;
        
    }
    
    
//    public String buscarGrupoEstudio(GrupoEstudio ge) {
//        ArrayList<GrupoEstudio> geResult= new ArrayList<GrupoEstudio>();
//        ArrayList<GrupoEstudio> dbGE = tablaGrupoEstudio();
//        String result="";
//        //GrupoEstudio ige : dbGE
//        try {
//        for (int i = 0; i < dbGE.size() ; i++){
//            if(dbGE.get(i).getNombre().equals(ge.getNombre())){
//                geResult.add(dbGE.get(i));
//                //break;
//            }  
//            if (dbGE.get(i).getAcademia().equals(ge.getAcademia())){
//                geResult.add(dbGE.get(i));
//                
//            } 
//            if (dbGE.get(i).getCurso().equals(ge.getCurso())){
//                geResult.add(dbGE.get(i));
//                
//            } 
//            if (dbGE.get(i).getFechaini().equals(ge.getFechaini())){
//                geResult.add(dbGE.get(i));
//                
//            } 
//            if (dbGE.get(i).getFechafin().equals(ge.getFechafin())){
//                geResult.add(dbGE.get(i));
//                
//            } 
//            if (dbGE.get(i).getEstado().equals(ge.getEstado())){
//                geResult.add(dbGE.get(i));
//                
//            } 
//            
//        }
//        
//        if (geResult.size()>0){
//            for (int i = 0; i < geResult.size() ; i++) {
//
//                result+="\nRegistros encontrados: ";
//                result+="\nNombre: " + geResult.get(i).getNombre();
//                result+="\nAcademia: " + geResult.get(i).getAcademia();
//                result+="\nCurso: " + geResult.get(i).getCurso();
//                result+="\nFecha de Inicio: " + geResult.get(i).getFechaini();
//                result+="\nFecha de Fin: " + geResult.get(i).getFechafin();
//                result+="\nEstado: " + geResult.get(i).getEstado();
//                result+="\n----------------------";
//
//            }
//        } else {
//            result="No se ha encontrado ningun registro";
//        } 
//        
//        }catch(NullPointerException e){
//            e.getMessage();
//            result="No se ha ingresado ningun filtro";
//        }
//        return result;
//        
//    }

    public String buscarGrupoEstudioPorNombre(String nombre) {
        ArrayList<GrupoEstudio> geResult= new ArrayList<GrupoEstudio>();
        ArrayList<GrupoEstudio> dbGE = tablaGrupoEstudio();
        String result="";
        try{
        for (int i = 0; i < dbGE.size() ; i++){
            if(dbGE.get(i).getNombre().equalsIgnoreCase(nombre)){
                geResult.add(dbGE.get(i));
                //break;
            }
        }
        }catch (NullPointerException e) {
            result="no existe el Grupo de Estudio";
        }
        
        if (geResult.size()>0){
            for (int i = 0; i < geResult.size() ; i++) {

                result+="\nRegistros encontrados: ";
                result+="\nNombre: " + geResult.get(i).getNombre();
                result+="\nAcademia: " + geResult.get(i).getAcademia();
                result+="\nCurso: " + geResult.get(i).getCurso();
                result+="\nFecha de Inicio: " + geResult.get(i).getFechaini();
                result+="\nFecha de Fin: " + geResult.get(i).getFechafin();
                result+="\nEstado: " + geResult.get(i).getEstado();
                result+="\n----------------------";

            }
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
        
    }

    public String buscarGrupoEstudioPorAcademia(String academia) {
        ArrayList<GrupoEstudio> geResult= new ArrayList<GrupoEstudio>();
        ArrayList<GrupoEstudio> dbGE = tablaGrupoEstudio();
        String result="";
        try{
        for (int i = 0; i < dbGE.size() ; i++){
            if(dbGE.get(i).getAcademia().equalsIgnoreCase(academia)){
                geResult.add(dbGE.get(i));
                //break;
            }
        }
        }catch (NullPointerException e) {
            result="no existe el Grupo de Estudio";
        }
        
        if (geResult.size()>0){
            for (int i = 0; i < geResult.size() ; i++) {

                result+="\nRegistros encontrados: ";
                result+="\nNombre: " + geResult.get(i).getNombre();
                result+="\nAcademia: " + geResult.get(i).getAcademia();
                result+="\nCurso: " + geResult.get(i).getCurso();
                result+="\nFecha de Inicio: " + geResult.get(i).getFechaini();
                result+="\nFecha de Fin: " + geResult.get(i).getFechafin();
                result+="\nEstado: " + geResult.get(i).getEstado();
                result+="\n----------------------";

            }
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
        
    }

    public String buscarGrupoEstudioPorCurso(String curso) {
        ArrayList<GrupoEstudio> geResult= new ArrayList<GrupoEstudio>();
        ArrayList<GrupoEstudio> dbGE = tablaGrupoEstudio();
        String result="";
        try{
        for (int i = 0; i < dbGE.size() ; i++){
            if(dbGE.get(i).getCurso().equalsIgnoreCase(curso)){
                geResult.add(dbGE.get(i));
                //break;
            }
        }
        }catch (NullPointerException e) {
            result="no existe el Grupo de Estudio";
        }
        
        if (geResult.size()>0){
            for (int i = 0; i < geResult.size() ; i++) {

                result+="\nRegistros encontrados: ";
                result+="\nNombre: " + geResult.get(i).getNombre();
                result+="\nAcademia: " + geResult.get(i).getAcademia();
                result+="\nCurso: " + geResult.get(i).getCurso();
                result+="\nFecha de Inicio: " + geResult.get(i).getFechaini();
                result+="\nFecha de Fin: " + geResult.get(i).getFechafin();
                result+="\nEstado: " + geResult.get(i).getEstado();
                result+="\n----------------------";

            }
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
        
    }

    public String buscarGrupoEstudioPorFechaInicioFin(String fechaini, String fechafin) throws ParseException {
        ArrayList<GrupoEstudio> geResult= new ArrayList<GrupoEstudio>();
        ArrayList<GrupoEstudio> dbGE = tablaGrupoEstudio();
        String result="";
        Date fechai;
        Date fechaf;
        Date fini;
        Date ffin;
        
        try{
            
            if (fechaini.equals("") || fechafin.equals("")){
                result="No puede dejar uno de los campos de fecha en blanco";
                return result;
            } else {
            SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");
            fechai = dformat.parse(fechaini);
            fechaf = dformat.parse(fechafin);
                for (int i = 0; i < dbGE.size() ; i++){
                    fini=dformat.parse(dbGE.get(i).getFechaini());
                    ffin=dformat.parse(dbGE.get(i).getFechafin());
                    if((fini.compareTo(fechai))>=0 && (ffin.compareTo(fechaf))<=0){
                        geResult.add(dbGE.get(i));
                        //break;
                    }
                }

            }
        }catch (NullPointerException e) {
            result="No hay Grupos de Estudios entre las fechas proporcionadas";
        }
        
        if (geResult.size()>0){
            for (int i = 0; i < geResult.size() ; i++) {

                result+="\nRegistros encontrados: ";
                result+="\nNombre: " + geResult.get(i).getNombre();
                result+="\nAcademia: " + geResult.get(i).getAcademia();
                result+="\nCurso: " + geResult.get(i).getCurso();
                result+="\nFecha de Inicio: " + geResult.get(i).getFechaini();
                result+="\nFecha de Fin: " + geResult.get(i).getFechafin();
                result+="\nEstado: " + geResult.get(i).getEstado();
                result+="\n----------------------";

            }
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;
        
        
    }

    public String buscarGrupoEstudioPorEstado(String estado) {
        ArrayList<GrupoEstudio> geResult= new ArrayList<GrupoEstudio>();
        ArrayList<GrupoEstudio> dbGE = tablaGrupoEstudio();
        String result="";
        try{
        for (int i = 0; i < dbGE.size() ; i++){
            if(dbGE.get(i).getEstado().equalsIgnoreCase(estado)){
                geResult.add(dbGE.get(i));
                //break;
            }
        }
        }catch (NullPointerException e) {
            result="no existe el Grupo de Estudio";
        }
        
        if (geResult.size()>0){
            for (int i = 0; i < geResult.size() ; i++) {

                result+="\nRegistros encontrados: ";
                result+="\nNombre: " + geResult.get(i).getNombre();
                result+="\nAcademia: " + geResult.get(i).getAcademia();
                result+="\nCurso: " + geResult.get(i).getCurso();
                result+="\nFecha de Inicio: " + geResult.get(i).getFechaini();
                result+="\nFecha de Fin: " + geResult.get(i).getFechafin();
                result+="\nEstado: " + geResult.get(i).getEstado();
                result+="\n----------------------";

            }
        } else {
            result="No se ha encontrado ningun registro";
        }
        return result;

    }
    
    public String agregarGrupoEstudio(GrupoEstudio ge) {
        ArrayList<GrupoEstudio> nuevoGE = new ArrayList<GrupoEstudio>();
        String nombre=ge.getNombre();
        String fechaini=ge.getFechaini();
        String fechafin=ge.getFechafin();
        String result="Se ha dado de alta el registro satisfactoriamente";
        
        if (fechaini.equals("") || fechafin.equals("") || nombre.equals("")){
            result="Los campos: Nombre, Fecha de Inicio y Fecha de fin son obligatorios" + "\nNo se ha agregado el registro";
            return result;
        } else {
            //GrupoEstudio nge = ge;
            nuevoGE.add(ge);
            return result;
        }
    }
}

