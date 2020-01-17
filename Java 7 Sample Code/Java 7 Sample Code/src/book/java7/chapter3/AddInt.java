package book.java7.chapter3;

public class AddInt {
    public static void main(String[] args) {
        AddInt ai = new AddInt();
        int a = ai.newCalc(1, 2);
        int b = ai.newCalc(1, 2, 3, 4);
        int c = ai.newCalc(a, b);
        System.out.println(c);
    }
    public int newCalc(int... c) {
        int sum = 0;
        for(int i:c) {
            sum += i;
        }
        return sum;
    }
}

