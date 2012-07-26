package crmbenedictoxvi;

public class Permiso {
    private boolean acceso;
    private boolean adicionar;
    private boolean editar;
    private boolean eliminar;
    private Modulo modulo;

    public Permiso(Modulo modulo, boolean Acceso, boolean Adicionar, boolean Editar, boolean Eliminar) {
        this.acceso = Acceso;
        this.adicionar = Adicionar;
        this.editar = Editar;
        this.eliminar = Eliminar;
        this.modulo = modulo;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean Acceso) {
        this.acceso = Acceso;
    }

    public boolean isAdicionar() {
        return adicionar;
    }

    public void setAdicionar(boolean Adicionar) {
        this.adicionar = Adicionar;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean Editar) {
        this.editar = Editar;
    }

    public boolean isEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean Eliminar) {
        this.eliminar = Eliminar;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    
    
    
}
