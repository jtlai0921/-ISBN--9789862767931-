package book.java7.chapter3;
public enum Operator {
    PLUSONE(){
                 int operate(int x){ return x;}
               },
    ABS(){
            public int operate(int x){ return x;}
          };
    abstract int operate(int x);
}
