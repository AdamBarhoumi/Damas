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

    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }
    public Dama() {
        this.color = Color.BLANCO;
        int fila = (int) (Math.random() * 3) + 1;

        char columna = 'a';

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

    }

    public Posicion creaPoscionInicial(Color color) {

        if (this.color == Color.BLANCO) {

            int fila = (int) (Math.random() * 3) + 1;

            char columna = 'a';

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


            } else if (this.color == Color.NEGRO) {

                fila = 6 + (int) (Math.random() * 3);


                if (fila == 6) {
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
                } else if (fila == 7) {
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
                } else if (fila == 8) {
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
                return new Posicion(fila, columna);
            }
            return new Posicion(fila, columna);

        }

        return posicion;
    }


}
