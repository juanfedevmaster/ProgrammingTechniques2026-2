package com.juanfedevmaster.interfaces;

public interface IImpresoraScanner {
    void ScannearTexto(String rutaArchivo);
    void EnviarTextoEmail(String rutaArchivo, String destinatario);
}
