package ch3.Task5;

public class Main {
    public static void main(String[] args) {
        IntSequence seq1 = IntSequence.constant(1);
        for(int i = 0;i < 10;++i){
            System.out.printf(" %3d", seq1.next());
        }
        System.out.println();

        IntSequence seq2 = IntSequence.constant(10);
        for(int i = 0;i < 10;++i){
            System.out.printf(" %3d", seq2.next());
        }
        System.out.println();
    }
}
