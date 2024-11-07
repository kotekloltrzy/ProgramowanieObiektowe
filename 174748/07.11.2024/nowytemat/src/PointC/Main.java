package PointC;

public class Main {
    public static void main(String[] args) {
        PointC c1 = new PointC(12, 10);
        PointR r1 = new PointR(14, 40);
        PointC c2 = c1.CreatePointC(r1);
        PointR r2 = r1.CreatePointR(c1);
        System.out.println(c1.x + " " + c1.y);
        System.out.println(c2.x + " " + c2.y);
        System.out.println(r1.x() + " " + r1.y());
        System.out.println(r2.x() + " " + r2.y());
    }
}
