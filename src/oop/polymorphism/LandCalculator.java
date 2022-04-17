package oop.polymorphism;

public class LandCalculator {

    public int areaOfLand(int a, int b){
        int total = a + b;

        return total;
    }

    public String areaOfLand(String a, int b){
        String total = a + b;

        return total;
    }
    public int areaOfLand(int a, int b, int c){
        int total = a + b + c;

        return total;
    }

    public int areaOfLand(int a, int b, int c, int d){
        int total = a + b + c + d;

        return total;
    }

    public int areaOfLand(int a, int b, String shapeOfLand){
        int total = a + b;
        System.out.println(" total distance of a " + shapeOfLand + ": total");

        return total;
    }
}
