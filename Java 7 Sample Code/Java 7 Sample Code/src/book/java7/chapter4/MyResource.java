package book.java7.chapter4;

public class MyResource implements AutoCloseable {
    public void doSomething() {
        System.out.println("執行運算");
    }
    @Override
    public void close() throws Exception {
        throw new Exception("關閉資源");
    }
}