package ch4.task4;

public class Circle extends Shape {
    private double radius;
    public Circle(Point center, double radius){
        super(center);
        this.radius = radius;
    }
    @Override
    public Point getCenter(){
        return getPoint();
    }
    public double getRadius(){
        return radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1.2, 2.3), 3);
        System.out.println("Center: " + circle.getCenter());
        double dx = 3, dy = 3;
        circle.moveBy(dx, dy);
        System.out.println("Moved by (" + dx + ", " + dy + ")");
        System.out.println("Center: " + circle.getCenter());
    }
}
