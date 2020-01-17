package book.java7.chapter1;

import book.java7.chapter1.water.Fish;

public class PetStore3 {
    public static void main(String[] args) {
        String fishName = Fish.name;
        String fishKind = Fish.type;
        String fishColor = Fish.color;
        System.out.println("我有一隻優雅的" + fishKind +
                           ", 名叫" + fishName +
                           ", 他的顏色是" + fishColor + "色的.");
        System.out.print("每當他肚子餓的時候都會");
        Fish.skill();
    }
}
