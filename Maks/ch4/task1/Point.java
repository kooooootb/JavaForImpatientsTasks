package ch4.task1;

public class Point {
    private double x;
    private double y;
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
    public static void main(String[] args) {
        Point p = new Point(1.1,2.2);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}
