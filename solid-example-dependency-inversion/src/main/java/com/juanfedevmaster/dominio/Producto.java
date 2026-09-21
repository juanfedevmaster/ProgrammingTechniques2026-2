package com.juanfedevmaster.dominio;

public class Producto {
    private String nombre;
    private String codigo;
    private int stock;

    public Producto() {
    }
    
    public Producto(String nombre, String codigo, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
