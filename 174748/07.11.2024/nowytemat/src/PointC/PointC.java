package PointC;

public class PointC {
    public int x;
    public int y;

    public PointC(int x, int y){
        this.x = x;
        this.y = y;
    }

    public PointC CreatePointC(PointR pointR){
        return new PointC(pointR.x(), pointR.y());
    }
}
