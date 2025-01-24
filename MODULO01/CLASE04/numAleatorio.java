import java.util.Scanner;
import java.util.Random;

public class numAleatorio {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int intentos = 1;

        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.println("Adivina un número entre 1 y 100:");

        while (true) {
            System.out.print("Introduce tu adivinanza: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break;
            } else if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número secreto es menor. Intenta de nuevo.");
            }
        }
        scanner.close();
        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
    }
}