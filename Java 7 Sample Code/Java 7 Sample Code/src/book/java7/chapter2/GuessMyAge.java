package book.java7.chapter2;

import java.util.Scanner;

public class GuessMyAge {
    public static void main(String[] args) {
        int answerOfAge = 18;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請猜猜我的年齡 ?");
        do {
            System.out.println("請輸入一個數字");
            int guessOfAge = scanner.nextInt();
            if(guessOfAge == answerOfAge) {
                System.out.println("恭喜你答對了 !");
                break;
            } else if(guessOfAge > answerOfAge) {
                System.out.println("你猜得太大囉 !");
            } else {
                System.out.println("你猜得太小囉 !");
            }
        } while(true);
    }
}
