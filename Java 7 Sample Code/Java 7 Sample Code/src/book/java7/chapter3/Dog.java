package book.java7.chapter3;
class Skill {}

class AdvSkill extends Skill {}

class Animal2 {
    Skill skill;
    public Skill getSkill() {
        skill = new Skill();
        return skill;
    }
}
public class Dog extends Animal2{
    AdvSkill aSkill; 
    @Override
    public AdvSkill getSkill() {
        aSkill = new AdvSkill();
        return aSkill;
    }
}
