package org.iesalandalus.programacion.damas.modelo;

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

    public boolean esEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setesDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }

    public Dama() {
        this.color = Color.BLANCO; // Dama blanca
        int fila = (int) (Math.random() * 3) + 1; // Aleatorio entre 1, 2, 3

        char columna = 'a'; // Inicializamos la columna (se sobreescribirá más adelante)

        // Determinamos la columna dependiendo de la fila seleccionada
        if (fila == 1) {
            int opcion = (int) (Math.random() * 4) + 1;
            switch (opcion) {
                case 1:
                    columna = 'b';
                    break;
                case 2:
                    columna = 'd';
                    break;
                case 3:
                    columna = 'f';
                    break;
                case 4:
                    columna = 'h';
                    break;
            }
        } else if (fila == 2) {
            int opcion = (int) (Math.random() * 4) + 1;
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    columna = 'c';
                    break;
                case 3:
                    columna = 'e';
                    break;
                case 4:
                    columna = 'g';
                    break;
            }
        } else if (fila == 3) {
            int opcion = (int) (Math.random() * 4) + 1;
            switch (opcion) {
                case 1:
                    columna = 'b';
                    break;
                case 2:
                    columna = 'd';
                    break;
                case 3:
                    columna = 'f';
                    break;
                case 4:
                    columna = 'h';
                    break;
            }
        }

        this.posicion = new Posicion(fila, columna);
    }

    public Dama(Color color) {
        this.color = color;
        this.posicion = crearPosicionInicial(color);
    }


    Posicion crearPosicionInicial(Color color) {

        int fila;
        char columna = 'a';  // Inicializa la columna

        if (color == Color.BLANCO) {
            // Las damas blancas se ubican en las filas 1, 2 y 3
            fila = (int) (Math.random() * 3) + 1;

            // Selección de columna para las damas blancas (solo casillas negras)
            switch (fila) {
                case 1:
                    int opcion1 = (int) (Math.random() * 4) + 1;
                    switch (opcion1) {
                        case 1:
                            columna = 'b';
                            break;
                        case 2:
                            columna = 'd';
                            break;
                        case 3:
                            columna = 'f';
                            break;
                        case 4:
                            columna = 'h';
                            break;
                    }
                    break;
                case 2:
                    int opcion2 = (int) (Math.random() * 4) + 1;
                    switch (opcion2) {
                        case 1:
                            columna = 'c';
                            break;
                        case 2:
                            columna = 'e';
                            break;
                        case 3:
                            columna = 'g';
                            break;
                    }
                    break;
                case 3:
                    int opcion3 = (int) (Math.random() * 4) + 1;
                    switch (opcion3) {
                        case 1:
                            columna = 'b';
                            break;
                        case 2:
                            columna = 'd';
                            break;
                        case 3:
                            columna = 'f';
                            break;
                        case 4:
                            columna = 'h';
                            break;
                    }
                    break;
            }

        } else if (color == Color.NEGRO) {

            fila = 6 + (int) (Math.random() * 3);


            switch (fila) {
                case 6:
                    int opcion6 = (int) (Math.random() * 4) + 1;
                    switch (opcion6) {
                        case 1:
                            break;
                        case 2:
                            columna = 'c';
                            break;
                        case 3:
                            columna = 'e';
                            break;
                        case 4:
                            columna = 'g';
                            break;
                    }
                    break;
                case 7:
                    int opcion7 = (int) (Math.random() * 4) + 1;
                    switch (opcion7) {
                        case 1:
                            columna = 'b';
                            break;
                        case 2:
                            columna = 'd';
                            break;
                        case 3:
                            columna = 'f';
                            break;
                        case 4:
                            columna = 'h';
                            break;
                    }
                    break;
                case 8:
                    int opcion8 = (int) (Math.random() * 4) + 1;
                    switch (opcion8) {
                        case 1:
                            columna = 'a';
                            break;
                        case 2:
                            columna = 'c';
                            break;
                        case 3:
                            columna = 'e';
                            break;
                        case 4:
                            columna = 'g';
                            break;
                    }
                    break;
            }
        } else {

            throw new IllegalArgumentException("Color no es válido, tienes que usar el blanco o el negro");
        }


        return new Posicion(fila, columna);
    }

    public void mover(Direccion direccion, int pasos) {
        if (direccion == null) {
            throw new IllegalArgumentException("No puedes mover la dama a esa posición");

        }
        if (this.color == Color.BLANCO){
            mover(Direccion.NORESTE, 1);
            mover(Direccion.NOROESTE, 1);
        } else if (this.color==Color.NEGRO) {
            mover(Direccion.SURESTE,1);
            mover(Direccion.SUROESTE,1);

        }
        


    }






}






