package org.iesalandalus.programacion.damas.modelo;

public enum Direccion {
    NORESTE ("Noreste"), SURESTE ("Sureste"), SUROESTE("Suroeste"), NOROESTE("Noroeste");

   String cadenaAmostrar;
    private  Direccion(String cadenaAmostrar){
        this.cadenaAmostrar=cadenaAmostrar;
}




}
