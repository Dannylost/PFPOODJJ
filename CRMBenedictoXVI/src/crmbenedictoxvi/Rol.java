package crmbenedictoxvi;

public class Rol {
    
    private String nombre;
    private String desc;
    private Permiso perm;

    public Rol() {
    }

    public Rol(String nombre, String desc, Permiso perm) {
        this.nombre = nombre;
        this.desc = desc;
        this.perm = perm;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Permiso getPerm() {
        return perm;
    }

    public void setPerm(Permiso perm) {
        this.perm = perm;
    }
    
    
}
