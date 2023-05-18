package ch3.extra.Comparator;

public class Main {
    public static void main(String[] args) {
        Unit u1 = new Unit(1, 4);
        Unit u2 = new Unit(1, 3);

        Comparator<Unit> comp = new UnitComparator();
        System.out.println(comp.compare(u1, u2));
        System.out.println(comp.thenComparing((ue1, ue2) -> ue1.getSecond() - ue2.getSecond()).compare(u1, u2));
    }
}
