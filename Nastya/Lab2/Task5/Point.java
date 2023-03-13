package Lab2.Task5;

import static java.lang.Math.abs;

/**
 * Класс, описывающий точку на координатной плоскости
 */
public class Point {

    /**
     * Поле, содержащее коориднату x
     */
    private final double x;
    /**
     * Поле, содержащее коориднату y
     */
    private final double y;

    /**
     * Пустой конструктор, присваивающий точке начало координат
     */
    Point() { x = 0.0; y = 0.0; }

    /**
     * Конструктор, присваивающий полям класса заданные значения
     * @param x значение координаты x
     * @param y значение координаты y
     */
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Получает значение приватного поля x
     * @return координату x точки
     */
    public double getX() { return x; }

    /**
     * Получает значение приватного поля y
     * @return координату y точки
     */
    public double getY() { return y; }

    /**
     * Возвращает новый объект с добавлением смещения к полям объекта, к котрому применяется
     * @param a смещение по координате x
     * @param b смещение по координате y
     * @return новый объект класса Point с добавлением смещения
     */
    public Point translate(double a, double b) {
        return new Point(x + a, y + b);
    }

    /**
     * Возвращает новый объект с измененным масштабом по отношению к объекту, к которому применяется
     * @param ratio коэффициент по коротому происходит изменение масштаба
     * @return новый объект класса Point с учетом измененного масштаба
     */
    public Point scale(double ratio) {
        if (ratio >= 0)
            return new Point(x*ratio, y*ratio);
        else
            return new Point(x/abs(ratio), y/abs(ratio));
    }

    /**
     * Исполняемая функция
     * @param args список параметров командной строки
     */
    public static void main(String[] args) {
        Point p1 = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p1.x + "; " + p1.y);

        Point p2 = new Point(3, 4).translate(1, 3).scale(-2);
        System.out.println(p2.x + "; " + p2.y);
    }
}