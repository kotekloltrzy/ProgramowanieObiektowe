package zad7;

public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    double Distance(Point p2){
        int dx = x - p2.x;
        int dy = y - p2.y;
        double dis = Math.sqrt(dx*dx + dy*dy);
        return dis;
    }
}
