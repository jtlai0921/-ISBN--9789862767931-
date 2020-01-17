package book.java7.chapter5;
class FatherThread implements Runnable {
    public void run() {
        System.out.println("爸爸下班回家.");
        System.out.println("爸爸準備洗澡.");
        System.out.println("爸爸發現沒瓦斯了.");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯.");
        Thread worker = new Thread(new WorkerThread());
        System.out.println("爸爸等待瓦斯工人 ...");
        worker.start();



        System.out.println("爸爸開始洗澡 !");
        System.out.println("爸爸洗完澡了 !");
    }
}

class WorkerThread implements Runnable {
    public void run() {
        System.out.println();
        System.out.println("瓦斯工人送瓦斯中 ... ");
        try {
            for (int i=1; i<=5; i++) {
                Thread.sleep(1000);
                System.out.print(i+" 分鐘, ");
            }
        }
        catch (InterruptedException ie) {
            System.err.println("瓦斯工人送瓦斯途中發生意外 !");
        }
        System.out.println();
        System.out.println("瓦斯工人將瓦斯送到家了 !");
        System.out.println("瓦斯工人將瓦斯安裝完畢 !");
        System.out.println();
    }
}

public class Shower {
    public static void main(String[] args) {
        Thread father = new Thread(new FatherThread());
        father.start();
    }
}

