# CNYT-ComplexMatriz
## Description
```
Este programa simula las propiedades y operaciones basicas que
se aplican a los numeros complejos haciendo uso una clase del mismo nombre, cada funcion se describe acontinuacion:
1. Adición de vectores complejos.
2. Inverso (aditivo) de un vector complejo.
3. Multiplicación de un escalar por un vector complejo.
4. Adición de matrices complejas.
5. Inversa (aditiva) de una matriz compleja.
6. Multiplicación de un escalar por una matriz compleja.
7. Transpuesta de una matriz/vecto
8. Conjugada de una matriz/vector
9. Adjunta (daga) de una matriz/vector
10. Producto de dos matrices (de tamaños compatibles)
11. //-Función para calcular la "acción" de una matriz sobre un vector.-//
12. Producto interno de dos vectores
13. Norma de un vector
14. //Distancia entre dos vectores//
15. Revisar si una matriz es unitaria
16. Revisar si una matriz es Hermitiana
17. //Producto tensor de dos matrices/vectores///
```

## Uso dentro del metodo main

Antes de hacer la construccion de las matrices complejas:
```
ComplexNumber z = new ComplexNumber(1,0);//crear el numero complejo
.
.
```
Una vez creado se procede con el llamado a la matriz teniendo en cuenta las filas
y columnas de esta:

```

ComplexMatriz m1 = new ComplexMatriz(2,2);// filas y columnas respectivamente
.
.
ComplexMatriz m1 = new ComplexMatriz(2);//longitud del vector en caso de requerir un vector
```
Y por ultimo se hace la incersion de los datos de prueba:

```
m1.putInMatriz(c,0,0);
//numero complejo y posicion dentro del arreglo filas y columnas respectivamente
.
. 
m1.putInVector(c, 0);
//numero complejo y posicion dentro del arreglo en caso de ser vector

```

