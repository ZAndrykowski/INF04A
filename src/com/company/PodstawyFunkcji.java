package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PodstawyFunkcji {

    public static void main(String[] args) {

/*
        int a = 5;
        int b = 3;
        int wynik;
        wynik = a + b;
        System.out.println("wynik = " + wynik);
 */

        //suma1();
       // suma1();
        // suma1();

/*
        suma2(6,8);

        int ola = 7;

        int ala =66;

        suma2(ola, ala);
 */


        Scanner kla = new Scanner(System.in);
        System.out.println("Podaj liczbe a");
        int a = Integer.parseInt(kla.next());
        System.out.println("Podaj liczbe b");
        int b = Integer.parseInt(kla.next());

        //suma2(a, b);



        //suma3();
/*
        System.out.println(suma3());

        int wynik2;
        wynik2 = suma3();

        System.out.println(wynik2);

        wynik2 = suma3() * 2;
        System.out.println(wynik2);
*/

        System.out.println(suma4(4,5));

        int wynik3 = suma4(a, b);

        System.out.println(wynik3);

        kla.close();
    }

    public static void suma1(){

       /*Scanner kla = new Scanner(System.in);
        System.out.println("Podaj liczbe a");
        int a = Integer.parseInt(kla.next());
        System.out.println("Podaj liczbe b");
        int b = Integer.parseInt(kla.next());;
        int wynik;
        wynik = a + b;
        System.out.println("wynik = " + wynik);
        kla.close();*/

        int a = 5;
        int b = 3;
        int wynik;
        wynik = a + b;
        System.out.println("wynik = " + wynik);
    }

    public static void suma2(int a, int b){
        int wynik;
        wynik = a + b;
        System.out.println("wynik = " + wynik);
    }

    public static int suma3(){
        int a = 5;
        int b = 3;
        int wynik;
        wynik = a + b;
        //System.out.println("wynik = " + wynik);


        //return a + b;
        return wynik;
    }

    public static int suma4(int a, int b){
        //int a = 5;
        //int b = 3;
        int wynik;
        wynik = a + b;
       // System.out.println("wynik = " + wynik);

        // return a + b;
        return wynik;
    }

}
