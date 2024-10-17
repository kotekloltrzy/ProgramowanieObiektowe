package Point;
import java.lang.Math;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static double distance(Point point1, Point point2) {
        double wynik = (point2.x - point1.x)*(point2.x - point1.x) + (point2.y - point1.y)*(point2.y - point1.y);
        wynik = Math.sqrt(wynik);
        return wynik;
    }
}