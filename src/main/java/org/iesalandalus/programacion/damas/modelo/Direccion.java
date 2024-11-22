package org.iesalandalus.programacion.damas.modelo;

public enum Direccion {
    NORESTE ("Noreste"), SURESTE ("Sureste"), SUROESTE("Suroeste"), NOROESTE("Noroeste");

   private final String cadenaAmostrar;
    private  Direccion(String cadenaAmostrar){
        this.cadenaAmostrar=cadenaAmostrar;
}

    @Override
    public String toString() {
        return cadenaAmostrar ;
    }
}



