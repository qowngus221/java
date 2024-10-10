package CHTESTEST;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num =1;	//변수 생성 *찍기 위해 사용
//		// 값 받기
//		System.out.print("높이를 입력하세요 >");
//		int h = sc.nextInt();
//		//생성
//		for(int i = 0; i<h;i++) {	// 전체 행 생성
//			for(int j = h;j-1>i;j-=1) {	// 공백 생성
//				System.out.print(" ");
//			}
//			for(int j=0;j<num;j++) {	//* 생성
//				System.out.print("*");
//				
//			}
//			num += 2; 			// 1,3,5,.... 규칙으로 *찍기위해 
//			System.out.println();
//		}
		Scanner scan = new Scanner(System.in);

		// 값 받기
		System.out.print("높이를 입력하세요 >");
		int a = scan.nextInt();

		if (a % 2 == 1) {
			// 생성
			for (int i = 0; i < a / 2 + 1; i++) { // 3줄 생성 (2번째 값 i가 반복 횟수)
				for (int j = 0; j < a / 2 - i; j++) { // 공백 생성 (2번째 값 처음에 왼쪽 공백 갯수 - 1, 초기에는 0이므로 그값이 그대로 나옴)
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i + 1; j++) { // 2번째 공식 : 2의배수 증가*반복횟수 + 1(홀수배열) 별찍기
					System.out.print("*");
				}
				System.out.println(); // 줄넘김
			} // 프로그램 앞으로 벗어남
			for (int i = 0; i < a / 2; i++) { // 2줄 생성 (2번째 값 i가 반복 횟수)
				for (int j = 0; j <= i; j++) { // 공백 생성
					System.out.print(" ");
				}
				for (int j = a - 2; j >= 2 * i + 1; j--) { // j가 별의 갯수 (2번째 공식 : 2의배수 증가*반복횟수 + 1(홀수배열) 별사라짐)
					System.out.print("*");
				}
				System.out.println();
				scan.close();
			}
		} else if (a % 2 == 0) {
			System.out.print("홀수만 입력하시오... 짝수시,프로그램이 종료됩니다.");
			scan.close();
		}

	}

}
