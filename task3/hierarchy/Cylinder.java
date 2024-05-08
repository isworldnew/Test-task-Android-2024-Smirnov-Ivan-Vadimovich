package task3.hierarchy;

public class Cylinder extends CircularBased {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Height should be positive value!");
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return calculateBaseArea() * height;
    }

    @Override
    public String toString() {
        return "Цилиндр с r = " + getRadius() + " и h = " + height;
    }
}

