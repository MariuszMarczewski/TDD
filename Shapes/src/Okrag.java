public class Okrag extends Figura implements GeometriaInterface {
    private double promien;

    public Okrag(String name) {
        super(name);
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    @Override
    public double getObwod() {
        return 2*Math.PI*promien;
    }

    @Override
    public double getPole() {
        return Math.PI*(promien*promien);
    }
}
