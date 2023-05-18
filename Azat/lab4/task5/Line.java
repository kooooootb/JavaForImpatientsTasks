package ch4.task5;

public class Line extends Shape implements Cloneable {
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
    public Line clone(){
        Line cloned = (Line) super.clone();
        cloned.vector = this.vector.clone();
        return cloned;
    }
    public static void main(String[] args) {
        Line line = new Line(new Point(1, 1), new Point(3, 5));
        System.out.println("Center: " + line.getCenter());

        Line cloned = line.clone();
        System.out.println("Cloned");

        double dx = 3, dy = 3;
        line.moveBy(dx, dy);
        System.out.println("Moved by (" + dx + ", " + dy + ")");
        System.out.println("Center: " + line.getCenter());

        System.out.println("Cloned center: " + cloned.getCenter());
    }
}
