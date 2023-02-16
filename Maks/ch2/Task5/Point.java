package ch2.Task5;

/**
 * @author Maksim
 * @version 1.0
 */
public class Point {
    /**
     * Переменная хранит x координату точки
     */
    private final double x;
    /**
     * Переменная хранит y координату точки
     */
    private final double y;

    /**
     * Создает точку в центре координат
     */
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Создает точку с данными координатами
     * @param x координата x будущей точки
     * @param y координата y будущей точки
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Создает новую точку со смещенными координатами
     * @param dx величина смещения по оси x
     * @param dy величина смещения по оси y
     * @return Созданная точка
     */
    public Point translate(double dx, double dy){
        return new Point(x + dx, y + dy);
    }

    /**
     * Создает новую точку с измененным масштабом координат
     * @param factor величина изменения масштаба координат
     * @return Созданная точка
     */
    public Point scale(double factor){
        return new Point(x * factor, y * factor);
    }

    /**
     * Возвращает x координату точки
     * @return x координата точки
     */
    public double getX(){
        return this.x;
    }

    /**
     * Возвращает y координату точки
     * @return y координата точки
     */
    public double getY(){
        return this.y;
    }

    /**
     * Возвращает строку вида "{x координата точки} {y координата точки}"
     * @return созданная строка
     */
    public String toString(){
        return String.format("%f %f", x, y);
    }
    public static void main(String[] args) {
        Point zero = new Point();
        System.out.println(zero);
        Point p1 = zero.translate(1, 0);
        System.out.println(p1);
        Point p2 = p1.translate(0, 1);
        System.out.println(p2);
        Point p3 = p2.translate(10, 10);
        System.out.println(p3);
        Point p4 = p3.translate(1, 12);
        System.out.println(p4);
        Point p5 = p4.scale(15);
        System.out.println(p5);

        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);
    }
}
