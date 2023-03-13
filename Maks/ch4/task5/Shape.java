package ch4.task5;

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
    public Shape clone(){
        try{
            Shape shape = (Shape) super.clone();
            shape.point = point.clone();
            return shape;
        } catch(CloneNotSupportedException ex){
            return null;
        }
    }
}
