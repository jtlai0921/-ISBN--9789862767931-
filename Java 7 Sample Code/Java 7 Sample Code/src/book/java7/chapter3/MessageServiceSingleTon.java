package book.java7.chapter3;

public class MessageServiceSingleTon {
    
    private static final MessageServiceSingleTon instance = new MessageServiceSingleTon();
    
    private MessageServiceSingleTon() {}
    
    public static MessageServiceSingleTon getInstance() {
        return instance;
    }
    
}
