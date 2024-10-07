package CH12;

public class Seller {
	private int myMoney;
	private int appleCnt;
	private int price;
	
	public int receive(int money) {
//		3 고객으로부터 돈받기 -> 내보유금액에 누적
		this.myMoney+=money;
//		4 받은액수/사과1개가격 -> 전달할 사과개수
		int returnCount = money/price;		
//		5 내가 보유한 사과개수에 전달할 사과개수 차감
		this.appleCnt -=returnCount;
//		6 전달할 사과개수 리턴
		return returnCount;
		
	}

	public Seller(int money, int count, int price) {
		super();
		this.myMoney = money;
		this.appleCnt = count;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Seller [money=" + myMoney + ", count=" + appleCnt + ", price=" + price + "]";
	}
	
}
