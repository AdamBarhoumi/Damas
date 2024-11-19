package org.iesalandalus.programacion.damas;

public class Dama {
    Color color;
    Posicion posicion;
    boolean esDamaEspecial;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Solo pudes elegir el color Blamco o Negro");
        } else {
            this.color = color;
        }
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException("La posicón está fuera de la tabla");
        } else {
            this.posicion = new Posicion(posicion); //creamos una copia para evitsr el aliasing
        }
    }

    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }

    public Dama() {
        this.color = Color.BLANCO;
       int fila = (int) (Math.random()* 3)+1;
        char columna = 'a';

        if (fila == 1) {

            int opcion = (int) (Math.random() * 4) + 1;
            switch (opcion) {
                case 1 -> columna = 'b';
                case 2 -> columna = 'd';
                case 3 -> columna = 'f';
                case 4 -> columna = 'h';
            }
        } else if (fila == 2) {
            int opcion = (int) (Math.random() * 4) + 1;
            switch (opcion) {
                case 1 -> columna = 'a';
                case 2 -> columna = 'c';
                case 3 -> columna = 'e';
                case 4 -> columna = 'g';
            }
        } else if (fila == 3) {

            int opcion = (int) (Math.random() * 4) + 1;
            switch (opcion) {
                case 1 -> columna = 'b';
                case 2 -> columna = 'd';
                case 3 -> columna = 'f';
                case 4 -> columna = 'h';
            }
        }

        this.posicion = new Posicion(fila, columna);

    }


}


