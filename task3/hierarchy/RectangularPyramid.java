package task3.hierarchy;

public class RectangularPyramid extends RectangularBased {
    private double height;

    public RectangularPyramid(double x, double y, double height) {
        super(x, y);
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
        return 1/3 * calculateBaseArea() * height;
    }

    @Override
    public String toString() {
        return "Четырёхугольная пирамида со сторонами основания " +
                "(" + getX() + ", " + getY() +  ") " +
                "и h = " + height;
    }
}

