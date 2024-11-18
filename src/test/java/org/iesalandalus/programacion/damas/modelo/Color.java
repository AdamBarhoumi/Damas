package org.iesalandalus.programacion.damas.modelo;

public enum Color {
    BLANCO("Blanco"), NEGRO("Negro");

    String cadenaAmostrar;
    private Color(String cadenaAmostrar){
        this.cadenaAmostrar=cadenaAmostrar;
    }

    @Override
    public String toString() {
        return cadenaAmostrar ;
    }
}
