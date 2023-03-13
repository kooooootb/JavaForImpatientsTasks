package ch4.task1;

public class LabeledPoint extends Point{
    private String label;
    public LabeledPoint(String label, double x, double y){
        super(x, y);
        this.label = label;
    }
    public String getLabel(){
        return label;
    }
    public static void main(String[] args) {
        LabeledPoint lp = new LabeledPoint("default", 4.4, 5.5);
        System.out.println(lp.getLabel());
        System.out.println(lp.getX());
        System.out.println(lp.getY());
    }
}
