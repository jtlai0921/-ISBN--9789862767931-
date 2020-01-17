package book.java7.chapter3;

public class MyTest3 {
    void aMethod() {
        bMethod();        // 可以直接呼叫 bMethod()
        dMethod();        // 可以直接呼叫 dMethod()
    }
    void bMethod() {}
    static void cMethod() {
        //bMethod();        // 不可以直接呼叫 bMethod()
        dMethod();        // 可以直接呼叫 dMethod()
    }
    static void dMethod() {
        new MyTest3().bMethod();  // 可以呼叫 bMethod() 因為在 static 環境中
                                     // 有直接明確的建立該物件。
    }    
}

