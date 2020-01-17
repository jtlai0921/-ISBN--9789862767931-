package book.java7.chapter1;

public class PetStore2 {
    public static void main(String[] args) {
        String fishName = book.java7.chapter1.water.Fish.name;
        String fishKind = book.java7.chapter1.water.Fish.type;
        String fishColor = book.java7.chapter1.water.Fish.color;
        System.out.println("我有一隻優雅的" + fishKind +
                           ", 名叫" + fishName +
                           ", 他的顏色是" + fishColor + "色的.");
        System.out.print("每當他肚子餓的時候都會");
        book.java7.chapter1.water.Fish.skill();
        
    }
}

