package ch4.task5;

public class Circle extends Shape implements Cloneable {
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
    public Circle clone(){
        Circle cloned = (Circle) super.clone();
        cloned.radius = radius;
        return cloned;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1.2, 2.3), 3);
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Radius: " + circle.getRadius());

        Circle cloned = circle.clone();
        System.out.println("Cloned");

        double dx = 3, dy = 3;
        circle.moveBy(dx, dy);
        System.out.println("Moved by (" + dx + ", " + dy + ")");
        System.out.println("Center: " + circle.getCenter());

        System.out.println("Cloned center: " + cloned.getCenter());
        System.out.println("Cloned radius: " + cloned.getRadius());
    }
}
