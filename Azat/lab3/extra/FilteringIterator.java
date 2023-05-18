package ch3.extra;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class FilteringIterator<T> implements Iterator<T> {
    final private Iterator<T> iterator;
    final private Predicate<T> predicate;
    private T nextElement;
    private boolean checkedNext;
    public boolean hasNext(){
        while(true){
            if(!iterator.hasNext()){
                return false;
            }
            T next = iterator.next();
            if(predicate.test(next)){
                checkedNext = true;
                nextElement = next;
                return true;
            }
        }
    }
    public T next(){
        if(checkedNext){
            checkedNext = false;
            return nextElement;
        } else{
            while(true){
                T next = iterator.next();
                if(predicate.test(next)){
                    return next;
                }
            }
        }
    }
    public void remove(){
        iterator.remove();
    }
    private FilteringIterator(Iterator<T> iterator, Predicate<T> predicate){
        this.iterator = iterator;
        this.predicate = predicate;
    }
    static public <T> FilteringIterator<T> fromIterator(Iterator<T> iterator){
        return new FilteringIterator<>(iterator, (fit) -> true);
    }
    public FilteringIterator<T> filter(Predicate<T> predicate){
        return new FilteringIterator<>(this.iterator, predicate);
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("1");
        list.add("second");
        list.add("2");
        list.add("third");
        list.add("3");
        list.add("fourth");
        list.add("4");
        list.add("fifth");

        FilteringIterator<String> fit;

        System.out.println("Plain:");
        fit = FilteringIterator.fromIterator(list.iterator());
        while (fit.hasNext()) {
            System.out.println(fit.next());
        }

        System.out.println("Numbers pnly:");
        fit = FilteringIterator.fromIterator(list.iterator());
        fit = fit.filter((str) -> str.matches("\\d"));
        while (fit.hasNext()) {
            System.out.println(fit.next());
        }
    }
}
