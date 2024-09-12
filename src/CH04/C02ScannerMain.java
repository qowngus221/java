package CH04;

import java.util.Scanner;

import CH01.C01SystemOut;

public class C02ScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("입력된 정수 값 : "+ num1);
//		
//		System.out.print("실수 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : "+num2);
//		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next();			//문자열입력받기기능함수,띄어쓰기는 포함하지않는다
//		System.out.println("입력된 문자열 :  "+ str1);
//		System.out.print("입력 : ");
//		String s1 = sc.next();
//		String s2 = sc.next();
//		String s3 = sc.next();
//		System.out.printf("문자열 : %s %s %s\n",s1,s2,s3);
		
		
		
//		System.out.print("문자열 입력 : ");
//		String str2 = sc.nextLine(); //스페이스바 문자열
////		문자열 입력 : 대구광역시 중구 ---대로 광개토병원 9층
//		System.out.println("문자열 :" + str2);
////		문자열 :대구광역시 중구 ---대로 광개토병원 9층
//		
		
		//주의! 여러개 값을 받을때 sc.nextLine() 주의점//
		System.out.print("정수값 입력 : ");
		int n1 = sc.nextInt();
		System.out.println("정수값 : "+n1);
		System.out.print("실수값 입력:");
		double n2 = sc.nextDouble();
		
		//여기서 문제발생!
		sc.nextLine(); // 그전에 입력값이 있다면 48번줄 쓰기전 sc.nextLine 입력 우선
		System.out.print("문자열입력 : ");
		String str2 = sc.nextLine();
		System.out.println("문자열 :" + str2);
		System.out.print("문자열 입력 : ");
		
		String str =sc.next();
		System.out.println("문자열 :" + str);
		
		System.out.println("프로그램을 종료합니다...");
	}

}
