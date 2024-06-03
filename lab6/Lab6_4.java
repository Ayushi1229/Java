class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}

public class Lab6_4 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,4);
        MyPoint p2 = new MyPoint(6,8);
        double distance = p1.distance(p2);
        System.out.println("Distance between p1 and p2: " + distance);
        
    }
}