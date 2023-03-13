package ch4.task4;

public class Line extends Shape {
    private Point vector;
    public Line(Point from, Point to){
        super(from);
        vector = new Point(to.getX() - from.getY(), to.getY() - from.getY());
    }
    @Override
    public Point getCenter(){
        Point center = getPoint().clone();
        center.moveBy(vector.getX() / 2, vector.getY() / 2);
        return center;
    }
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 1), new Point(3, 5));
        System.out.println("Center: " + line.getCenter());
        double dx = 3, dy = 5;
        line.moveBy(dx, dy);
        System.out.println("Moved by (" + dx + ", " + dy + ")");
        System.out.println("Center: " + line.getCenter());
    }
}
