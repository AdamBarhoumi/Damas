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

        public static void crearDamaDefecto () {
            dama = new Dama();
            System.out.println("Dama creada por defecto: " + dama);
        }
        public static void crearDamaColor () {
            Color color = Consola.elegiropcion();
            dama = new Dama(color);
            System.out.println("Dama creada con color " + color + ": " + dama);
        }

        public static void mover () {
            if (dama == null) {
                System.out.println("Primero debes crear una dama.");
                return;
            }


        }
        Consola.mostrarMenuDirecciones();
        Direccion direccion = Consola.elegirDireccion();

        int pasos = 1;
        if (dama.esEsDamaEspecial()) {
            pasos = Consola.elegirPasos();
        }

        try {
            dama.mover(direccion, pasos);
            System.out.println("Has movido la dama a: " + dama);
        } catch (Exception excepcion) {
            System.out.println("No se pudo mover la dama por: " + excepcion.getMessage());
        }
        public static void mostrarDama() {
            if (dama != null) {
                System.out.println("Dama actual: " + dama);
            } else {
                System.out.println("No se ha creado ninguna dama.");
            }
        }

    }


}






