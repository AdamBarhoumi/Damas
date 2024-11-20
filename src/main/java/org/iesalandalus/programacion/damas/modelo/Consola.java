package org.iesalandalus.programacion.damas.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola(){

    }
   public static void MostrarMenu(){

       System.out.println("Menú de opciones, digite el numero de su opción");
       System.out.println("1. Crear da dama dama por defecto");
       System.out.println("2. Crear dama eligiendo color");
       System.out.println("3. Mover dama");
       System.out.println("4. Salir");
   }
}
