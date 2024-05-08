package task3.hierarchy;

public class TriangularPrism extends TriangularBased {
    private double height;

    public TriangularPrism(double x, double y, double z, double height) {
        super(x, y, z);
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
        return "Треугольная призма со сторонами основания " +
                "(" + getX() + ", " + getY() + ", " + getZ() + ") " +
                "и h = " + height;
    }
}
