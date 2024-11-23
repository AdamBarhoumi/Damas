package org.iesalandalus.programacion.damas.modelo;

import javax.naming.OperationNotSupportedException;

public class Dama {
    private Color color;
    private Posicion posicion;
    private boolean esDamaEspecial = false;


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new NullPointerException("Solo pudes elegir el color Blamco o Negro");
        } else {
            this.color = color;
        }

    }

    public Posicion getPosicion() {
        return new Posicion(posicion);
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new NullPointerException("La posicón está fuera de la tabla");
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
        int fila = (int) (Math.random() * 3) + 1;// Que me de un numero aleatorio de entre 1

        char columna = 'a'; // Inicializamos la columna (se sobreescribirá más adelante)z

        // Determinamos la columna dependiendo de la fila seleccionada
        if (fila == 1) {
            int opcion = (int) (Math.random() * 4) + 1;
            switch (opcion) {
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
        } else if (fila == 2) {
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
        } else if (fila == 3) {
            int opcion = (int) (Math.random() * 4) + 1;
            switch (opcion) {
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
        }

        this.posicion = new Posicion(fila, columna);
    }

    public Dama(Color color) {
        if (color == null) {
            throw new NullPointerException("El color no puede ser nulo.");
        }
        this.color = color;
        this.posicion = crearPosicionInicial(color);
    }


    Posicion crearPosicionInicial(Color color) {

        int fila;
        char columna = 'a';  // Inicializa la columna

        if (color == Color.BLANCO) {

            fila = (int) (Math.random() * 3) + 1;


            switch (fila) {
                case 1:
                    int opcion1 = (int) (Math.random() * 4) + 1;
                    switch (opcion1) {
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

                case 2:
                    int opcion2 = (int) (Math.random() * 4) + 1;
                    switch (opcion2) {
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

                case 3:
                    int opcion3 = (int) (Math.random() * 4) + 1;
                    switch (opcion3) {
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

            }

        }else if (color == Color.NEGRO) {

            fila = 6 + (int) (Math.random() * 3);


            switch (fila) {
                case 6:
                    int opcion6 = (int) (Math.random() * 4) + 1;
                    switch (opcion6) {
                        case 1:
                            columna='b';
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

                case 7:
                    int opcion7 = (int) (Math.random() * 4) + 1;
                    switch (opcion7) {
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

                    int opcion8 = (int) (Math.random() * 4) + 1;
                    switch (opcion8) {
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
        } else {

            throw new IllegalArgumentException("Color no es válido, tienes que usar el blanco o el negro");
        }


        return new Posicion(fila, columna);

    }

    public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

        if (direccion == null) {
            throw new NullPointerException("No puedes mover la dama a esa posición");

        }


        if (pasos < 1) { //Aqui dice qe si el numero es negativo que me lance un excepción
            throw new IllegalArgumentException("solo puedes mover la dama uno o pasos hacia delante");
        }
        if (pasos <= 0) {
            throw new IllegalArgumentException("tienes que poner un numero positivo");
        }
            if (esDamaEspecial == false) {
                pasos = 1;
            }




            int filaActual = posicion.getFila();
            if ((filaActual < 1 || filaActual > 8) || (posicion.getColumna() < 'a' || posicion.getColumna() > 'h')) {
                throw new IllegalArgumentException("El movimiento sale de la tabla");
            }

            if (this.color == Color.BLANCO && filaActual == 8) {
                esDamaEspecial = true;
            } else if (this.color == Color.NEGRO && filaActual == 1) {
                esDamaEspecial = true;

            }

            int nuevaFila = posicion.getFila();//asgnamos cada parte de la posicion a nuevafila o nuevacolumna
            char nuevaColumna = posicion.getColumna();

            switch (direccion) {//para cada caso de direccción que elija el usuario aumentará o disminuirá  un paso la columna o la fila
                case NORESTE:
                    if (color == Color.NEGRO ) {
                        throw new OperationNotSupportedException("La dama negra no puede moverse hacia el noreste.");
                    }
                    if (color==Color.BLANCO) {
                        nuevaFila += pasos;
                        nuevaColumna -= pasos;
                    }
                    break;
                case SURESTE:
                    if (color == Color.BLANCO ) {
                        throw new OperationNotSupportedException("La dama blanca no puede moverse hacia el sureste.");
                    }
                    if (color==Color.NEGRO) {
                        nuevaFila -= pasos;
                        nuevaColumna += pasos;
                    }
                    break;
                case SUROESTE:
                    if (color == Color.BLANCO ) {
                        throw new OperationNotSupportedException("La dama blanca no puede moverse hacia el suroeste.");
                    }
                    if(color==Color.NEGRO) {
                        nuevaFila -= pasos;
                        nuevaColumna -= pasos;
                    }
                    break;
                case NOROESTE:
                    if (color == Color.NEGRO ) {
                        throw new OperationNotSupportedException("La dama negra no puede moverse hacia el noroeste.");
                    }
                    if(color==Color.BLANCO) {
                        nuevaFila += pasos;
                        nuevaColumna += pasos;
                    }

                    break;

            }


            if (nuevaFila < 1 || nuevaFila > 8 || nuevaColumna < 'a' || nuevaColumna > 'h') {
                throw new OperationNotSupportedException("El movimiento sale del tablero.");
            }

            posicion = new Posicion(nuevaFila, nuevaColumna);



    }



    @Override
    public String toString() {
        return "Dama color "+color+" con posicion"+posicion ;
}
}


















