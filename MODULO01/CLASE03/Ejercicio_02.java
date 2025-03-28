package MODULO01.CLASE03;

/*## Ejercicio 2: ¿Ves algún error en el precio?
En el mercado, podemos encontrar que el precio del producto
**Pernil Iberic D'Engreix Llen. Azuaga** en porción de 100
gramos cuesta 5,95€ y el vendedor nos dice que el precio por
kilo cuesta 29,75€. ¿Crees que es correcto el precio?

En este reto tienes que hacer un programa que calcule
correctamente el precio por kilo del producto.*/

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        var pesoBase = 100;
        var valorBase = 5.59;
        var entrada = new Scanner(System.in);
        System.out.println("Digite el peso del producto");
        var pesoProducto = entrada.nextInt();
        var precioFinal = pesoProducto/pesoBase*valorBase;
        var valorCobrado = 29.75;
        System.out.println("El precio cobrado por el tendero es de "+valorCobrado+" Cuando debio cobrarte "+precioFinal+ " agradece");
        entrada.close();
    }
}
