package book.java7.chapter3;
class Father9 {
    String name = "Father";
    String getName() {
        return name;
    }
    String greeting() {
        return "class Father";
    }
}
class Son9 extends Father9 {
    String name = "Son";
    String greeting() {
        return "class Son";
    }
    void foo() {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(((Son9)this).name);
        System.out.println(((Father9)this).name);
        System.out.println(((Son9)this).greeting());
        System.out.println(((Father9)this).greeting());
    }
} 
public class Polymorphism2 { 
public static void main(String[] args) {
        new Son9().foo();
    }
}
