package ch3.extra;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public interface Comparator<T> {
    int compare(T o1, T o2);
    static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor){
        return (ob1, ob2) -> keyExtractor.apply(ob1).compareTo(keyExtractor.apply(ob2));
    }
    static <T, U> Comparator<T> comparing(Function<? super T,? extends U> keyExtractor, Comparator<? super U> keyComparator){
        return (ob1, ob2) -> keyComparator.compare(keyExtractor.apply(ob1), keyExtractor.apply(ob2));
    }
    static <T> Comparator<T> comparingDouble(ToDoubleFunction<? super T> keyExtractor){
        return (ob1, ob2) -> Double.compare(keyExtractor.applyAsDouble(ob1), keyExtractor.applyAsDouble(ob2));
    }
    static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor){
        return (ob1, ob2) -> Integer.compare(keyExtractor.applyAsInt(ob1), keyExtractor.applyAsInt(ob2));
    }
    static <T> Comparator<T> comparingLong(ToLongFunction<? super T> keyExtractor){
        return (ob1, ob2) -> Long.compare(keyExtractor.applyAsLong(ob1), keyExtractor.applyAsLong(ob2));
    }
    static <T extends Comparable<? super T>> Comparator<T> naturalOrder(){
        return (ob1, ob2) -> ob1.compareTo(ob2);
    }
    static <T> Comparator<T> nullsFirst(Comparator<? super T> comparator){
        return (ob1, ob2) -> {
            if(ob1 == null) return -1;
            if(ob2 == null) return 1;
            return comparator.compare(ob1, ob2);
        };
    }
    static <T> Comparator<T> nullsLast(Comparator<? super T> comparator){
        return (ob1, ob2) -> {
            if(ob1 == null) return 1;
            if(ob2 == null) return -1;
            return comparator.compare(ob1, ob2);
        };
    }
    default Comparator<T> reversed(){
        return (ob1, ob2) -> compare(ob2, ob1);
    }
    static <T extends Comparable<? super T>> Comparator<T> reverseOrder(){
        return (ob1, ob2) -> ob2.compareTo(ob1);
    }
    default Comparator<T> thenComparing(Comparator<? super T> other){
        return (ob1, ob2) -> {
            int result = compare(ob1, ob2);
            if(result == 0){
                return other.compare(ob1, ob2);
            } else{
                return result;
            }
        };
    }
    default <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<? super T,? extends U> keyExtractor){
        return (ob1, ob2) -> {
            int result = compare(ob1, ob2);
            if(result == 0){
                return keyExtractor.apply(ob1).compareTo(keyExtractor.apply(ob2));
            } else{
                return result;
            }
        };
    }
    default <U> Comparator<T> thenComparing(Function<? super T,? extends U> keyExtractor, Comparator<? super U> keyComparator){
        return (ob1, ob2) -> {
            int result = compare(ob1, ob2);
            if(result == 0){
                return keyComparator.compare(keyExtractor.apply(ob1), keyExtractor.apply(ob2));
            } else{
                return result;
            }
        };
    }
    default Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor){
        return (ob1, ob2) -> {
            int result = compare(ob1, ob2);
            if(result == 0){
                return Double.compare(keyExtractor.applyAsDouble(ob1), keyExtractor.applyAsDouble(ob2));
            } else{
                return result;
            }
        };
    }
    default Comparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor){
        return (ob1, ob2) -> {
            int result = compare(ob1, ob2);
            if(result == 0){
                return Long.compare(keyExtractor.applyAsLong(ob1), keyExtractor.applyAsLong(ob2));
            } else{
                return result;
            }
        };
    }
    default Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor){
        return (ob1, ob2) -> {
            int result = compare(ob1, ob2);
            if(result == 0){
                return Integer.compare(keyExtractor.applyAsInt(ob1), keyExtractor.applyAsInt(ob2));
            } else{
                return result;
            }
        };
    }
}
