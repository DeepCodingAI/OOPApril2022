package oop.abstraction;

public abstract class MotorEngine implements MotorCar {

    public abstract void enginePowerSystem();

    public void speed(){
        System.out.println("Car can drive at speed of 90 miles per hour");
    }

    public void carRunOnEngine(){
        System.out.println("car will run on engine power supplied by gasoline or electric");
    }
}
