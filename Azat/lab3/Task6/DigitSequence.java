package ch3.Task6;

import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> {
    private int number;
    public boolean hasNext(){
        return number > 0;
    }
    public Integer next(){
        Integer result = number % 10;
        number = number / 10;
        return result;
    }
    public void remove(){}
    DigitSequence(int number){
        this.number = number;
    }
    public static void main(String[] args) {
        DigitSequence seq = new DigitSequence(123456);
        while (seq.hasNext()) {
            System.out.println(seq.next());
        }
        seq.remove();
    }
}
