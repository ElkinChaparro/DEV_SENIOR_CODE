/*## Ejercicio 1:  6 / 2 ( 1 + 2 )
El orden de los operadores aritméticos es muy importante ya que dependiendo
del orden obtenemos un resultado u otro. En programación, el orden de los
operadores es el mismo que el utilizado en matemáticas.

[Calculadoras con diferentes precedencias de operadores]
(https://s1.eestatic.com/2019/06/06/actualidad/actualidad_404223507_130573023_1706x960.jpg)

En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )"
utilizando las instrucciones necesarias.
¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
Explique por que la otra calculadora genera un resultado diferente.*/
public class Ejercicio_01 {
    public static void main(String[] args) {
        var ejercicio = 6 / 2 * ( 1 + 2 );
        System.out.println(ejercicio);
    }
}

//Podemos denotar que el resultado apropiado es "9" y no "1" estod ebido a que
// en el celular la solucion biene dictaminada a ser desarrollada de izquierda a derecha
//sin respetar la jerarquia de las matematicas que en este caso son los parentesis algo que
//la computadora o una calculadora cientifica respetan por que son diseñadas con ese objetivo
// por lo tanto primero centran su atencion a los parentesis y ya resueltos continuan con la
//division y posterior la multiplicacion