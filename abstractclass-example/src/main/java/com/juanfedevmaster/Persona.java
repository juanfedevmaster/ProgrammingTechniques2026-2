package com.juanfedevmaster;

public abstract class Persona {
    private int edad;
    private int id;
    private String nombreCompleto;

    public Persona() {
    }

    public Persona(int edad, int id, String nombreCompleto) {
        this.edad = edad;
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }
    /**
     * Encapasulado de Obtener edad
     * @return
     */
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public abstract boolean esMayorEdad();
}
