package CH11;

class C02Simple{
	
	int n1;
	static int n2;
	
	void func1() {
		n1=10;
		n2=20;
	}
	static void func2() {
		n2=10;
//		n1=20; 			//static 객체생성전에 만들어 지기 떄문에 n1 사용x
	}
	
	
}

public class C02StaticMain {

	public static void main(String[] args) {
		

	}

}
