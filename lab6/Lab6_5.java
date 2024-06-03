class ThreeDPoint extends MyPoint {
    private double z;

    public ThreeDPoint() {
        super();
        this.z = 0;
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double distance(MyPoint other) {
        ThreeDPoint other3D = (ThreeDPoint) other;
        double dx = this.getX() - other3D.getX();
        double dy = this.getY() - other3D.getY();
        double dz = this.z - other3D.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class Lab6_5 {
    public static void main(String[] args) {
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10, 30, 25.5);
        double distance = p1.distance(p2);
        System.out.println("Distance between p1 and p2: " + distance);
    }
}