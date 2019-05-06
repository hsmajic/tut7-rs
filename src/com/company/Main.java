package com.company;

import java.util.Arrays;
import java.util.function.Function;

public class Main {

    public static void naRaspon100(Function<Double, Double> func) {
        for(double i = 0; i <= 100; i++) {
            System.out.println(func.apply(i));
        }
    }

    public static void zadatak1() {
        naRaspon100(x -> x*x + 2*x +);
    }


    public static void main(String[] args) {
	   int brojevi[] = new int[] {
	           11,12,41,12,243,42,123
        };

	   //Arrays.sort(brojevi, (x, y) -> sum(x) - sum(y));

        brojevi = Arrays.stream(brojevi).
        boxed().
        sorted((x, y) -> sum(x) - sum(y)).
        mapToInt(i -> i).
        toArray();


    }
    private static int sum(int x) {
        return x;
    }
}
