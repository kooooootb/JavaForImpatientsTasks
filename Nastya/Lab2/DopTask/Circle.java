package Lab2.DopTask;

import java.util.ArrayList;
import static java.lang.Math.PI;

public class Circle {
    public static class Point {
        private double x;
        private double y;

        public Point() { x = 0.0; y = 0.0; }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() { return x; }
        public void setX(double x) {
            this.x = x;
        }

        public double getY() { return y; }
        public void setY(double y) {
            this.y = y;
        }
        public String toString(){
            return "(" + x + ", " + y + ")";
        }
        public boolean equals(Object object){
            if(this == object){
                return true;
            }
            if(object == null){
                return false;
            }
            if(object.getClass() != this.getClass()){
                return false;
            }
            Point point = (Point) object;
            return point.x == this.x && point.y == this.y;
        }

        public Point move(double dx, double dy){
            return new Point(x + dx, y + dy);
        }
    }
//    private static final double PI = Math.PI;
    private Point center;
    private double radius;

    public Circle() {
        center = new Point();
        radius = 0;
    }

    public Circle(double x, double y, double r) {
        center = new Point(x, y);
        radius = r;
    }

    public Circle(Point c, double r) {
        center = c;
        radius = r;
    }

    public Point getCenter() {
        return center;
    }
    public void setCenter(Point c) {
        center = c;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }

    public double area() {
        return PI*Math.pow(radius, 2);
    }

    public double length() {
        return 2*PI*radius;
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null){
            return false;
        }
        if(object.getClass() != this.getClass()){
            return false;
        }
        Circle circle = (Circle) object;
        return circle.center.equals(this.center) && this.radius == circle.radius;
    }

    public double distance(Circle circle) {
        return Math.sqrt(Math.pow((center.x - circle.center.x), 2) + Math.pow((center.y - circle.center.y), 2));
    }

    public ArrayList<Point> crossing(Circle circle) {
        double d = distance(circle);
        ArrayList<Point> points = new ArrayList<>();
        // окружности совпадают
        if (this.equals(circle))
            return null;

        // окружности не пересекаются
        if ((d > (radius+circle.radius)) || (d < Math.abs(radius-circle.radius)))
            return points;

        // 1 или 2 точки пересечения
        double d1 = (Math.pow(radius, 2) - Math.pow(circle.radius, 2) + Math.pow(d, 2)) / (2*d);
        double h = Math.sqrt(Math.pow(radius, 2) - Math.pow(d1, 2));
        Point middle = new Point(center.x + (d1 * (circle.center.x - center.x)) / d, center.y + (d1 * (circle.center.y - center.y)) / d);

        double xOffset = (h * (circle.center.y - center.y)) / d;
        double yOffset = (h * (circle.center.x - center.x)) / d;
        if(xOffset == 0 && yOffset == 0){ // 1 Точка
            points.add(middle);
        } else{
            points.add(middle.move(xOffset, -yOffset));
            points.add(middle.move(-xOffset, yOffset));
        }

        return points;
    }
    public static void test(double x1, double y1, double r1, double x2, double y2, double r2){
        Circle circle1 = new Circle(new Point(x1, y1), r1);
        Circle circle2 = new Circle(new Point(x2, y2), r2);

        ArrayList<Point> points = circle1.crossing(circle2);
        if(points == null){
            System.out.println("Infinite intersection points");
        } else {
            System.out.print("Intersections: ");
            for (Point el : points) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Point center = new Point(1, 0);
        Circle circle = new Circle(center, 1);
        System.out.println("Area: " + circle.area() + ", length: " + circle.length());

        test(0,0,1,0,0,1); // should be infinite
        test(0,0,10,1,0,1); // should be 0 points
        test(2,0,1,0,0,1); // should be 1 point
        test(2,0,2,0,0,2); // should be 2 points

    }
}