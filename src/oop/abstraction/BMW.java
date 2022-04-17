package oop.abstraction;

public class BMW extends MotorEngine implements Car{

    public void start() {
        System.out.println("car will have engine with auto start");
    }


    public void shape() {
        System.out.println("car size will be 6 feet long and 4 feet width" );
    }


    public void stop() {
        System.out.println("car will have hydrolic breaking system");
    }


    public void enginePowerSystem() {
        System.out.println("Engine run on Hybrid model");
    }

    public void carLogoOfBMW(){
        System.out.println("Bravaria Motor Works log in all cars");
    }
}
