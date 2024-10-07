package CH12;

public class Buyer {
		private int myMoney;
		private int appleCnt;
		
		
		public Buyer(int money, int count) {
			super();
			this.myMoney = money;
			this.appleCnt = count;
		}


		@Override
		public String toString() {
			return "Buyer [money=" + myMoney + ", count=" + appleCnt + "]";
		}


		public void payment(Seller seller,int money)
		{
			// -1 고객의 보유금액에서 구매할 정도의 액수를 차감
			this.myMoney-=money;
			// -2 사과장수에게 고객의 보유금액 전달
			int receiveApp = seller.receive(money);
			
			this.appleCnt += receiveApp;
		}

	}


