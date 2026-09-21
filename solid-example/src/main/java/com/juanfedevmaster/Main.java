package com.juanfedevmaster;

import com.juanfedevmaster.interfaces.ICalculadoraBono;
import com.juanfedevmaster.modelos.CalculadoraBono;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de Liskov. Capacidad de remplazar una clase instanciada en por su abstracion.
        ICalculadoraBono calculadoraBono = new CalculadoraBono("Jefe");
    }
}