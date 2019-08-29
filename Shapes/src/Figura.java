public abstract class Figura implements GeometriaInterface {
    private String name;

    public Figura(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}