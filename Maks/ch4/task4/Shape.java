package ch4.task4;

abstract public class Shape {
    private Point point;
    Shape(Point point){
        this.point = point;
    }
    public void moveBy(double dx, double dy){
        point.moveBy(dx, dy);
    }
    abstract public Point getCenter();
    public void setPoint(Point point){
        this.point = point;
    }
    public Point getPoint(){
        return point;
    }
}
