package com.company;

import java.util.Scanner;

public class Calulator {

    private double a, b;// wynik;
    private int wybor;

    public Calulator(){
        a = 1;
        b = 1;
        wybor = 0;
    }

    public Calulator(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public int getWybor() {
        return wybor;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setWybor(int wybor) {
        this.wybor = wybor;
    }

    public void powitanie(){
        System.out.println("\tKalkulator");
        System.out.println("-------------------\n");
    }

   public double pobranLiczba (String str){
        System.out.println(str);
        return Double.parseDouble(new Scanner(System.in).next());
    }

    public void pobranLiczbaA (String str){
        System.out.println(str);
        this.a = Double.parseDouble(new Scanner(System.in).next());
    }

    public void pobranLiczbaB (String str){
        System.out.println(str);
        this.a = Double.parseDouble(new Scanner(System.in).next());
    }

    public void pobranLiczbaWybor (String str){
        System.out.println(str);
        this.wybor = Integer.parseInt(new Scanner(System.in).next());
    }

    public void menu(){
        System.out.println("\nWybierz działanie:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Modulo");
        System.out.println("0. Wyjście");
        //System.out.println("Twój wybór: ");
    }

    public void obliczenia2(){
        switch (wybor) {
            case 1 -> {
                System.out.println("Wynik a + b = " + suma(this.a,this.b));
            }
            case 2 -> {
                System.out.println("Wynik a - b = " + odejmowane(this.a,this.b));
            }
            case 3 -> {
                System.out.println("Wynik a * b = " + mnozenie(this.a,this.b));
            }
            case 4 -> {
                if (this.b == 0) {
                    System.out.println("Nie dzieli się przez zero!!!");
                } else {
                    System.out.println("Wynik a / b = " + dzielenie(this.a,this.b));
                }
            }
            case 5 -> {
                System.out.println("Wynik a % b = " + modulo(this.a,this.b));
            }
            case 0 -> System.out.println("Rozumiem, że już nie liczysz...");
            default -> System.out.println("Wybrales złą opcje");
        }
    }

    public double suma(double a, double b){

        return a + b;
    }
    public double odejmowane(double a, double b){

        return a - b;
    }

    public double mnozenie(double a, double b){

        return a * b;
    }
    public double dzielenie(double a, double b){

        return a / b;
    }
    public double modulo(double a, double b){

        return a % b;
    }

}
