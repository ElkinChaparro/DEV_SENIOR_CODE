package MODULO01.CLASE03;

/*## Ejercicio 5: ¿Cuánto te ha costado el ordenador?
El videojuego en el ordenador está viviendo una nueva época
de oro con un montón de juegos exclusivos. Para comprarte un PC Gamer
deberás fijarte principalmente en el procesador, la tarjeta gráfica,
la memoria RAM... pero sobre todo en los accesorios como el teclado y ratón.

Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio
cuesta 660€ con todos los accesorios incluidos. Sin embargo, el vendedor
te descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en total
por el ordenador con todos los accesorios?*/
public class Ejercicio_05 {
    public static void main(String[] args) {
        var precioOrdenador = 660;
        var descuento = precioOrdenador * 0.10;
        var precioFinal = precioOrdenador - descuento;

        System.out.println("El precio del ordenador sin descuento es de: "+precioOrdenador);
        System.out.println("El precio con pago de contado del ordenadr es de: "+precioFinal);
        System.out.println("Total descuento: "+descuento);
    }
}
