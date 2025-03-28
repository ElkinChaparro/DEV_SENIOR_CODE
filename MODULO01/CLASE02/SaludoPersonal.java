package MODULO01.CLASE02;

import java.util.Scanner;

public class SaludoPersonal {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Hola, ¿como te llamas? ");
        var nombre = entrada.nextLine();

        System.out.println(nombre + "bienvenido a este el nuevo mundo de la programacion!");

        entrada.close();
    }
}
