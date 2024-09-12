package CH04;

import java.util.Scanner;

public class C03ScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String n1 = sc.nextLine();
		
		System.out.print(n1 + "님의 나이를 입력하세요 : ");
		int n2 = sc.nextInt();
		
		sc.nextLine();
		System.out.print(n1 + "님의 주소를 입력하세요 : ");
		String n3 = sc.nextLine();
		
//		sc.nextLine();
		System.out.println(n1 + "님의 나이는 " + n2+"세" +"주소는" +n3+"입니다");
		

	}

}
