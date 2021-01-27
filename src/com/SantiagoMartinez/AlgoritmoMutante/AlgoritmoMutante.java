package com.SantiagoMartinez.AlgoritmoMutante;

public class AlgoritmoMutante implements ServiciosAlgoritmoMutante{




    public static void esMutante(String... cadenas) {
        //utilizo varargs en los argumentos por practicidad para mostrar el algoritmo, puede ser facilmente intercambiable
        //por String[] al pasar al nivel 2 y 3 del ejercicio.
        //No se valída que cada cadena sea de la misma N longitud y en N cantidad, se puede agregar facilmente
        //tanto en back como en algun supuesto front pero no era requisito del ejercicio.
        int largoCadena = cadenas[0].length();
        int filasBases = cadenas.length;
        //guardo cada caracter en un array bidimensional de String (hacerlo tipo char generaba inconvenientes
        //al concatenar eficientemente en un String para comparar los bloques) que luego será iterado.
        String[][] bases = new String[filasBases][largoCadena];
        int fila = 0;
        for (String cadena : cadenas) {

            for (int columna = 0; columna <= (largoCadena - 1); columna++) {
                bases[fila][columna] = String.valueOf(cadena.charAt(columna));
            }
            fila++;
        }
        //comparaciones es la cantidad de veces, según el tamaño de la matriz-array bidimensional, que se debe
        //desplazar el bloque comparativo por fila/columna/diagonal principal para iterarla completamente en
        //busqueda de resultados.
        int comparaciones = (largoCadena - 4) + 1;
        //los pivots comienzan siendo la posicion inicial de referencia para iterar filas/columnas/diagonales,
        //a medida de ser necesario según el tamaño de la matriz, también son desplazados
        int pivotFila = 0;
        int pivotColumna = 0;
        //salir es la variable para contabilizar la cantidad de aciertos encotnrados. al superar 1 la funcion
        //termina
        int salir = 0;
        //vueltas es la cantidad de iteraciones del orden fila/columna/diagonales completadas
        int vueltas = 0;
        //verificado es un boolean interno para almacenar el resultado final de los chequeos
        boolean verificado = false;
        boolean esMutante = ServiciosAlgoritmoMutante.iterar(bases, largoCadena, pivotFila, pivotColumna, comparaciones, salir, vueltas, verificado);
        if (esMutante == true) {
            System.out.println("ES MUTANTE");
        } else {
            System.out.println("NO ES MUTANTE");

        }

    }


}
