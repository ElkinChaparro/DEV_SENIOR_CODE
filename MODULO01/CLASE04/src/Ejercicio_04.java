package MODULO01.CLASE04.src;

/*## Ejercicio 4
Escriba un programa que permita ingresar una letra e
identifique si la letra es mayúscula o minúscula.*/

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite el caracter literal a evaluar: ");
        char letra = entrada.next().charAt(0);

        if (letra >= 'a' && letra <= 'z') {
        System.out.println("La letra "+letra+" es minuscula");
        }
        else if (letra >= 'A' && letra <= 'Z')
        System.out.println("La letra "+letra+" es mayuscula");
        entrada.close();
    }
}
