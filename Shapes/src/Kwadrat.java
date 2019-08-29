public class Kwadrat extends Figura {
    private int bok;

    public Kwadrat(String name) {
        super(name);
    }

    public int getBok() {
        return bok;
    }

    public void setBok(int bok) {
        this.bok = bok;
    }

    @Override
    public double getObwod() {
        return 4 * bok;
    }

    @Override
    public double getPole() {
        return bok * bok;
    }
}

