package MODULO01.CLASE04.src;

/*## Ejercicio 3
Escriba un programa que permita ingresar un número e identificar
si es par o impar.*/

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite un numero entero:");
        var num1 = entrada.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El numero "+num1+" es par");
        } else {
            System.out.println("El numero "+num1+" es impar");
        }
        entrada.close();
    }
}
