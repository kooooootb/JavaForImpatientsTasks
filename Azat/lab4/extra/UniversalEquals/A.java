package ch4.extra.UniversalEquals;

public class A {
    private final int value;
    private final String string;
    private A a;
    A(int value, String string){
        this.value = value;
        this.string = string;
    }
    public void setA(A a){
        this.a = a;
    }
}
