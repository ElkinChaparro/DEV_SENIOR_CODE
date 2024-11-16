/*## Ejercicio 8: Área y Perímetro de un Rectángulo
Crea un programa que calcule el área y el perímetro
de un rectángulo. Solicita al usuario la longitud
y el ancho del rectángulo.*/

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("===========Area & Perimetro============");
        System.out.println("=======================================");
        System.out.println("===Digite las medidas para operarlos===");
        System.out.println("=======================================");
        System.out.print("-Digite la longitud del rectangulo: ");
        var longitud = entrada.nextInt();
        System.out.print("-Digite el ancho del rectangulo: ");
        var ancho = entrada.nextInt();
        int opcion;
        do {
            System.out.println("=======================================");
            System.out.println("====Que Operacion desea desarrollar====");
            System.out.println("=======================================");
            System.out.println("|1. Perimetro                         |");
            System.out.println("=======================================");
            System.out.println("|2. Area                              |");
            System.out.println("=======================================");
            System.out.println("|3. Ambas                             |");
            System.out.println("=======================================");
            System.out.println("|4. Salir                             |");
            System.out.println("=======================================");
            System.out.print("====-");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    getPerimetro(longitud, ancho);
                    break;
                case 2:
                    getArea(longitud, ancho);
                    break;
                case 3:
                    getPerimetro(longitud, ancho);
                    getArea(longitud, ancho);
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
        entrada.close();
    }
    private static void getArea(int longitud, int ancho) {
        var area = longitud * ancho;
        System.out.println("=======================================");
        System.out.println("El area del rectangulo es de: " + area);
        System.out.println("=======================================");
    }
    private static void getPerimetro(int longitud, int ancho) {
        var perimetro = (longitud * 2) + (ancho * 2);
        System.out.println("=======================================");
        System.out.println("El perimetro del rectangulo es de: " + perimetro);
        System.out.println("=======================================");
    }
}
