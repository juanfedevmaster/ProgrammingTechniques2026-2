package com.juanfedevmaster.repositorios;

import com.juanfedevmaster.dominio.Producto;
import com.juanfedevmaster.interfaces.repos.IInventarioRepo;

import java.util.ArrayList;
import java.util.List;

public class InventarioRepo implements IInventarioRepo {

    private List<Producto> productos = null;

    public InventarioRepo() {
        if(productos == null){
            productos = new ArrayList<>();
            llenarProductos();
        }
    }

    private void llenarProductos() {
        String[] categorias = {"Electronico", "Ropa", "Alimento", "Hogar", "Deporte", "Juguete", "Herramienta", "Libro", "Cosmético", "Mueble"};
        String[] tipos = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        for (int i = 1; i <= 100; i++) {
            String categoria = categorias[(i - 1) % categorias.length];
            String tipo = tipos[(i - 1) % tipos.length];
            String nombre = categoria + " " + tipo + "-" + i;
            String codigo = String.format("PROD-%03d", i);
            int stock = (i * 7) % 50 + 10;
            productos.add(new Producto(nombre, codigo, stock));
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

}
