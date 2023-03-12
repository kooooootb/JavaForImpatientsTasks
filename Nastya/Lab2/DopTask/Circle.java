package Lab2.DopTask;

import java.util.ArrayList;

public class Circle {
    private static class Point {
        private double x;
        private double y;

        Point() { x = 0.0; y = 0.0; }

        Point(double x, double y) {
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
        public void print() {
            System.out.println("("+ x +"; " + y + ")");
        }
    }
    private static final double PI = Math.PI;
    private Point center;
    public double radius;

    Circle() {
        center = new Point();
        radius = 0;
    }

    Circle(double x, double y, double r) {
        center = new Point(x, y);
        radius = r;
    }

    Circle(Point c, double r) {
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

    public double distance(Circle circle) {
        return Math.sqrt(Math.pow((center.x - circle.center.x), 2) + Math.pow((center.y - circle.center.y), 2));
    }

    public ArrayList<Point> crossing(Circle circle) {
        // окружности совпадают
        if (circle.radius == radius && circle.center == center)
            return null;
        // окружности не пересекаются
        if ((distance(circle) > (radius+circle.radius)) || (distance(circle) < Math.abs(radius-circle.radius)))
            return null;
        // 1 или 2 точки пересечения
        ArrayList<Point> points = new ArrayList<>();
        double x_offset = circle.center.x - center.x;
        double y_offset = circle.center.y - center.y;

        double A = -2*x_offset, B= -2*y_offset;
        double C = Math.pow(x_offset, 2) + Math.pow(y_offset, 2) + Math.pow(radius, 2) - Math.pow(circle.radius, 2);

        double denominator = Math.pow(A, 2) + Math.pow(B, 2);
        // 1 точка
        if (Math.pow(C, 2) == Math.pow(radius, 2)*denominator) {
            Point point = new Point(-A*C/denominator, -B*C/denominator);
            points.add(point);
            return points;
        }
        // 2 точки
        if (Math.pow(C, 2) < Math.pow(radius, 2)*denominator) {
            double d = Math.pow(radius, 2) - Math.pow(C, 2)/denominator;
            double m = Math.sqrt(d/denominator);
            Point point1 = new Point(-A*C/denominator + B*m + center.x, -B*C/denominator - A*m + center.y);
            Point point2 = new Point(-A*C/denominator - B*m + center.x, -B*C/denominator + A*m + center.y);
            points.add(point1);
            points.add(point2);
            return points;
        }
        return null;
    }

    public static void main(String[] args) {
        Point center1 = new Point(1, 0);
        Circle circle1 = new Circle(center1, 1);
        Point center2 = new Point(0, -2);
        Circle circle2 = new Circle(center2, 2);
        System.out.println(circle1.area());
        System.out.println(circle2.length());
        ArrayList<Point> points = circle1.crossing(circle2);
        for (Point el: points) {
            el.print();
        }
    }
}