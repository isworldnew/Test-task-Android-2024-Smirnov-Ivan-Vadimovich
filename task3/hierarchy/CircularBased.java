package task3.hierarchy;

public abstract class CircularBased extends ThreeDimensionalShape {
    private double radius;
    public CircularBased(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius should be positive value!");
        this.radius = radius;
    }
    @Override
    public double calculateBaseArea() {
        return Math.PI * radius * radius;
    }
}
