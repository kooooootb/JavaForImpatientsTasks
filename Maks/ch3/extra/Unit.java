package ch3.extra;

public class Unit {
    final private int measure;
    final private int second;
    Unit(int m, int s){
        this.measure = m;
        this.second = s;
    }
    public int getMeasure(){
        return measure;
    }
    public int getSecond(){
        return second;
    }
}
