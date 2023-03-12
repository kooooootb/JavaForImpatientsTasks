package Lab2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // METHOD nextInt FROM SCANNER - МОДИФИЦИРУЮЩИЙ (метод SetRadix)

//    public int nextInt(int radix) {
//        // Check cached result
//        if ((typeCache != null) && (typeCache instanceof Integer)
//                && this.radix == radix) {
//            int val = ((Integer)typeCache).intValue();
//            useTypeCache();
//            return val;
//        }
//        setRadix(radix);
//        clearCaches();
//        // Search for next int
//        try {
//            String s = next(integerPattern());
//            if (matcher.group(SIMPLE_GROUP_INDEX) == null)
//                s = processIntegerToken(s);
//            return Integer.parseInt(s, radix);
//        } catch (NumberFormatException nfe) {
//            position = matcher.start(); // don't skip bad token
//            throw new InputMismatchException(nfe.getMessage());
//        }
//    }
//
//    private void setRadix(int radix) {
//        if ((radix < Character.MIN_RADIX) || (radix > Character.MAX_RADIX))
//            throw new IllegalArgumentException("radix:"+radix);
//
//        if (this.radix != radix) {
//            // Force rebuilding and recompilation of radix dependent patterns
//            integerPattern = null;
//            this.radix = radix;
//        }
//    }


        Random rand = new Random();
        int m = rand.nextInt();

        // METHOD nextInt() FROM RANDOM - метод доступа

//        public int nextInt() {
//            return next(32);
//        }
//
//        protected int next(int bits) {
//            long oldseed, nextseed;
//            AtomicLong seed = this.seed;
//            do {
//                oldseed = seed.get();
//                nextseed = (oldseed * multiplier + addend) & mask;
//            } while (!seed.compareAndSet(oldseed, nextseed));
//            return (int)(nextseed >>> (48 - bits));
//        }

    }


}
