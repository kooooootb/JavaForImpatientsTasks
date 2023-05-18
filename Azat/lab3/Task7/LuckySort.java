package ch3.Task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LuckySort {
    static boolean isSorted(ArrayList<String> strings, Comparator<String> comp){
        for(int i = 1;i < strings.size();++i){
            if(comp.compare(strings.get(i-1), strings.get(i)) >= 0){
                return false;
            }
        }
        return true;
    }
    static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        while(!isSorted(strings, comp)){
            Collections.shuffle(strings);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        luckySort(strings, String::compareTo);
        System.out.println(strings);
    }
}
