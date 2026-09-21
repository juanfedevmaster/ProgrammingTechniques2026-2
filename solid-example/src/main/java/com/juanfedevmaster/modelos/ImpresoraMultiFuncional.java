package com.juanfedevmaster.modelos;

import java.io.BufferedReader;
import java.io.FileReader;

import com.juanfedevmaster.interfaces.IImpresoraScanner;
import com.juanfedevmaster.interfaces.IImpresoraTexto;

// Ejemplo Interface Segregation (Segregacion de interfaces)
public class ImpresoraMultiFuncional implements IImpresoraScanner, IImpresoraTexto{
    public void ImprimirTexto(String texto){
        System.out.println(texto);
    }

    public void ScannearTexto(String rutaArchivo){
        try{
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            while(br.readLine() != null){
                System.out.println(br.readLine());
            }
        }catch(Exception exe){
            System.out.println("Error de Escaneo");
        }
    }

    @Override
    public void EnviarTextoEmail(String rutaArchivo, String destinatario) {
       try{
        String texto = "";
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            while(br.readLine() != null){
                texto = texto + "\n" + br.readLine();
            }
            EnviarEmail();

        }catch(Exception exe){
            System.out.println("Error de Escaneo");
        }
    }

    private void EnviarEmail(){
        System.out.println("TextoEnviado");
    }
}
