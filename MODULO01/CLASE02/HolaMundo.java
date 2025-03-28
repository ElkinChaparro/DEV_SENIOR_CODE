package MODULO01.CLASE02;
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        var entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        var entero = entrada.nextInt();
        System.out.println("El numero actual ingresado es: "+entero);
        entrada.close();
    }
}