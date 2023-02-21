package ch3.Task4;

public interface IntSequence {
    boolean hasNext();
    int next();
    static IntSequence of(int ...valuess){
        return new IntSequence() {
            private final int[] values = valuess;
            private int currentIndex = 0;
            @Override
            public boolean hasNext(){
                return currentIndex < values.length;
            }
            @Override
            public int next(){
                return values[currentIndex++];
            }
        };
    }
}
