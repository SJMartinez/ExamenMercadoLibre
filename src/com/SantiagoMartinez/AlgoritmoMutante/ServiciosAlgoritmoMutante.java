package com.SantiagoMartinez.AlgoritmoMutante;

public interface ServiciosAlgoritmoMutante {

    //funcion para comparar bloques
    public static int verificar(String suma) {
        int verificado = 0;
        switch (suma) {
            case "AAAA":
            case "TTTT":
            case "GGGG":
            case "CCCC":
                verificado = 1;
                break;
        }

        return verificado;
    }
    //funcion iterar, que a partir de un array con carácteres, toma la máxima cantidad
    // de bloques de 4 carácteres en cada columna, fila y diagonal válida.
    //por cada cadena mutante detectada, int salir aumenta en 1. Al llegar a 2, la función termina y devuelve
    //boolean verificado en true. Al no detectarse, devuelve false.
    public static boolean iterar(String[][] bases, int largoCadena, int pivotFila, int pivotColumna,
                                 int comparaciones, int salir, int vueltas, boolean verificado) {

        //columna
        if (salir < 2) {
            for (int x = 0; (x < comparaciones) && (salir < 2); x++) {

                String suma = bases[0 + x][pivotColumna] + bases[0 + x + 1][pivotColumna] +
                        bases[0 + x + 2][pivotColumna] + bases[0 + x + 3][pivotColumna];
                salir += ServiciosAlgoritmoMutante.verificar(suma);
            }
        }
        //fila

        for (int x = 0; (x < comparaciones) && (salir < 2); x++) {
            String suma = (bases[pivotFila][0 + x] + bases[pivotFila][0 + x + 1]
                    + bases[pivotFila][0 + x + 2] + bases[pivotFila][0 + x + 3]);
            salir += ServiciosAlgoritmoMutante.verificar(suma);
        }

        //diagonales
        //diagonal principal hacia la derecha
        //diagonal principal solo itera la primera vez
        if (vueltas == 0) {
            for (int x = 0; (x < (comparaciones - vueltas)) && (salir < 2); x++) {
                String suma = (bases[pivotFila + x][pivotColumna + x] + bases[pivotFila + x + 1][pivotColumna + x + 1]
                        + bases[pivotFila + x + 2][pivotColumna + x + 2] + bases[pivotFila + x + 3][pivotColumna + x + 3]);
                salir +=  ServiciosAlgoritmoMutante.verificar(suma);
            }
            //luego se divide en dos diagonales paralelas hacia la derecha
        } else {
            for (int x = 0; (x < (comparaciones - vueltas)) && (salir < 2); x++) {
                String suma = (bases[0 + x][pivotColumna + x] + bases[0 + x + 1][pivotColumna + x + 1]
                        + bases[0 + x + 2][pivotColumna + x + 2] + bases[0 + x + 3][pivotColumna + x + 3]);
                salir +=  ServiciosAlgoritmoMutante.verificar(suma);
            }

            for (int x = 0; (x < (comparaciones - vueltas)) && (salir < 2); x++) {
                String suma = (bases[pivotFila + x][0 + x] + bases[pivotFila + x + 1][0 + x + 1]
                        + bases[pivotFila + x + 2][0 + x + 2] + bases[pivotFila + x + 3][0 + x + 3]);
                salir +=  ServiciosAlgoritmoMutante.verificar(suma);
            }

        }

        //diagonales hacia la izquierda
        //principal
        if (vueltas == 0) {
            for (int x = 0; (x < comparaciones) && (salir < 2); x++) {
                String suma = (bases[pivotFila + x][pivotColumna + 3 + x] + bases[pivotFila + x + 1][pivotColumna + x + 2]
                        + bases[pivotFila + x + 2][pivotColumna + x + 1] + bases[pivotFila + x + 3][pivotColumna + x]);
                salir +=  ServiciosAlgoritmoMutante.verificar(suma);
            }
            //paralelas
        } else {
            for (int x = 0; (x < (comparaciones - vueltas)) && (salir < 2); x++) {
                String suma = (bases[0 + x][pivotColumna + 3 + x] + bases[0 + x + 1][pivotColumna + x + 2]
                        + bases[0 + x + 2][pivotColumna + x + 1] + bases[0 + x + 3][pivotColumna + x]);
                salir +=  ServiciosAlgoritmoMutante.verificar(suma);
            }

            for (int x = 0; (x < (comparaciones - vueltas)) && (salir < 2); x++) {
                String suma = (bases[pivotFila + x][0 + 3 + x] + bases[pivotFila + x + 1][0 + x + 2]
                        + bases[pivotFila + x + 2][0 + x + 1] + bases[pivotFila + x + 3][0 + x]);
                salir +=  ServiciosAlgoritmoMutante.verificar(suma);
            }

        }

        if (salir >= 2) {
            verificado = true;
            return verificado;
        }
        vueltas++;
        if ((vueltas < largoCadena) && (verificado == false)) {
            pivotFila++;
            pivotColumna++;
            verificado = iterar(bases, largoCadena, pivotFila, pivotColumna, comparaciones, salir, vueltas, verificado);
        }
        return verificado;
    }
}
