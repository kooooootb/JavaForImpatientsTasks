package ch4.task4;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(Point topLeft, double width, double height){
        super(topLeft);
        this.width = width;
        this.height = height;
    }
    @Override
    public Point getCenter(){
        Point center = getPoint().clone();
        center.moveBy(width / 2, height / 2);
        return center;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(3,3), 10, 10);
        System.out.println("Center: " + rectangle.getCenter());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        double dx = 3, dy = 3;
        rectangle.moveBy(dx, dy);
        System.out.println("Moved by (" + dx + ", " + dy + ")");
        System.out.println("Center: " + rectangle.getCenter());
    }
}
