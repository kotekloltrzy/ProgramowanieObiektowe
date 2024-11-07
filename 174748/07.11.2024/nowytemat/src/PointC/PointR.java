package PointC;

public record PointR(int x, int y) {
    public PointR CreatePointR(PointC pointC){
        return new PointR(pointC.x, pointC.y);
    }
}
