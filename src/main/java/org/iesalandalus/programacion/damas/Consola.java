package org.iesalandalus.programacion.damas;

import org.iesalandalus.programacion.damas.modelo.Color;
import org.iesalandalus.programacion.damas.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola() {

    }

    public static void mostrarMenu() {

        System.out.println("Menú de opciones, digite el numero de su opción");
        System.out.println("1. Crear dama por defecto");
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
        Color color = null; //aqui lo que hago es que almaceno color que ha introducido el usuario
        boolean colorValido = false;

        System.out.println("Elige un color:");
        System.out.println("===============");
        System.out.println("1. Color blanco");
        System.out.println("2. Color negro");


        do {
            System.out.print("Introduce tu opción: ");
            int opcion = Entrada.entero();
            switch (opcion) {
                case 1:
                    color = Color.BLANCO;
                    colorValido = true;
                    break;
                case 2:
                    color = Color.NEGRO;
                    colorValido = true;
                    break;
            }
        } while (colorValido==false);

        return color;
    }

    public static void mostrarMenuDirecciones() {
        System.out.println("Menú de direcciones");
        System.out.println("=====================");
        System.out.println("1. Noreste");
        System.out.println("2. Noroeste ");
        System.out.println("3. Sureste");
        System.out.println("4. Suroeste");
    }
    public static Direccion elegirDireccion() {
        int opcion;
        Direccion direccion = null;//alamaceno la dirección;

        boolean direccionValida=false;
        do {
            System.out.print("Introduce tu opoción: ");
            opcion = Entrada.entero();
            switch (opcion) {
                case 1:
                    direccion = Direccion.NORESTE;
                    direccionValida = true;
                    break;
                case 2:
                    direccion=Direccion.NORESTE;
                    direccionValida=true;
                    break;
                case 3:
                    direccion=Direccion.SURESTE;
                    direccionValida=true;
                    break;
                case 4:
                    direccion=Direccion.SUROESTE;
                    direccionValida=true;
                    break;
            }
        }while (direccionValida==false);

        return direccion;
    }
   public static int elegirPasos(){
       int pasos;

       do {
           System.out.print("Introduce el numero de pasos que desea avanzar");
           pasos = Entrada.entero();

           if (pasos < 1) {
               System.out.println("No puede introducir ese numero. El numero debe de ser igual o mayor a 1");
           }
       } while (pasos < 1);

       return pasos;
   }
    public static void despedirse(){
        System.out.println("Gracias por usar nuestro servicio para jugar a las damas, esperemos que se lo haya pasado bien ¡Hasta pronto! ");
    }
}







