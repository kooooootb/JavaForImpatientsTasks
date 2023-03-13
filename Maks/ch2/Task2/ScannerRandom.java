package ch2.Task2;

import java.util.Random;
import java.util.Scanner;

public class ScannerRandom {
    public static void main(String[] args){
        int number;
        Scanner scanner = new Scanner(System.in);
//        public int nextInt() {
//            return nextInt(defaultRadix);
//        }
//        public int nextInt(int radix) {
//            // Check cached result
//            if ((typeCache != null) && (typeCache instanceof Integer)
//                    && this.radix == radix) {
//                int val = ((Integer)typeCache).intValue();
//                useTypeCache();
//                return val;
//            }
//            setRadix(radix);
//            clearCaches();
//            // Search for next int
//            try {
//                String s = next(integerPattern());
//                if (matcher.group(SIMPLE_GROUP_INDEX) == null)
//                    s = processIntegerToken(s);
//                return Integer.parseInt(s, radix);
//            } catch (NumberFormatException nfe) {
//                position = matcher.start(); // don't skip bad token
//                throw new InputMismatchException(nfe.getMessage());
//            }
//        }
//        private void setRadix(int radix) {
//            if ((radix < Character.MIN_RADIX) || (radix > Character.MAX_RADIX))
//                throw new IllegalArgumentException("radix:"+radix);
//
//            if (this.radix != radix) {
//                // Force rebuilding and recompilation of radix dependent patterns
//                integerPattern = null;
////              this.radix = radix;
//            }
//        }
//        Метод модифицирующий
        number = scanner.nextInt();
        System.out.println(number);

        Random generator = new Random();
//        public int nextInt() {
//            return next(32);
//        }
//        protected int next(int bits) {
//            long oldseed, nextseed;
//            AtomicLong seed = this.seed;
//            do {
//                oldseed = seed.get();
//                nextseed = (oldseed * multiplier + addend) & mask;
//            } while (!seed.compareAndSet(oldseed, nextseed));
//            return (int)(nextseed >>> (48 - bits));
//        }
//        Метод доступа
        number = generator.nextInt();
        System.out.println(number);
    }
}
