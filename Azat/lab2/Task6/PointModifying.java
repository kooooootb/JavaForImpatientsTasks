package ch2.Task6;

/**
 * Описывает точку и методы ее изменения
 * @version 1.0
 */
public class PointModifying {
    /**
     * Координаты точки
     */
    private double x, y;

    /**
     * Создает точку в центре координат
     */
    public PointModifying(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Создает точку с данными координатами
     * @param x координата x будущей точки
     * @param y координата y будущей точки
     */
    public PointModifying(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Перемещает точку на заданное расстояние
     * @param dx величина смещения по оси x
     * @param dy величина смещения по оси y
     * @return Созданная точка
     */
    public PointModifying translate(double dx, double dy){
        this.x += dx;
        this.y += dy;
        return this;
    }

    /**
     * Изменяет масштаб по обеим координатам на заданный коэффициент
     * @param factor величина изменения масштаба координат
     * @return Изменяемая точка
     */
    public PointModifying scale(double factor){
        x *= factor;
        y *= factor;
        return this;
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
        PointModifying zero = new PointModifying();
        System.out.println(zero);

        PointModifying p = new PointModifying(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);
    }
}
