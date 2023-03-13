package ch4.task3;

import java.util.Objects;

public class Point {
    protected double x;
    protected double y;
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
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
