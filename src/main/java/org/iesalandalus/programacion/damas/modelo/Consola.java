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

    }




