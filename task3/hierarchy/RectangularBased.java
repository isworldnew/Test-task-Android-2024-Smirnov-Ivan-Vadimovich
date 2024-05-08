package task3.hierarchy;

public abstract class RectangularBased extends ThreeDimensionalShape {
    private double x, y;
    public RectangularBased(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x <= 0) throw new IllegalArgumentException("Side's length should be positive value!");
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        if (y <= 0) throw new IllegalArgumentException("Side's length should be positive value!");
        this.y = y;
    }

    public boolean baseIsSquare() {
        return x == y;
    }

    @Override
    public double calculateBaseArea() {
        return x * y;
    }
}
