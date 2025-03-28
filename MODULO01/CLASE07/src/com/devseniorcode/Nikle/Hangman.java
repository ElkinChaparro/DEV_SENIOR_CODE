package MODULO01.CLASE07.src.com.devseniorcode.Nikle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void StartGame() {

        // Lista de palabras
        var words = List.of("Mariposa", "Elefante", "Helicoptero", "Astronauta", "Biblioteca", "Dinosaurio",
                "Espejismo", "Fotografia", "Girasol", "Hipopotamo");
        var sc = new Scanner(System.in);
        var rnd = new Random();
        var playAgain = false;

        do {
            // Genera una palabra aleatoria
            var word = words.get(rnd.nextInt(words.size())).toUpperCase();
            // Inicia el juego
            playGame(word, sc);
            // Pregunta para volver a jugar
            System.out.println("¿Desea seguir jugando? (S/N)");
            var option = sc.nextLine();
            playAgain = !option.equalsIgnoreCase("N");
        } while (playAgain);
        System.out.println("Hasta la proxima");
    }

    private static void playGame(String word, Scanner sc) {
        // Lista de palabras probadas
        var gessed = new ArrayList<Character>();
        // Lista de letras de la palabra
        var letters = new ArrayList<Character>(word.length());
        for (int i = 0; i < word.length(); i++) {
            letters.add('_');
        }
        var errors = 0;
        var endGame = false;
        while (!endGame) {
            // Mostrar la pantalla
            showScrean(letters, gessed, errors);
            // pedir la letra al usuario
            System.out.print("Ingrese una nueva letra: ");
            var letter = sc.nextLine().toUpperCase().charAt(0);
            if (!Character.isLetter(letter)) {
                System.out.println("No es una letra valida");
            }
            if (gessed.contains(letter)) {
                System.out.println("Letra ya ingresada ");
                continue;
            }
            // verificar la letra en a palabra
            if (word.indexOf(letter) != -1) {
                // Si existe, agregamos la letra a la cadena adivinada
                gessed.add(letter);
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter) {
                        letters.set(i, letter);
                    }
                }
            } else {
                // Si no,
                System.out.println("Lo siento esta letra no esta en la palabra");
                gessed.add(letter);
                // Incremento los errores
                errors++;
            }
            // verificar si ya perdio
            if (errors == 6) {
                // termina el juego
                showScrean(gessed, letters, errors);
                System.out.println("!Perdiste¡");
                endGame = true;
            }
            // verificar si ya gano, ya no hay mas _ en las letras
            if (!letters.contains('_')) {
                // termina el juego
                showScrean(gessed, letters, errors);
                System.out.println("!Ganaste¡");
                endGame = true;
            }
        }
    }

    private static void showScrean(List<Character> letters, List<Character> gessed, int errors) {
        System.out.println("Palabra a adivinar");
        for (var letter : letters) {
            System.out.printf("%c", letter);
        }
        System.out.println();

        System.out.println("Letras intentadas");
        for (var letter : gessed) {
            System.out.printf("%c", letter);
        }
        System.out.println();

        // La orca segun el numero de errores
        var draw = switch (errors) {
            case 1 ->
                """
                           +------+
                           |      |
                           |      O
                           |
                           |
                           |
                           |
                        +--+--+
                        |     |""";
            case 2 ->
                """
                           +------+
                           |      |
                           |      O
                           |      |
                           |      |
                           |
                           |
                        +--+--+
                        |     |""";
            case 3 ->
                """
                           +------+
                           |      |
                           |      O
                           |     \\|
                           |      |
                           |
                           |
                        +--+--+
                        |     |""";
            case 4 ->
                """
                           +------+
                           |      |
                           |      O
                           |     \\|/
                           |      |
                           |
                           |
                        +--+--+
                        |     |""";
            case 5 ->
                """
                           +------+
                           |      |
                           |      O
                           |     \\|/
                           |      |
                           |     /
                           |
                        +--+--+
                        |     |""";
            case 6 ->
                """
                           +------+
                           |      |
                           |      O
                           |     \\|/
                           |      |
                           |     / \\
                           |
                        +--+--+
                        |     |""";
            default ->
                """
                           +------+
                           |
                           |
                           |
                           |
                           |
                           |
                        +--+--+
                        |     |""";
        };
        System.out.println(draw);
    }
}
