package com.juanfedevmaster;

import com.juanfedevmaster.dominio.Producto;
import com.juanfedevmaster.interfaces.servicios.IVenta;
import com.juanfedevmaster.servicios.Venta;

public class Main {
    public static void main(String[] args) {

        String nombreProducto = "Cosmetico C";
        IVenta venta = new Venta();
        boolean seVendio = venta.venderProducto("Cosmetico C", 10);

        if (seVendio) {
            System.out.println("Se vendio el producto: " + nombreProducto);
        }else{
            System.out.println("Venta no realizada por falta de Plata");
        }
    }
}