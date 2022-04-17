package oop.encapsulation;

public class Trainee {
    private int id;
    private String name;
    private String dob;

    public Trainee(){ }
    public Trainee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Trainee(int id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
