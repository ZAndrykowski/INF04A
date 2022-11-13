package com.company;

import java.util.Scanner;

public class Main1 {

    public static void kalc(){
        Scanner klaw = new Scanner(System.in);
        double a, b, wynik;
        int wybor;

        System.out.println("\tKalkulator");
        System.out.println("-------------------\n");

        System.out.println("Podaj pierwszą liczbę: ");
        a = Double.parseDouble(klaw.next());
        System.out.println("Podaj drugą liczbę: ");
        b = Double.parseDouble(klaw.next());

        System.out.println("\nWybierz działanie:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Modulo");
        System.out.println("0. Wyjście");
        System.out.println("Twój wybór: ");
        wybor = Integer.parseInt(klaw.next());

        switch (wybor){
            case 1 -> {
                wynik = a + b;
                System.out.println("Wynik a + b = " + wynik);}
            case 2 ->  {
                wynik = a - b;
                System.out.println("Wynik a - b = " + wynik);}
            case 3 -> {
                wynik = a * b;
                System.out.println("Wynik a * b = " + wynik);}
            case 4 -> {
                if(b==0){
                    System.out.println("Nie dzieli się przez zero!!!");
                }else {
                    wynik = a / b;
                    System.out.println("Wynik a / b = " + wynik);
                }
            }
            case 5 -> {
                wynik = a % b;
                System.out.println("Wynik a % b = " + wynik);}
            case 0 ->  System.out.println("Rozumiem, że już nie liczysz...");
            default -> System.out.println("Wybrales złą opcje");
        }



    }



    public static void main(String[] args) {

        kalc();
    }
}
