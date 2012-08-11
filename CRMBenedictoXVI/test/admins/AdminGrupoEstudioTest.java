package admins;

import crmbenedictoxvi.GrupoEstudio;
import crmbenedictoxvi.Instructor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class AdminGrupoEstudioTest {
    
    @Test
    public void crearObjetoGrupoDeEstudio() {
        GrupoEstudio ge = new GrupoEstudio("A02", "TI", "POO", "03/01/2012", "27/03/2012", "EN CURSO");
        Assert.assertNotNull(ge);
    }
    
    @Test
    public void buscarGruposDeEstudioEnElSistemaPorNombre(){
        String nombre="A02";
        
        AdminGrupoEstudio admge = new AdminGrupoEstudio();
        String result;
        result = admge.buscarGrupoEstudioPorNombre(nombre);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void buscarGruposDeEstudioEnElSistemaPorAcademia(){
        String academia="TI";
        
        AdminGrupoEstudio admge = new AdminGrupoEstudio();
        String result;
        result = admge.buscarGrupoEstudioPorAcademia(academia);
        
        Assert.assertNotNull(result);
        System.out.println(result);
    }
    
    @Test
    public void buscarGruposDeEstudioEnElSistemaPorCurso(){
        String curso="Diseño de aplicaciones";
        
        AdminGrupoEstudio admge = new AdminGrupoEstudio();
        String result;
        result = admge.buscarGrupoEstudioPorCurso(curso);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void buscarGruposDeEstudioEnElSistemaPorFechaInicioYFin() throws ParseException{
        
        String fechaini = "01/01/2012";
        String fechafin = "01/05/2012";
        
        AdminGrupoEstudio admge = new AdminGrupoEstudio();
        String result;
        result = admge.buscarGrupoEstudioPorFechaInicioFin(fechaini,fechafin);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void buscarGruposDeEstudioEnElSistemaPorEstado(){
        String estado="EN CURSO";
        
        AdminGrupoEstudio admge = new AdminGrupoEstudio();
        String result;
        result = admge.buscarGrupoEstudioPorEstado(estado);
        
        Assert.assertNotNull(result);
        //System.out.println(result);
    }
    
    @Test
    public void darDeAltaAUnNuevoGrupoDeEstudio(){
        String nombre="A05";
        String desc="Curso de diseño de paginas web";
        String academia="TI";
        String curso="Diseño de paginas Web";
        String fechaini="02/10/2012";
        String fechafin="28/12/2012";
        ArrayList<Instructor> instructores = new ArrayList<Instructor>();
            Instructor instructor = new Instructor ("Jose", "Perez");
            instructores.add(instructor);
            instructor = new Instructor("Pedro", "Lopez");
            instructores.add(instructor);
        String link="http://www.benedicto.edu.pe/silabus/a05.html";
        String local="Miraflores";
        String aula="H-24";
        String coorlat="45.2154";
        String cooralt="-54.3214";
        String estado="NINGUNO";
        GrupoEstudio ge = new GrupoEstudio(nombre,desc,academia,curso,fechaini,fechafin,instructores,link, local,aula,coorlat,cooralt,estado);
        AdminGrupoEstudio admge =  new AdminGrupoEstudio();
        
        Assert.assertNotNull(admge.agregarGrupoEstudio(ge));
        System.out.println(admge.agregarGrupoEstudio(ge)); //VALIDA LOS CAMPOS FECHA INICIO, FECHA FIN Y NOMBRE
    }
}
