package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Dama;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.damas.modelo.Posicion;

public class MainApp {
    public static void main(String[] args) {
        Dama dama1 =new Dama(Color.BLANCO);
        Dama damanegera=new Dama(Color.NEGRO);


        System.out.println(dama1.getPosicion());
        System.out.println(damanegera.getPosicion());
    }
}

