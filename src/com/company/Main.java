package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    //Zadatak 1

    public static void naRaspon100(Function<Double, Double> func) {
        for(double i = 0; i <= 100; i++) {
            System.out.println(func.apply(i));
        }
    }

    public static void zadatak1(){
        System.out.println("Unesite koeficijente a, b, c");
        Scanner s = new Scanner(System.in);
        double a, b, c;
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        naRaspon100(x -> a*x*x + b*x + c);
    }

    //Zadatak 2

    private static int sumaCif(int n){
        int suma = 0;
        while(n != 0){
            suma = suma + (n%10);
            n = n/10;
        }
        return suma;
    }

    public static void zadatak2(){
        Integer [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(array, (x, y) -> sumaCif(x) - sumaCif(y));
        for(int e : array) {
            System.out.println(e);
        }
    }

    //Zadatak 3

    public static void zadatak3() {
        int[] brojevi = {45,12,85,32,89,39,69,44,42,1,6,8};

        brojevi = Arrays.stream(brojevi).
                boxed().
                sorted((x, y) -> sumaCif(x) - sumaCif(y)).
                mapToInt(i -> i).
                toArray();

        for(int e : brojevi){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        zadatak3();
    }

}
