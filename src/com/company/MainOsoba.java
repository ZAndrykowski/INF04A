package com.company;

import java.util.Scanner;

public class MainOsoba {
    public static void main(String[] args) {

        Osoba ja = new Osoba();
        Osoba ty = new Osoba();
/*
        // to podejście jest złe bo jest niebezpieczne
        ja.imie = "Adam";
        ja.waga = 100; // w kg
        ja.wzrost = 1.85; // w m
        System.out.println("Twoje BMI " + ja.imie + " = " + ja.bmi(ja.waga,ja.wzrost));

        ty.imie = "Jola";
        ty.waga = 72; // w kg
        ty.wzrost = 1.67; // w m
        System.out.println("Twoje BMI " + ty.imie + " = " + ty.bmi(ty.waga,ty.wzrost));
*/

        //ja.setWaga(90);
       // ja.setWzrost(1.85);
        //ja.setImie("Adam");
       // System.out.println("Twoje BMI " + ja.getImie() + " = " + ja.bmi());

        Osoba ona1 = new Osoba("Ala",50,1.6);
        System.out.println("Twoje BMI " + ona1.getImie() + " = " + ona1.bmi());

        Osoba ona2 = new Osoba();
        System.out.println("Twoje BMI " + ona2.getImie() + " = " + ona2.bmi());
        ona2.setImie("Basia");
        ona2.setWzrost(1.6);
        ona2.setWaga(60);
        System.out.println("Twoje BMI " + ona2.getImie() + " = " + ona2.bmi());
        System.out.println("Twoje BMI " + ona2.getImie() + " = " + ona2.bmi(50,1.6));
    }
}
