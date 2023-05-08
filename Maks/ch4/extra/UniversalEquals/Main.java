package ch4.extra.UniversalEquals;

public class Main {
    public static void main(String[] args) {
        A a2 = new A(2, "1");
        A a1 = new A(2, "1");

        a1.setA(a2);
        a2.setA(a1);

        System.out.println(UniversalEquals.equals(a1, a2));
    }
}
