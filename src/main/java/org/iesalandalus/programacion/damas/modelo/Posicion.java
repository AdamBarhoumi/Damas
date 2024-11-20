package org.iesalandalus.programacion.damas.modelo;

import java.util.Objects;



public class Posicion {
    private int fila;
    private char columna;

    public Posicion(int fila, char columna){
        setFila(fila);
        setColumna(columna);
    }
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila>1&&fila<8) {
            this.fila = fila;
        }else{
            throw new  IllegalArgumentException("La posición es invalida, te has salido de las posiciones de la tabla");
        }

    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna >= 'a'&& columna<='h') {
            this.columna = columna;
        }else {
            throw new IllegalArgumentException("La posición es invalida, te has salido de las posiciones de la tabla");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    public Posicion(Posicion siguientePosicion){
     if (siguientePosicion==null){
         throw new IllegalArgumentException(", te has salido de la tabla");
     }else {
         this.fila = siguientePosicion.getFila();
         this.columna = siguientePosicion.getColumna();
     }
     }
     public String toString(){
         return "fila= "+fila+ " columna= "+columna;

    }

}
