package Fuctions;

import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ExampleMath();
        ExampleRandom();

    }

    private static void ExampleRandom() {
        var random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10));
        }

    }

    private static void ExampleMath() {
        System.out.println(Math.min(5, 7));
        System.out.println(Math.sqrt(125));
        System.out.println(Math.pow(2, 3));
    }
}
