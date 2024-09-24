package CH12;

public class TextBuyer {
		private int money;
		private int count;
	
		
		
		public TextBuyer(int money, int count) {
			super();
			this.money = money;
			this.count = count;
		}
	
	
	
		@Override
		public String toString() {
			return "TextBuyer [money=" + money + ", count=" + count + "]";
		}
	
	
	
		public void payment(store store,int money) 
		{
			this.money-=money;
			
			int receiveApp = store.receive(money);
			
			this.count+=receiveApp;
			
		}

}