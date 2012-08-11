
package crmbenedictoxvi;

import java.util.ArrayList;
import java.util.Date;

public class GrupoEstudio {
    String nombre;
    String desc;
    String academia;
    String curso;
    String fechaini;
    String fechafin;
    ArrayList<Instructor> instructores = new ArrayList<Instructor>();
    String link;
    String local;
    String aula;
    String coorlat;
    String cooralt;
    String estado;



    public GrupoEstudio(String nombre, String desc, String academia, String curso, String fechaini, String fechafin, 
            ArrayList<Instructor> instructores,String link, String local, String aula, String coorlat, String cooralt,String estado) {
        this.nombre = nombre;
        this.desc = desc;
        this.academia = academia;
        this.curso = curso;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.instructores = instructores;
        this.link = link;
        this.local = local;
        this.aula = aula;
        this.coorlat = coorlat;
        this.cooralt = cooralt;
        this.estado = estado;
    }

    public GrupoEstudio(String nombre, String academia, String curso, String fechaini, String fechafin, String estado) {
        this.nombre = nombre;
        this.academia = academia;
        this.curso = curso;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.estado = estado;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getCooralt() {
        return cooralt;
    }

    public void setCooralt(String cooralt) {
        this.cooralt = cooralt;
    }

    public String getCoorlat() {
        return coorlat;
    }

    public void setCoorlat(String coorlat) {
        this.coorlat = coorlat;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<Instructor> getInstructores() {
        return instructores;
    }

    public void setInstructores(ArrayList<Instructor> instructores) {
        this.instructores = instructores;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getFechaini() {
        return fechaini;
    }

    public void setFechaini(String fechaini) {
        this.fechaini = fechaini;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
