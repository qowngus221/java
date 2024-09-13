package CH07;

import java.util.Scanner;

public class C01WHILE {

	public static void main(String[] args) {
		
		//01 while 기본
		//while(조건식){
		// 조건식이 참인 경우 실행되는 종속문장(1개의 행일때는 생략가능)
		//}
		
		//탈출용 변수
		//탈출을 위한 조건식
		//탈출을 위한 연산식
		
//		int i =0; // 탈출용 변수
//		while(i<5) //탈출을 위한 조건식
//		{
//			System.out.println("배고파");
//			i++; //탈출을 위한 연산식
//		}

		//02 1-10까지 합
		
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("i : "+i);
//			sum+=i;
//			i++;
//		}
//		System.out.println("sum : "+ sum);
	
		//04 1 - N 까지의 합
		//N - M 까지의 합을 구합니다 .(N<M()
		//1 - N 까지 수중에 짝수/홀수의 합을 각각 출력
		//1 - N 까지 수중에 4의 배수를 출력하고 4의배수가 아닌 나머지의 합을 구하세요
		//구구단 2단 출력
		//구구단 n단 출력
		//
		
		//(1)
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		int i = 1;
//		
//		while(i<=n) {
//			sum +=i;
//			i++;
//		}
//		System.out.println(sum);
		
		//(2)
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int sum = 0;
//		
//		while(n<m) {
//			sum += n;
//			n++;
//		}
//		System.out.println(sum);
		
		//--------------
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//무한루프(같은수 입력 방지)
//		while(n==m) {
//			System.out.println("같은수가 입력되었습니다. 다시 입력하세요..");
//			n = sc.nextInt();
//			m = sc.nextInt();
//			
//		}
//		
//		//n>m경우 Swap
//		int tmp;
//		if(n>m) {
//			tmp = m;
//			m = n;
//			n = tmp;
//		}
//		System.out.println("n<m 인 상황입니다. n : "+n+ "m :"+m);
		
		
		
		//(3)
//		int n = sc.nextInt();
//		int i = 1;
//		int num1 = 0;
//		int num2 = 0;
//		int sum = 0;
//		while(i<n) {
//			if(i%2==0) {
//				num1 += i;
//			}
//			else{
//				num2 += i;
//			}
//			i++;
//			}
//		System.out.println("짝수"+num1 + "홀수"+num2);
//		
//		int n = sc.nextInt();
//		int i =1;
//		int oddSum=0;
//		int evenSum=0;
//		while(i<=n) {
//			if(i%2==0) {
//				System.out.printf("%d는 짝수\n",i);
//				evenSum+=i;
//			}else {
//				System.out.printf("%d는 홀수\n",i);
//				oddSum+=i;
//			}
//			
//			i++;
//		}
		
		//(4)
//		int n = sc.nextInt();
//		int i = 1;
//		int num1 = 0;
//		int num2 = 0;
//		int sum = 0;
//		while(i<n) {
//			if(i%4==0) {
//				num1 += i;
//			}
//			else {
//				num2 += i;
//			}
//			
//			i++;
//		}
//		System.out.println("4의배수 : " + num1 + "나머지값 합"+ num2);
	
		
		//구구단 2단
//		int i = 2;
//		int dan =1;
//		int sum = 0;
//		while(dan<=9) {
//			sum = i*dan;
//			System.out.println(i+"*"+dan+"="+sum);
//			dan++;
//		}
		//---------------------
//		int  i =1;
//		while(i<=9) {
//			System.out.printf("%d x %d = %d\n",2,i,2*i);
//			i++;
//		}
		
		
		
		//구구단 n단
//		int n = sc.nextInt();
//		int dan = 1;
//		int sum = 0;
//		while(dan <= 9) {
//			sum = n*dan;
//			System.out.println(n+"*"+dan+"="+sum);
//			dan++;
//		}
		//----------------------
		int n = sc.nextInt();
		while(n>9) {
			System.out.println("잘못입력하셨습니다. 다시입력하세요.");
			n = sc.nextInt();
		}
		int  i =1;
		while(i<=9) {
			System.out.printf("%d x %d = %d\n",n,i,n*i);
			i++;
		}
		
		
		
		
		
	}

}
