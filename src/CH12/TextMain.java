package CH12;

public class TextMain {

	public static void main(String[] args) {
		TextBuyer 홍길동 = new TextBuyer(5000,0);
		TextBuyer 남길동 = new TextBuyer(3000,0);
		TextBuyer 서길동 = new TextBuyer(2000,0);
		
		store gs감삼편의점 = new store(100000,20,1300);
		store gs동성로편의점 = new store(200000,15,1300);
		
		홍길동.payment(gs감삼편의점,3000);
		남길동.payment(gs감삼편의점,2000);
		서길동.payment(gs동성로편의점,1500);
		
		System.out.println(홍길동);
		System.out.println(남길동);
		System.out.println(서길동);
		System.out.println(gs감삼편의점);
		System.out.println(gs동성로편의점);
	}

}
