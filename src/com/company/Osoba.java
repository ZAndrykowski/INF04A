package com.company;

public class Osoba {

    private String imie;
    private double waga;
    private double wzrost;

    public Osoba(){
        imie= "Test";
        waga = 1.0;
        wzrost = 1.0;
    }
    public Osoba(String imie){
        this.imie = imie;
        this.waga = 0;
        this.wzrost = 0;
    }

    public Osoba(String imie, double waga, double wzrost){
        this.imie = imie;
        this.waga = waga;
        this.wzrost = wzrost;
    }

   /* public void setImie(String imie1){
        imie = imie1;
    }*/
   public void setImie(String imie){
       this.imie = imie;
   }

    public String getImie(){
        return imie;
    }

    public void setWaga(double waga1){
        waga = waga1;
    }

    public double getWaga(){
        return waga;
    }

    public void setWzrost(double wzrost1){
        wzrost = wzrost1;
    }

    public double getWzrost(){
        return wzrost;
    }

    public double bmi(double waga, double wzrost){
        return waga/(wzrost*wzrost);
    }

    public double bmi(){
        return waga/(wzrost*wzrost);
    }
}
