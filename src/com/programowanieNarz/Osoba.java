package com.programowanieNarz;

public class Osoba {
    String imie;
    String nazwisko;
    int wiek;

    public Osoba() {
        imie="";
        nazwisko="";
        wiek = 0;
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
}
