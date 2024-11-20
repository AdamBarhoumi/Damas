package org.iesalandalus.programacion.damas.modelo;

public enum Color {
    BLANCO("Blanco"), NEGRO("Negro");

     private final String cadenaAmostrar;
    Color(String cadenaAmostrar){
        this.cadenaAmostrar=cadenaAmostrar;
    }

    @Override
    public String toString() {
        return cadenaAmostrar ;
    }
}
