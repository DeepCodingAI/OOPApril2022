package oop.abstraction;

public class TestCar {
    public static void main(String[] args) {
        Car.wheel();
        System.out.println("Car designed by Toyota: ");
        int num = 0;
        num = 10;
        Car car = null;
        car = new Toyota();
        car.start();
        car.shape();
        car.stop();

        MotorCar motorCarToyota = new Toyota();
        motorCarToyota.carRunOnEngine();

        MotorEngine motorEngineToyota = new Toyota();
        motorEngineToyota.enginePowerSystem();
        motorEngineToyota.speed();

        Toyota corolla = new Toyota();
        corolla.carLogoOfToyota();

        System.out.println("Car designed by BMW: ");
        car = new BMW();
        car.start();
        car.shape();
        car.stop();

        MotorCar motorCarBMW = new BMW();
        motorCarBMW.carRunOnEngine();

        MotorEngine motorEngineBMW = new BMW();
        motorEngineBMW.enginePowerSystem();
        motorEngineBMW.speed();

        BMW series5 = new BMW();
        series5.carLogoOfBMW();

    }
}
