package task3.hierarchy;

public class Parallelepiped extends RectangularBased {
    private double height;

    public Parallelepiped(double mutualSideLength) {
        this(mutualSideLength, mutualSideLength, mutualSideLength);
    }

    public Parallelepiped(double x, double y, double height) {
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

    public boolean isCube() {
        return getX() == getY() && getY() == height;
    }

    @Override
    public double calculateVolume() {
        return calculateBaseArea() * height;
    }

    @Override
    public String toString() {
        if (isCube()) return  "Куб со стороной " + getX();

        return "Параллелепипед со сторонами ("
                + getX() + ", " + getY() + ", " + height + ")";
    }
}

