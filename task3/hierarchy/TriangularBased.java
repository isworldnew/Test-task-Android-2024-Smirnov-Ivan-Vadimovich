package task3.hierarchy;

public abstract class TriangularBased extends ThreeDimensionalShape {
    private double x, y, z;

    public TriangularBased(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x <= 0) throw new IllegalArgumentException("Side's length should be positive value!");
        if (x >= y + z) throw new IllegalArgumentException("Every side's length should be less than the sum of other two");
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        if (y <= 0) throw new IllegalArgumentException("Side's length should be positive value!");
        if (y >= x + z) throw new IllegalArgumentException("Every side's length should be less than the sum of other two");
        this.y = y;
    }

    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        if (z <= 0) throw new IllegalArgumentException("Side's length should be positive value!");
        if (z >= x + y) throw new IllegalArgumentException("Every side's length should be less than the sum of other two");
        this.z = z;
    }

    @Override
    public double calculateBaseArea() {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }
}

