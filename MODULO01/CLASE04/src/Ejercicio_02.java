package MODULO01.CLASE04.src;

/*## Ejercicio 2
Escriba un programa que le permita ingresar tres números e
imprima en la consola el más grande de ellos.*/

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite tres numeros por separado");
        System.out.println("Digite el primer numero:");
        var num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero:");
        var num2 = entrada.nextInt();
        System.out.println("Digite el tercer nuemro:");
        var num3 = entrada.nextInt();

        if ((num1 > num3) && (num1 > num2)) {
            System.out.println(num1 + " es el numero mas grande");
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + " es el numero mas grande");
        } else if ((num3 > num2) && (num3 > num1)) {
            System.out.println(num3 + " es el numero mas grande");
        }

        entrada.close();
    }
}
