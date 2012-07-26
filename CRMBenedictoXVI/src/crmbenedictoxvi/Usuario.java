package crmbenedictoxvi;

import java.util.Date;

public class Usuario {
    
    private String code;
    private String name;
    private String surname1;
    private String surname2;
    private String username;
    private String mail;
    private String date;
    private String position;
    private String rol;
    private String pass;
    private boolean move;

    public Usuario(String code, String name, String surname1, String surname2, String username, String mail, String date, String position, String rol, String pass) {
        this.code = code;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.username = username;
        this.mail = mail;
        this.date = date;
        this.position = position;
        this.rol = rol;
        this.pass = pass;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isMove() {
        return move;
    }  
    
 }
    

