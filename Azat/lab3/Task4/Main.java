package ch3.Task4;

public class Main{
    public static void main(String[] args) {
        IntSequence seq1 = IntSequence.of(3, 1, 4, 1, 5, 9);
        System.out.println("Sequence:");
        while(seq1.hasNext()){
            System.out.println(seq1.next());
        }
    }
}
