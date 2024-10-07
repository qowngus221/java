package CH12;

public class Main {

	public static void main(String[] args) {
		
		Buyer 홍길동 = new Buyer(10000,0); //Buyer(홍길동)의 총 보유금액
		Buyer 철수 = new Buyer(20000,0); //Buyer(철수)의 총 보유금액

		Seller 사과장수 = new Seller(100000,100,1000); // Seller(사과장수)의 보유금액/사과개수/사과하나당 가격
		
		홍길동.payment(사과장수,5000); // Buyer(홍길동)가 payment 함수를 통해 Seller(사과장수)에게 구매금액 전달
		철수.payment(사과장수,12000); // Buyer(철수)가 payment 함수를 통해 Seller(사과장수)에게 구매금액 전달
		
		System.out.println(홍길동);
		System.out.println(철수);
		System.out.println(사과장수);
	}

}
