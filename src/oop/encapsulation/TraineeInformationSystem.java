package oop.encapsulation;

public class TraineeInformationSystem {
    public static void main(String[] args) {
        Trainee trainee1 = new Trainee();
        trainee1.setId(101);
        trainee1.setName("Jon Doe");
        trainee1.setDob("02-05-1990");

        Trainee trainee2 = new Trainee();
        trainee2.setId(102);
        trainee2.setName("Henry Pulse");
        trainee2.setDob("06-09-1992");

        System.out.println(trainee1.getId()+ " "+ trainee1.getName()+ " "+trainee1.getDob());

        System.out.println(trainee2.getId()+ " "+ trainee2.getName()+ " "+trainee2.getDob());

        Trainee trainee3 = new Trainee(103,"David Homes","05-02-1995");
        System.out.println(trainee3.getId()+ " "+ trainee3.getName()+ " "+trainee3.getDob());
    }
}
