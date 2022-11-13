package com.company;

public class Main3 {

    public static void main(String[] args) {
        Calulator kalk = new Calulator();

        kalk.powitanie();
        kalk.pobranLiczbaA("Podaj piersza liczba a ");
        kalk.pobranLiczbaB("Podaj piersza liczba a ");
        kalk.menu();
        kalk.pobranLiczbaWybor("Twój wybór: ");
        kalk.obliczenia2();

    }
}
