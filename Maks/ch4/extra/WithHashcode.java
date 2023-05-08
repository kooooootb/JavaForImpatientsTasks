package ch4.extra;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WithHashcode {
    private static class Point{
        private final int x;
        private final int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        public String toString(){
            return "[Point: x = " + this.x + ", y = " + this.y + "]";
        }
        @Override
        public int hashCode() {
            return Objects.hash(this.x, this.y);
        }
    }
    public static void main(String[] args) {
        Map<Point, Integer> map = new HashMap<>();

        Point p1 = new Point(1,1);
        map.put(p1, 100);

        Point p2 = new Point(2, 2);
        map.put(p2, 200);

        System.out.println(map.get(new Point(1, 1)));
        System.out.println(map.get(p1));
        System.out.println(p1.equals(new Point(1, 1)));

        Point p11 = new Point(1,1);
        map.put(p11, 400);

        System.out.println(map.get(p1));
        System.out.println(map.get(p11));
    }
}
