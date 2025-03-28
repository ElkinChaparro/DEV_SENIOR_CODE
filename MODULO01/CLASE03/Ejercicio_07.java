package MODULO01.CLASE03;

/*## Ejercicio 7: Calculadora Básica
Escribe un programa que solicite al usuario dos números
y luego realice las operaciones de suma, resta, multiplicación
y división con esos números. Muestra los resultados en la consola.*/

import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("=====Sistema de calculadora basica=====");
        System.out.println("=======================================");
        System.out.println("===Digite dos numeros para operarlos===");
        System.out.println("=======================================");
        System.out.print("====-Digite el primer numero: ");
        var num1 = entrada.nextInt();
        System.out.print("====-Digite el segundo numero: ");
        var num2 = entrada.nextInt();
        int opcion;
        do {
            System.out.println("==Que operacion desea hacer con ellos==");
            System.out.println("=__1. Sumarlos________________________=");
            System.out.println("=__2. Restarlos_______________________=");
            System.out.println("=__3. Multiplicarlos__________________=");
            System.out.println("=__4. Dividirlos______________________=");
            System.out.println("=__5. Todas las operaciones___________=");
            System.out.println("=__6. Salir del programa______________=");
            System.out.print("====-");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    getSuma(num1, num2);
                    break;
                case 2:
                    getResta(num1, num2);
                    break;
                case 3:
                    getMult(num1, num2);
                    break;
                case 4:
                    getDiv(num1, num2);
                    break;
                case 5:
                    getSuma(num1, num2);
                    getResta(num1, num2);
                    getMult(num1, num2);
                    getDiv(num1, num2);
                    break;
            }
        } while (opcion != 6);
        entrada.close();
    }
    private static void getDiv(int num1, int num2) {
        var div = num1 / num2;
        System.out.println("La division de los dos numeros es: " + div);
    }
    private static void getMult(int num1, int num2) {
        var mult = num1 * num2;
        System.out.println("La multiplicacion de los dos numeros es: " + mult);
    }
    private static void getResta(int num1, int num2) {
        var resta = num1 - num2;
        System.out.println("La resta de los dos numeros es: " + resta);
    }
    private static void getSuma(int num1, int num2) {
        var suma = num1 + num2;
        System.out.println("La suma de los dos numeros es: " + suma);
    }
}
