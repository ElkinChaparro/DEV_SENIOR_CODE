package CLASE02;

import java.util.Scanner;

public class LasPalabras {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite tres palabras separadas una de la otra");
        System.out.println("Digite la Primera palabra: ");
        String pal1 = entrada.nextLine();
        System.out.println("Digite la segunda palabra: ");
        String pal2 = entrada.nextLine();
        System.out.println("Digite la tercera palabra: ");
        String pal3 = entrada.nextLine();
        System.out.println("La frase digitada es: "+pal1+" "+pal2+" "+pal3);
        entrada.close();
    }
}
