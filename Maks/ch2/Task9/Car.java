package ch2.Task9;

public class Car {
    private double fuel;
    private double range;
    private final double consumption;
    public Car(double kmInL){
        consumption = kmInL;
        range = 0;
        fuel = 0;
    }
    public void refuel(double addValue){
        fuel += addValue;
    }
    public void move(double kms){
        double needFuel = kms / consumption;
        if(needFuel > fuel){
            range += consumption * fuel;
            fuel = 0;
        } else{
            range += kms;
            fuel -= needFuel;
        }
    }
    public double getRange(){
        return range;
    }
    public double getFuel(){
        return fuel;
    }
    public static void main(String[] args) {
        final double consumption = 10;
        Car car = new Car(consumption);
        System.out.printf("Car went %f, current fuel %f\n", car.getRange(), car.getFuel());
        car.move(10);
        System.out.printf("Car went %f, current fuel %f\n", car.getRange(), car.getFuel());
        car.refuel(1);
        System.out.printf("Car went %f, current fuel %f\n", car.getRange(), car.getFuel());
        car.move(5);
        System.out.printf("Car went %f, current fuel %f\n", car.getRange(), car.getFuel());
        car.move(10);
        System.out.printf("Car went %f, current fuel %f\n", car.getRange(), car.getFuel());
    }
}
