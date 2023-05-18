package ch3.Task15;

public interface IntSequence {
    default boolean hasNext(){
        return true;
    }
    int next();
    static IntSequence constant(int valuee){
        return () -> valuee;
    }
}
