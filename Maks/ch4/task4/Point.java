package ch4.task4;

import java.util.Objects;

public class Point implements Cloneable {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void moveBy(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }
    @Override
    public Point clone(){
        try {
            return (Point) super.clone();
        } catch(CloneNotSupportedException ex){
            return null;
        }
    }
    @Override
    public String toString(){
        return "Point x = " + getX() + ", y = " + getY();
    }
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null){
            return false;
        }
        if(this.getClass() != object.getClass()){
            return false;
        }
        Point p = (Point) object;
        return Double.valueOf(this.x).equals(p.x) && Double.valueOf(this.y).equals(p.y);
    }
    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }
    public static void main(String[] args) {
        Point p1 = new Point(1.1,2.2);
        Point p2 = new Point(1.1,2.2);
        Point p3 = new Point(2.1,2.2);

        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        System.out.println("p3:" + p3);
        System.out.println("p1 == p2" + p1.equals(p2));
        System.out.println("p1 == p3" + p1.equals(p3));
        System.out.println(p1.hashCode());
    }
}
