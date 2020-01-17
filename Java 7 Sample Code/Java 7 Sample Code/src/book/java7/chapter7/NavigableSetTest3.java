package book.java7.chapter7;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest3 {

	public static void main(String[] args) {
		NavigableSet<MyMoney> set = new TreeSet<>();
		set.add(new MyMoney(100));
		set.add(new MyMoney(100));
		set.add(new MyMoney(300));		
		System.out.println(set);
	}
}

class MyMoney implements Comparable<MyMoney>{
	private int money;
	public MyMoney(int money) {
		this.money = money;
	}
	public boolean equals(Object object) {
		if(object instanceof MyMoney) {
			MyMoney vo = (MyMoney)object;
			return (this.money == vo.money);
		}
		return false;
	}
	
	public int hashCode() {
		return money;
	}
	
	public int compareTo(MyMoney o) {
		return (money - o.money);
	}

	public String toString() {
		return String.valueOf(money);
	}
}
