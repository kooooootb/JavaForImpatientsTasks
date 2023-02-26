package ch1;

import java.lang.Math;
public class Task4 {
    public static void main(String[] args){
        System.out.println(Math.nextUp(0d));

        System.out.println(Math.nextDown(1d / 0));

//        double maxDouble = 1;
//        while(Double.isFinite(maxDouble * 10)){
//            maxDouble *= 10;
//        }
//        double summing = maxDouble / 10;
//        double prev = maxDouble;
//        outer:
//        while(summing > 1){
//            while(Double.isFinite(maxDouble + summing)){
//                maxDouble += summing;
//                if(maxDouble == prev) break outer;
//                prev = maxDouble;
//            }
//            summing /= 10;
//        }
//        while(Double.isFinite(Math.nextUp(maxDouble))){
//            maxDouble = Math.nextUp(maxDouble);
//        }
//        System.out.println(maxDouble);
    }
}
