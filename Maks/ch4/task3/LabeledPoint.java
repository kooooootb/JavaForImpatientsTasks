package ch4.task3;

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
        return "X: " + this.x + ", Y: " + this.y + ", label = " + getLabel();
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
        LabeledPoint p1 = new LabeledPoint("p1", 1.1, 2.2);

        System.out.println("Point #1:" + p1);
    }
}
