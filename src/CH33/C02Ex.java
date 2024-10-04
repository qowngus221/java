package CH33;

import java.util.Arrays;

@FunctionalInterface
interface Functional{
	int execute(int ...args);
}

class Calc{
	Functional sum;
	Functional sub;
	Functional mul;
	Functional div;
	Calc(){
//		sum = (arg)->{ return Arrays.stream(arg).sum();
//		};
		sum = (arg)->{
			return Arrays	.stream(arg)
							.boxed()
							.reduce(0,(sum,el)->sum+el);
		};
		sub = (arg)->{
		
			return Arrays	.stream(arg)
							.boxed()
							.sorted((a,b)->b-a)
//							.reduce(0,(sub,b)->{
//								if(sub==0) 
//									return b;
//								else 
//									return sub-b;
//							});
							.reduce((sub,b)->sub-b).orElse(0);
							
		};
		mul =(arg)->{
			int mul =0;
			for(int el : arg)
				mul *= el;
			return mul;
		};
		div = (arg)->{
			int div = 0;
			for(int el : arg)
				div /= el;
			return Arrays	.stream(arg)
					.sorted()
					.reduce((a,b)->b-a)
					.orElse(0);
		};
		
		
		//sum,sub,mul,div 각각에 람다&스트림함수를 적절히 이용해서 기능 구현을 합니다
		//모든 인자를 받을 수 있는 가변인자 처리로 구현합니다
		//뺄셈,나눗셈은 큰수에서 작은수로 정렬(sorted)한다음 누적 감산 처리(reduce)를 합니다
		
	}
}

public class C02Ex {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("합 :" + calc.sum.execute(10,20,30,40,50,60));
		System.out.println("차 :" + calc.sub.execute(1,4,2,5));//1,2,4,5

	}

}
