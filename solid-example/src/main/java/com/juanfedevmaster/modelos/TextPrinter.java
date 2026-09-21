package com.juanfedevmaster.modelos;

import java.util.Arrays;

// Ejemplo de Single Resposability. 
// Ejemplo TextPrinter: Solamente esta encargado de realizar una unica tarea, o tareas
// relacionadas con la funcionalidad de impresion.

public class TextPrinter {
    private String textoImpresion;
    public TextPrinter(){

    }

    public void setTextoImpresion(String textoImpresion){
        this.textoImpresion = textoImpresion;
    }

    public String getTextoImpresion(){
        return this.textoImpresion;
    }

    public void mostrarTextoPorLetra(){
        System.out.println(Arrays.toString(this.textoImpresion.toCharArray()));
    }

    public void mostrarTextoCadaNumeroPar(){
        for(int i=0; i<this.textoImpresion.length();i++){
            if(i%2 == 0){
                System.out.println(this.textoImpresion.toCharArray()[i]);
            }
        }
    }

    public void imprimirTexto(String texto){
        System.out.println(texto);
    }
}
