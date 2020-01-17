package book.java7.chapter3;
public enum Orderenum {
    STOCKNO(2330),
    STOCKPRICE(45.5),
    STOCKQTY(10),
    IDENTIFY();

    public int id;

    private Orderenum() {
    }

    Orderenum(double d) {
    }

    public boolean submit(){
        return true;
    }
}
