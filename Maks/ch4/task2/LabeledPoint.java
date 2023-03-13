package ch4.task2;

import java.util.Objects;

public class LabeledPoint extends Point {
    private String label;
    public LabeledPoint(String label, double x, double y){
        super(x, y);
        this.label = label;
    }
    public String getLabel(){
        return label;
    }
    @Override
    public String toString(){
        return super.toString() + ", label = " + getLabel();
    }
    @Override
    public boolean equals(Object object){
        if(!super.equals(object)){
            return false;
        }
        LabeledPoint lp = (LabeledPoint) object;
        return Objects.equals(this.label, lp.label);
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), label);
    }
    public static void main(String[] args) {
        LabeledPoint p1 = new LabeledPoint("p1", 1.1,2.2);
        LabeledPoint p2 = new LabeledPoint("p1", 1.1,2.2);
        LabeledPoint p3 = new LabeledPoint("p3", 2.1,2.2);
        LabeledPoint p4 = new LabeledPoint("p4", 2.1,2.2);

        System.out.println("Point #1:" + p1);
        System.out.println("Point #2:" + p2);
        System.out.println("Point #3:" + p3);
        System.out.println("Point #4:" + p4);
        System.out.println("Point #1 == Point #2: " + p1.equals(p2));
        System.out.println("Point #1 == Point #3: " + p1.equals(p3));
        System.out.println("Point #3 == Point #4: " + p3.equals(p4));
        System.out.println("Point #1 hash: " + p1.hashCode());
        System.out.println("Point #2 hash: " + p2.hashCode());
        System.out.println("Point #3 hash: " + p3.hashCode());
    }
}
