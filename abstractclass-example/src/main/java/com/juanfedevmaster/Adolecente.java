package com.juanfedevmaster;

public class Adolecente extends Persona{
    //#region NombreDeLaRegion
    @Override
    public boolean esMayorEdad() {
        if(this.getEdad() >= 18){
            System.out.println("Es Mayor de edad");
            return true;
        }

        System.out.println("No es mayor de edad");
        return false;
    }
    
}
