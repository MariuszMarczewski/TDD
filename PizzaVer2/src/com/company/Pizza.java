package com.company;

public class Pizza {

    String nazwa;
    int cena;
    int lporz;

    public Pizza(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        return  nazwa + " " + cena;
    }
}
