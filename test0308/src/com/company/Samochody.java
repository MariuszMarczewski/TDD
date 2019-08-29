package com.company;

public class Samochody {

    private String marka;
    private int rok;

    public Samochody(String marka, int rok) {
        this.marka = marka;
        this.rok = rok;
    }

    public String getMarka() {
        return marka;
    }

    public int getRok() {
        return rok;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    @Override
    public String toString() {
        return marka + " " + rok;

    }
}
