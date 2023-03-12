package Lab2.Task6;

import static java.lang.Math.abs;

/**
 * Класс, описывающий точку на координатной плоскости
 */
public class Point {
    /**
     * Поле, содержащее коориднату x
     */
    private double x;
    /**
     * Поле, содержащее коориднату y
     */
    private double y;

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
     * Возвращает этот объект с добавлением смещения к полям
     * @param a смещение по координате x
     * @param b смещение по координате y
     * @return ссылку на этот объект
     */
    public Point translate(double a, double b) {
        x += a;
        y += b;
        return this;
    }

    /**
     * Возвращает этот объект с измененным масштабом
     * @param ratio коэффициент по коротому происходит изменение масштаба
     * @return ссылку на этот объект
     */
    public Point scale(double ratio) {
        if (ratio >= 0) {
            x *= ratio;
            y *= ratio;
        } else {
            x /= abs(ratio);
            y /= abs(ratio);
        }
        return this;
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