package ch3.Task15;

import java.util.Random;

public class RandomSeq {
    private static final Random generator = new Random();
    public static class RandomSequence implements IntSequence{
        private final int low, high;
        public int next() { return low + generator.nextInt(high - low + 1); }
        public boolean hasNext() { return true; }
        public RandomSequence(int low, int high){
            this.low = low;
            this.high = high;
        }
    }
    public static IntSequence randomInts(int low, int high){
        return new RandomSequence(low, high);
    }
    public static void main(String[] args) {
        IntSequence seq;

        System.out.println("Numbers in range [85, 100]");
        seq = randomInts(85, 100);
        for(int i = 0;i < 10;++i){
            System.out.printf("%4d", seq.next());
        }
        System.out.println();

        System.out.println("Numbers in range [10, 15]");
        seq = randomInts(10, 15);
        for(int i = 0;i < 10;++i){
            System.out.printf("%4d", seq.next());
        }
        System.out.println();
    }
}
