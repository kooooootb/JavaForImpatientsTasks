package ch4.task4;

public class Line extends Shape {
    private Point from, to;
    public Line(Point from, Point to){
        super(from);
        this.from = from;
        this.to = to;
    }
    @Override
    public Point getCenter(){
        return getPoint().clone().moveBy((to.getX() - from.getX()) / 2, (to.getY() - from.getY()) / 2);
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
