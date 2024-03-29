package book.java7.chapter6; 
public class MyObject {
    static int count;
    MyObject() {
        ++count;
    }
    public static void main(String[] args) throws Exception {
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyObject obj3 = new MyObject();
        System.out.println("目前有 " + count + " 個物件實體");
        obj2 = null;
        System.out.println("建議啟動資源回收機制");
        System.gc();
        Thread.sleep(1000); // 暫停一段時間
        System.out.println("目前剩餘 " + count + " 個物件實體");
    }
    protected void finalize() throws Throwable {
        --count;
        String tName = Thread.currentThread().getName();
        System.out.println("執行 finalize() 的是:" + tName);
    }
}
