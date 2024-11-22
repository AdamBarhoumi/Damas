package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Dama;
import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.damas.modelo.Posicion;


public class MainApp {


    private static Dama dama;

    public static void ejecutarOpcion(int opcion) {//cremos un metodo para que llame a otros metodos con el switch
        switch (opcion) {
            case 1:
                crearDamaDefecto();
                break;
            case 2:
                crearDamaColor();
                break;
            case 3:
                mover();
                break;
            case 4:
                Consola.despedirse();
                break;
            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                break;
        }
    }
}





