package oop.abstraction;

public class Toyota extends MotorEngine implements Car, FlyingCar{

    public void start() {
        System.out.println("car will run by engine with manual start");
    }

    public void shape() {
        System.out.println("size of the car will be 6 feet long and 3 feet width");
    }

    public void stop() {
        System.out.println("car will have manual break system");
    }

    public void enginePowerSystem() {
        System.out.println("engine run on gasoline");
    }

    public void carLogoOfToyota(){
        System.out.println("Toyota have 2 circles integrated toyota logo");
    }

    public void flyingMotorCar() {
        System.out.println("A car can fly");
    }
}
