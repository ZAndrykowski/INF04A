package com.company;

import java.util.Scanner;

public class FunctionsForBeginners {
    public static void main(String[] args) {
        sum1();
    }
    public static void sum1(){
        Scanner scan = new Scanner(System.in);
        menu(scan);
        scan.close();
    }
    public static int sum2(int a, int b){
        int result;
        result = a + b;
        System.out.println("result: " + result);
        return result;
    }
    public static int menu(Scanner scan){
        System.out.println("Podaj liczbe a: ");
        int a = Integer.parseInt(scan.next());
        System.out.println("Podaj liczbe b: ");
        int b = Integer.parseInt(scan.next());
        int result = sum2(a, b);
        scan.close();
        return result;

    }
}
