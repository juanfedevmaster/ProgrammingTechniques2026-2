package com.juanfedevmaster.servicios;

import com.juanfedevmaster.dominio.Producto;
import com.juanfedevmaster.interfaces.servicios.IVenta;
import com.juanfedevmaster.repositorios.InventarioRepo;

public class Venta implements IVenta {

    private InventarioRepo inventario;

    public Venta() {
        this.inventario = new InventarioRepo();
    }

    public boolean venderProducto(String nombreProducto, int cantidad) {
        for (Producto productoBusqueda : inventario.getProductos()) {
            if(productoBusqueda.getNombre().equals(nombreProducto)){
                int stockProducto = productoBusqueda.getStock();
                stockProducto -= cantidad;
                productoBusqueda.setStock(stockProducto);
                return true;
            }
        }

        return false;
    }
}
