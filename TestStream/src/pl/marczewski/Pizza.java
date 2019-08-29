package pl.marczewski;

public class Pizza {

    String nazwa;
    int cena;
    int lporz;

    public Pizza(String nazwa, int cena, int lporz) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.lporz = lporz;
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

    public int getLporz() {
        return lporz;
    }

    public void setLporz(int lporz) {
        this.lporz = lporz;
    }
}
