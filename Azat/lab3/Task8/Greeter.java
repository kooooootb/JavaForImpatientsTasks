package ch3.Task8;

public class Greeter implements Runnable{
    private final int n;
    private final String target;
    Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }
    public void run(){
        for(int i = 0;i < n;++i){
            System.out.printf("Hello, %s\n", target);
        }
    }
    public static void main(String[] args){
        Greeter g1 = new Greeter(10, "first");
        Greeter g2 = new Greeter(5, "second");
        Greeter g3 = new Greeter(5, "third");
        Greeter g4 = new Greeter(5, "fourth");

        Thread t1 = new Thread(g1);
        t1.start();
        Thread t2 = new Thread(g2);
        t2.start();
        Thread t3 = new Thread(g3);
        t3.start();
        Thread t4 = new Thread(g4);
        t4.start();
    }
}