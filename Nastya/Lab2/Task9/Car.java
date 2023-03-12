package Lab2.Task9;

import org.w3c.dom.ranges.RangeException;

public class Car {
    private double distance;
    private double litres;
    private final double consumption;
    Car(double consumption) {
        distance = 0;
        litres = 0;
        this.consumption = consumption;
    }


    public void move(double km) {
        if (litres == 0) {
            System.out.println("<стоп машина!!! бенза нет>");
            return;
        }
        double necessary = km/consumption;
        if (litres >= necessary) {
            litres -= necessary;
            distance += km;
            System.out.println("<фух, доехали...>");
        } else {
            distance += consumption*litres;
            litres = 0;
            System.out.println("<не доехали.. поищи заправку на картах>");
        }
    }

    public double getDistance() {
        return distance;
    }

    public double getLitres() {
        return litres;
    }

    public void refuel(double add) {
        litres += add;
    }

    public static void main(String[] args) {
        Car lamborghini = new Car(5.6);
        lamborghini.refuel(100);
        System.out.println("Ламборгини топ, пруфы? -> " + "Лошадки - 355, " + "РАСХОД: " +  lamborghini.consumption + ", ПРОБЕГ: " + lamborghini.distance + ", оставшийся бенз: " + lamborghini.litres);
        lamborghini.move(500);
        System.out.println("500 km? не проблема для этого зверя -> " + ", ПРОБЕГ: " + lamborghini.distance + ", оставшийся бенз: " + lamborghini.litres);
        lamborghini.move(2000);
        System.out.println("Еще 2000 km? не проблема для этого зверя -> " + ", ПРОБЕГ: " + lamborghini.distance + ", оставшийся бенз: " + lamborghini.litres);
        lamborghini.move(100);
    }
}