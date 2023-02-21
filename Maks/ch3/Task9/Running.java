package ch3.Task9;

public class Running {
    public static void runTogether(Runnable ...tasks){
        for(Runnable task : tasks){
            Thread thread = new Thread(task);
            thread.start();
        }
    }
    public static void runInOrder(Runnable ...tasks){
        for(Runnable task : tasks){
            task.run();
        }
    }
    public static void main(String[] args){
        Runnable r1 = () -> System.out.println("first");
        Runnable r2 = () -> System.out.println("second");
        Runnable r3 = () -> System.out.println("third");
        Runnable r4 = () -> System.out.println("fourth");
        System.out.println("In order:");
        runInOrder(r1, r2, r3, r4);
        System.out.println("Together:");
        runTogether(r1, r2, r3, r4);
    }
}
