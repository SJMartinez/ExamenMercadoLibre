# ExamenMercadoLibre
Mi resolución de un examen de MercadoLibre

[Consigna](https://github.com/SJMartinez/ExamenMercadoLibre/blob/master/Examen%20Mercadolibre%20%20-%20Mutantes.pdf)


Se encuentra subido el primer nivel de la consigna, para mostrar la correcta funcionalidad de la estructura del algoritmo. La iteración se realiza sobre la matriz NXN 
de a bloques de 4 carácteres, sin jamás iterar más de una vez cada bloque entero de 4 caracteres de la matriz. A la vez traté de economizar lo mejor posible
el uso de condicionales, todo en pos de una mejor performance.

Al comienzo pensé en una iteración celda por celda, comparando las adyacentes, pero creo que el método que terminé implementando resulta mucho más eficiente que aquel.
También probé convirtiendo los caracteres en su valor ASCII, ya que la suma y comparación de variables númericas consumiria menos recursos que carácteres, pero se dio
la situación en que una combinación de 4 valores ASCII de G C T A diferentes resultaban en el mismo valor de uno de ellos multiplicado por 4, transformando en inviable
la estrategia.
  TODO: Niveles 2 y 3.
        
