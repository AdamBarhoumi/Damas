package org.iesalandalus.programacion.damas.modelo;

public enum Color {
    BLANCO("Blanco"), NEGRO("Negro");

    String cadenaAmostrar;
    private Color(String cadenaAmostrar){
        this.cadenaAmostrar=cadenaAmostrar;
    }

    private toString(){
        return cadenaAmostrar;
    }
}
