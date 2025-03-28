package MODULO01.CLASE04.src;

/*## Ejercicio 1
Escriba un programa que permita ingresar un número real e identifique
si el número es negativo, positivo o cero.*/

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite un numero real:");
        float num1 = entrada.nextFloat();
            if (num1 < 0) {
                System.out.println("El numero " + num1 + " es Negativo");
            } else if (num1 > 0) {
                System.out.println("El numero " + num1 + " es Positivo");
            } else if (num1 == 0) {
                System.out.println("El numero es cero");
            }
        entrada.close();
    }
}
