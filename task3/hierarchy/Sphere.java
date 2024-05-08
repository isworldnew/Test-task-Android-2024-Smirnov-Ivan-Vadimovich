package task3.hierarchy;

public class Sphere extends CircularBased {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double calculateVolume() {
        return 4/3 * calculateBaseArea() * getRadius();
    }

    @Override
    public String toString() {
        return "Шар с r = " + getRadius();
    }
}
