package MODULO01.CLASE03;

/*## Ejercicio 9: Conversión de Temperaturas
Escribe un programa que convierta una temperatura
dada en grados Celsius a grados Fahrenheit y Kelvin.
Usa las siguientes fórmulas:*/

//Fahrenheit = Celsius * 9/5 + 32
//Kelvin = Celsius + 273.15

import java.util.Scanner;

public class Ejercicio_09 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("========Sistema de temperaturas========");
        System.out.println("=======================================");
        System.out.print("Digite la temperatura en °C (celsius):");
        var celsius = entrada.nextInt();
        int opcion;
        do {
            System.out.println("=======================================");
            System.out.println("====Que Operacion desea desarrollar====");
            System.out.println("=======================================");
            System.out.println("|1. Transformar a Fahrenheit          |");
            System.out.println("=======================================");
            System.out.println("|2. Transformar a Kelvin              |");
            System.out.println("=======================================");
            System.out.println("|3. Ambas                             |");
            System.out.println("=======================================");
            System.out.println("|4. Salir                             |");
            System.out.println("=======================================");
            System.out.print("====-");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    getFahrenheit(celsius);
                    break;
                case 2:
                    getKelvin(celsius);
                    break;
                case 3:
                    getFahrenheit(celsius);
                    getKelvin(celsius);
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
        ;
        entrada.close();
    }
    private static void getKelvin(int celsius) {
        var kelvin = celsius + 273.15;
        System.out.println(+celsius+" grados Celsius son:"+kelvin+" grados Kelvin");
    }
    private static void getFahrenheit(int celsius) {
        var fahrenheit = celsius * 9/5 + 32;
        System.out.println(+celsius+" grados Celsius son:"+fahrenheit+" grados fahrenheigt");
    }
}
