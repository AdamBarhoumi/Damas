package org.iesalandalus.programacion.damas.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola() {

    }

    public static void mostrarMenu() {

        System.out.println("Menú de opciones, digite el numero de su opción");
        System.out.println("1. Crear da dama dama por defecto");
        System.out.println("2. Crear dama eligiendo color");
        System.out.println("3. Mover dama");
        System.out.println("4. Salir");

    }

    public static int elegirOpcionMenu() {
        int opcion = 0;
        do {
            System.out.print("Introduce una opción ");
            opcion = Entrada.entero();
            if (opcion >= 1 && opcion <= 4) {
                break;
            } else {
                System.out.println("Solo puedes elegir opciones del 1 al 4");
            }
        } while (true);

        return opcion;

    }

    public static Color elegiropcion() {
        Color color= null;
        boolean ColorValido=false;
        System.out.println("Elige un color");
        System.out.println("1. Color blanco");
        System.out.println("2. Color negro");

        do {
            System.out.println("Introduce tu opción");
            int opcion = Entrada.entero();

            if (opcion == 1) {
                color = Color.BLANCO;
                ColorValido = true;
            } else if (opcion == 2) {
               color = Color.NEGRO;
                ColorValido = true;
            } else {
                System.out.println("Opción no válida. Por favor, elige 1 para Blanco o 2 para Negro.");
            }
            System.out.println("color es "+opcion);
        } while (ColorValido!=true); 

        return color;
    }
        }







