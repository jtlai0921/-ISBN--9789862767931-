package book.java7.chapter2;

class Father {
    private final void aMethod(){
        System.out.println("呼叫父類別的 aMethod！");
    }
}

public class Son extends Father {  
    //@Override
    void aMethod(){
        System.out.println("呼叫子類別的 aMethod！");
    }
}

