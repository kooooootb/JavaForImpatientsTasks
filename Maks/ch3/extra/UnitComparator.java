package ch3.extra;

public class UnitComparator implements Comparator<Unit>{
    public int compare(Unit u1, Unit u2){
        return u1.getMeasure() - u2.getMeasure();
    }
}
