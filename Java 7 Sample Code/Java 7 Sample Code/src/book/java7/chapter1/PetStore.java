package book.java7.chapter1;

public class PetStore {
    public static void main(String[] args) {
        String dogName = Puppy.name;
        String dogKind = Puppy.type;
        String dogColor = Puppy.color;
        System.out.println("我有一隻聰明的" + dogKind +
                           "犬, 名叫" + dogName +
                           ", 他的顏色是" + dogColor + "色的.");
        System.out.print("他每天都會幫我");
        Puppy.skill();
    }
}

