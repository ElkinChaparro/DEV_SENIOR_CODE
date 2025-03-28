package MODULO01.CLASE05;

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        showMenu(scanner);

        System.out.println("Termino la aplicacion");
        scanner.close();
    }

    private static void pressEnter(Scanner scanner){
        System.out.println("Presione Enter para Continuar");
        scanner.nextLine();
    }

    private static void showMenu(Scanner scanner) {
        int option;
        do {
            System.out.println("=============================");
            System.out.println("=======Menu clase 5==========");
            System.out.println("=============================");
            System.out.println("=1. Prueba While");
            System.out.println("=2. Prueba Do-While");
            System.out.println("=3. Prueva For");
            System.out.println("=0. Salir de la App");
            System.out.print("Ingresa uns opcion: ");
            option = scanner.nextInt();
            scanner.nextInt();
            switch (option) {
                case 1:
                    Whiletest();
                    break;
                case 2:
                    doWhileTest();
                    break;
                case 3:
                    forTest();
                    break;
                case 0:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.err.println("Opcion invalida, ingrese una opcion valida.");
                    break;
            }
            if (option !=0) {
                pressEnter(scanner);
            }
        } while (option != 0);

    }

    private static void forTest() {
        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        System.out.println("you win");
    }

    private static void doWhileTest() {
        // do-while
        // inicializacion
        var counter1 = 5;
        do {
            System.out.println(counter1);
            // avance
            counter1--;
        } while (counter1 > 0);
        System.out.println("Booom");
    }

    private static void Whiletest() {
        // While
        // Inicializacion
        var counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            // avance
            counter++;
        }
    }
}
