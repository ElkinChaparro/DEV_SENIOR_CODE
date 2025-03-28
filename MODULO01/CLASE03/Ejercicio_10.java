package MODULO01.CLASE03;

/*## Ejercicio 10: Media Aritmética
Crea un programa que calcule la media aritmética
de tres números introducidos por el usuario.*/

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("===========Media aritmetica============");
        System.out.println("=======================================");
        System.out.println("===Digite los digitos para operarlos===");
        System.out.println("=======================================");
        System.out.print("-Digite el primer digito: ");
        var num1 = entrada.nextInt();
        System.out.print("-Digite el segundo digito: ");
        var num2 = entrada.nextInt();
        System.out.print("-Digite el tercer digito: ");
        var num3 = entrada.nextInt();

        var media = (num1 + num2 + num3 )/3;
        System.out.println("La media de los tres numeros es: "+media);
        entrada.close();
    }
}
