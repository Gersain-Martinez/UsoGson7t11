package com.gmh.itics.tesoem.edu.usogson7t11;

public class Datos {
    String Nombre;
    int edad;
    String Correo;
    String CURP;

    public Datos(String nombre, int edad, String correo, String CURP) {
        Nombre = nombre;
        this.edad = edad;
        Correo = correo;
        this.CURP = CURP;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
}
