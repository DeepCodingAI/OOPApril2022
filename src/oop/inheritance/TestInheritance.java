package oop.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        System.out.println("Parents's characteristics");
        Parents parents = new Parents();
        parents.height();
        parents.hairType();
        parents.sportsSkill();

        System.out.println("Children's characteristics");
        Children child1 = new Children();
        child1.athleticSkill();
        child1.hairType();
        child1.height();
        child1.sportsSkill();

        Human human = new Human();
        human.humanShape();

        MaleHuman maleHuman = new MaleHuman();
        maleHuman.humanShape();
        maleHuman.maleAppearance();

        FemaleHuman femaleHuman = new FemaleHuman();
        femaleHuman.humanShape();
        femaleHuman.femaleAppearance();

    }
}
