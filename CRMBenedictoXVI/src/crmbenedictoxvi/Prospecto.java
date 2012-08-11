
package crmbenedictoxvi;

import java.util.Date;
import java.util.GregorianCalendar;


public class Prospecto {

    private String name;
    private String surname1;
    private String surname2;
    private String mail;
    private String DNI;
    private String telefono;
    private String contact_date;
    private boolean alta;
    
    GregorianCalendar calendario = new GregorianCalendar();

    public Prospecto(String name, String surname1, String surname2, String mail, String DNI, String telefono, String contact_date) {
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.mail = mail;
        this.DNI = DNI;
        this.telefono = telefono;
        this.contact_date = contact_date;
        this.alta = false;
    }

    public Prospecto() {
    }
    

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public String getContact_date() {
        return contact_date;
    }

    public void setContact_date(String contact_date) {
        this.contact_date = contact_date;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
