package org.iesalandalus.programacion.damas;

public enum Color {
    BLANCO("Blanco"), NEGRO("Negro");

    String cadenaAmostrar;
    Color(String cadenaAmostrar){
        this.cadenaAmostrar=cadenaAmostrar;
    }

    @Override
    public String toString() {
        return cadenaAmostrar ;
    }
}
