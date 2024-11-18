package org.iesalandalus.programacion.damas.modelo;

public class Dama {
    Color color;
    Posicion posicion;
    boolean esDamaEspecial;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color==null){
            throw new IllegalArgumentException("Solo pudes elegir el color Blamco o Negro");
        }else {
            this.color = color;
        }
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if(posicion==null){
            throw new IllegalArgumentException("La posicón está fuera de la tabla");
        }else {
            this.posicion = new Posicion(posicion); //creamos una copia para evitsr el aliasing
        }
    }

    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }
}
