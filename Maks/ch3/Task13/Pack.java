package ch3.Task13;

public class Pack {
    static Runnable pack(Runnable ...tasks){
        return () -> {
            for(Runnable task : tasks){
                task.run();
            }
        };
    }
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("a");
        Runnable r2 = () -> System.out.println("b");
        Runnable r3 = () -> System.out.println("c");
        Runnable r4 = () -> System.out.println("d");
        Runnable r5 = () -> System.out.println("e");

        pack(r1, r2, r3, r4, r5).run();
    }
}
