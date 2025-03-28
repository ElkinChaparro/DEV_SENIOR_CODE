package MODULO01.CLASE04.src;

/*## Ejercicio 5
Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante.*/

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite el caracter literal a evaluar: ");
        char letra = entrada.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("El caracter " + letra + " es una vocal en minuscula");
        } else if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("El caracter " + letra + " es una vocal en mayuscula");
        } else if (letra >= 'a' && letra <= 'z') {
            System.out.println("El caracter " + letra + " es una consonante en minuscula");
        } else if (letra >= 'A' && letra <= 'Z') {
            System.out.println("El caracter " + letra + " es una consonante en mayuscula");
            entrada.close();
        }
    }
}