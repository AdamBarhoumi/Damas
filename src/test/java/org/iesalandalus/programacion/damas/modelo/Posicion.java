package org.iesalandalus.programacion.damas.modelo;

public class Posicion {
    private int fila;
    private char columna;

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila>1&&fila<8) {
            this.fila = fila;
        }else{
            throw new  IllegalArgumentException("Te has salido de las posiciones de la tabla");
        }

    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna >= 'A'&& columna<='H') {
            this.columna = columna;
        }else {
            throw new IllegalArgumentException("Te has salido de las posiciones de la tanla");
        }
    }
    public Posicion(int fila, char columna){
     setFila(fila);
     setColumna(columna);
    }
}
