package 문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 문제1 {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<String> wordList =new ArrayList<String>();
	
	public static void sort(boolean isAsend) {
		
		if(isAsend) {	//isAsen가 true 라면 오름차순으로 정렬
			Collections.sort(wordList);
			System.out.println(wordList);
		}else {			//isAsen가 false 라면 내림차순으로 정렬
			Collections.sort(wordList,Collections.reverseOrder());
			System.out.println(wordList);
		}
	}
	public static void add(String word) {
		wordList.add(word); 	//wordList에 word 추가
	}
	public static void show() {
		for(String li : wordList) {		// 전체조회
			System.out.println(li.toString());
		}
		
	}
	

	public static void main(String[] args) {
		int n = 0;
		while (true) {
			System.out.println("------------M E N U------------");
			System.out.println("1 추가");
			System.out.println("2 정렬");
			System.out.println("3 확인");
			System.out.println("4 죵료");
			System.out.println("------------M E N U------------");
			System.out.print("번호 : ");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("단어 입력 : ");
				String word = sc.next();
				add(word);
				break;
			case 2:
				System.out.print("오름차순 여부(1:오름차순,0:내림차순) : ");
				int no = sc.nextInt();
				if(no==1) sort(true); else sort(false);
				
				break;
			case 3:
				show();
				break;
			case 4:
				System.out.println("종료합니다");
				System.exit(-1);
				break;
			default:
				System.out.println("다시입력 하세요");
			}
		}
	}
}
