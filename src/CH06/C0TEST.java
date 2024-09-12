package CH06;

import java.util.Scanner;

public class C0TEST {

	public static void main(String[] args) {
		
		//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요");
//		int n1 = sc.nextInt();
//		
//		if(n1>=50) {
//			System.out.println("n1은 50이상");
//		}
//		else {
//			System.out.println("n1은 50미만");
//		}
//		
		
		//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		if(n1%3==0) {
//			System.out.println("3의배수입니다");
//		}
//		else {
//			System.out.println("3의 배수는 아닙니다");
//		}
		//문제3. 코리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다. 
	    //4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
	    //이를 판단하는 프로그램을 작성해보자.
	    //점수가 0미만 100초과이면 경고문구 출력!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력 :");
		int score = sc.nextInt();
		System.out.println("학년을 입력 :");
		int grade = sc.nextInt();
		if(score>=70) {
			if(grade>=4) {
				
			}
		}
		
	}

}
