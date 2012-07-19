package crmbenedictoxvi;

public class Rol {
    
    private String nombre;
    private String desc;
    private Permisos perm;

    public Rol(String nombre, String desc, Permisos perm) {
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

    public Permisos getPerm() {
        return perm;
    }

    public void setPerm(Permisos perm) {
        this.perm = perm;
    }
    
    
}
