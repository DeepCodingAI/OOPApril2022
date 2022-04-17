package oop.polymorphism;

public class TestLandCalculator {
    public static void main(String[] args) {
        LandCalculator landCalculator = new LandCalculator();
        int line = landCalculator.areaOfLand(3,10);
        System.out.println("Line: " + line);
        int dots = landCalculator.areaOfLand(3,10,"straight line");
        System.out.println("Line: " + dots);
        int triangle = landCalculator.areaOfLand(5,7,8);
        System.out.println("Triangle: " + triangle);
        int rectangle = landCalculator.areaOfLand(5,7,8,10);
        System.out.println("Rectangle with older Cal: " + rectangle);

        ModernLandCalculator modernLandCalculator = new ModernLandCalculator();
        int rectangleWithModernCal = modernLandCalculator.areaOfLand(5,7,8,10);
        System.out.println("Rectangle with Modern Cal: " + rectangleWithModernCal);
    }
}
