package CH12;

public class store {
	private int money;
	private int count;
	private int price;
	
	public store(int money, int count, int price) {
		super();
		this.money = money;
		this.count = count;
		this.price = price;
	}

	@Override
	public String toString() {
		return "store [money=" + money + ", count=" + count + ", price=" + price + "]";
	}
	
	public int receive(int money) {
		this.money+=money;
		int returnCount = money/price;
		this.count -= returnCount;
		return returnCount;
	}

	
	
}
