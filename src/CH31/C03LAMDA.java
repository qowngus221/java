package CH31;

interface Calculator{
	int calculate(int num1, int num2);
}
public class C03LAMDA {

	public static void main(String[] args) {
		//덧셈
		Calculator add = (a,b)->a+b;
		System.out.println(add.calculate(10, 20));
		//뺄셈
		Calculator sub = (a,b)->a-b;
		System.out.println(sub.calculate(30, 10));
		//곱셈
		Calculator mul = (a,b)->a*b;
		System.out.println(mul.calculate(10, 20));
		//나눗셈
		Calculator div = (a,b)->a/b;
		System.out.println(div.calculate(100, 5));
	}
	
	
	
}
