package com.company;

import java.util.Scanner;

public class Main2 {

    public static void powitanie(){
        System.out.println("\tKalkulator");
        System.out.println("-------------------\n");
    }

    public static double pobranLiczba (String str){
        System.out.println(str);
        return Double.parseDouble(new Scanner(System.in).next());
    }

    public static void menu(){
        System.out.println("\nWybierz działanie:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Modulo");
        System.out.println("0. Wyjście");
        //System.out.println("Twój wybór: ");
    }

    public static void obliczenia1(double a, double b, int wybor){
        double wynik;
        switch (wybor) {
            case 1 -> {
                wynik = a + b;
                System.out.println("Wynik a + b = " + wynik);
            }
            case 2 -> {
                wynik = a - b;
                System.out.println("Wynik a - b = " + wynik);
            }
            case 3 -> {
                wynik = a * b;
                System.out.println("Wynik a * b = " + wynik);
            }
            case 4 -> {
                if (b == 0) {
                    System.out.println("Nie dzieli się przez zero!!!");
                } else {
                    wynik = a / b;
                    System.out.println("Wynik a / b = " + wynik);
                }
            }
            case 5 -> {
                wynik = a % b;
                System.out.println("Wynik a % b = " + wynik);
            }
            case 0 -> System.out.println("Rozumiem, że już nie liczysz...");
            default -> System.out.println("Wybrales złą opcje");
        }
    }

    public static void obliczenia2(double a, double b, int wybor){
       switch (wybor) {
            case 1 -> {
                System.out.println("Wynik a + b = " + suma(a,b));
            }
            case 2 -> {
                System.out.println("Wynik a - b = " + odejmowane(a,b));
            }
            case 3 -> {
                System.out.println("Wynik a * b = " + mnozenie(a,b));
            }
            case 4 -> {
                if (b == 0) {
                    System.out.println("Nie dzieli się przez zero!!!");
                } else {
                   System.out.println("Wynik a / b = " + dzielenie(a,b));
                }
            }
            case 5 -> {
                System.out.println("Wynik a % b = " + modulo(a,b));
            }
            case 0 -> System.out.println("Rozumiem, że już nie liczysz...");
            default -> System.out.println("Wybrales złą opcje");
        }
    }

    public static double suma(double a, double b){

        return a + b;
    }
    public static double odejmowane(double a, double b){

        return a - b;
    }

    public static double mnozenie(double a, double b){

        return a * b;
    }
    public static double dzielenie(double a, double b){

        return a / b;
    }
    public static double modulo(double a, double b){

        return a % b;
    }

    public static void main(String[] args) {
       // Scanner klaw = new Scanner(System.in);
        double a, b;// wynik;
        int wybor;

        powitanie();

        a = pobranLiczba("Podaj pierwsza liczbę:");
        b = pobranLiczba("Podaj drugą liczbę:");

        menu();

        wybor = (int)pobranLiczba("Twój wybór: ");

        // obliczenia1(a, b, wybor);

        obliczenia2(a,b,wybor);

    }
}
