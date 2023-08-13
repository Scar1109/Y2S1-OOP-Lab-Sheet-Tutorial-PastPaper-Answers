import java.lang.Math;
import java.text.DecimalFormat;

class Point3D {
    private double x, y, z;

    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
}

public class PointApp {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Point3D P1 = new Point3D(3.0, 4.0, 5.0);
        Point3D P2 = new Point3D(-1.0, 2.5, -6.0);

        System.out.println("Distance to point 01 is " + df.format(P1.distance()));
        System.out.println("Distance to point 01 is " + df.format(P2.distance()));
    }
}
