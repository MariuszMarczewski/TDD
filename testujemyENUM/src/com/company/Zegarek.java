package com.company;

public enum Zegarek {

    LEGIA_WARSZAWA(1979, "porażka"),
    RUCH_CHORZOW(1983, "bankrut"),
    WARTA_PLOCK(1987, "neutralnie"),
    ;

    private int rok;
    private String opis;

    Zegarek(int rok, String opis) {
        this.rok = rok;
        this.opis = opis;
    }

    public int getRok() {
        return rok;
    }

    public String getOpis() {
        return opis;
    }

    @Override
    public String toString() {
        return super.toString() +
                "rok=" + rok +
                ", opis='" + opis + '\'' +
                '}';
    }
}


