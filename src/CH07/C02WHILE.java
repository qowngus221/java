package CH07;

import java.util.Scanner;

public class C02WHILE {

	public static void main(String[] args) {
		
		//2단 - 9단 출력
//		int dan = 2;
//		while(dan<=9) {
//			
//			int i =1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		// 2단  - 9단 출력
//		int dan = 2;
//		while(dan<=9) {
//			
//			int i =9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
//		----------------------------
//		int dan = 9;
//		while(dan>=2) {
//			
//			int i =9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//	}
//		---------------------------
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		while(dan>10 ||dan <= 2) {
//			System.out.println("다시입력하세요");
//			dan = sc.nextInt();
//		}
//		int n = 2;
//		while(n<=dan) {
//			int i = 1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",n,i,n*i);
//				i++;
//			}
//			System.out.println();
//			n++;
//			
//		}
		
		
//		//------------------------------
//		int dan = sc.nextInt();
//		int n = sc.nextInt();
//		while(dan<=n) {
//			int i = 1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		//별찍기(기본높이:4)
		//*****
		//*****
		//*****
		//*****
//		int i = 0;
//		
//		while(i<4) {
//			int j = 0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
		
		
		
		
		//*
		//**
		//***
		//****
//		int i = 0;
//		while(i<4) {
//			int j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//				
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//****
		//***
		//**
		//*
//		(v1)
//		int i = 0;
//		while(i<4) {
//			int j =3;
//			while(j>=i) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
//		----------------------------
		//(v2)
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<4-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//   * 1
		//  *** 3
		// ***** 5
		//******* 7
		
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			int k = 0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			while(k<(i+1)*2-1) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

//		-----------------------------
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		//*******
		// *****
		//  ***
		//   *
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<=i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 7;
//			while(k>i*2) {  
//				System.out.print("*");
//				k--;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		//   *
		//  ***
		// *****		
		//*******
		
		// *****   4
		//  ***
		//   *
//		int i = 0;
//		while(i<7) {
//			
//			if(i<4) {
//				int j=0;
//				int k=0;
//				while(j<3-i) {
//					System.out.print(" ");
//					j++;
//					
//				}
//				while(k<(i+1)*2-1) {
//					System.out.print("*");
//					k++;
//				}	
//				}
//			else {
//				int j =0;
//				int k =0;
//				while(j<i-3) {
//					System.out.print(" ");
//					j++;
//				}
//				while(k<13-(2*i)) { 
//					System.out.print("*");
//					k++;
//				}
//			} 
//			System.out.println();
//			i++;
//			
//			
//			
//		}
		
		
		
		
		//*******
		// *****
		//  ***
		//   *
		
		//   *
		//  ***
		// *****		
		//*******
		
		int i = 0;
		while(i<8) {
			if(i<=3) {
				int j = 0;
				int k = 0;
				while(j<i) {
					System.out.print(" ");
					j++;
				}
				while(k<7-(i*2)) {    
					System.out.print("*");
					k++;
				}
			}
			else {
				int j = 0;
				int k = 0;
				while(j<7-i) {      
					System.out.print(" ");
					j++;
				}
				while(k<(i*2)-7) {
					System.out.print("*");
					k++;
					
				}
			}
		System.out.println();
		i++;
		}
		
		
		
		
		
//		별찍기(기본높이:h)
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		int a = 0;
//		while(a<i) {
//			int j = 0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		
//}
//}
//		
//		
		
//		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<h-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			
//			System.out.println();
//			i++;
//		}
	}
}
	
	
	
