package CH03;

public class C04TypeChange {

	public static void main(String[] args) {
		//정수 연산식(int 보다 작은 변수자료형 (short, char, btye))
		//
//		byte x = 10;
//		byte y  =20;
//		short z = 30;
//		char u  = 40;
////		int result1 = x+y+z+u;
//		byte result1 = (byte)(x+y);
//		
////		int result1 = x + y;
//		System.out.println(result1);

		//정수 연산식(int 보다 큰 변수자료형(long))
//		byte var1 = 10;
//		int var2 = 100;
//		long var3 = 1000L;
//		int result = var1 + var2 + var3;  //long 자료형이 더 크기때문에 에러
//		
//		long result2 = var1 + var2 + var3;
//		System.out.println(result2);
		
		//실수연산식
		//큰 타입으로 자동 형 변환
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		int result3 = (int)(intvar + flvar + dbvar); //intvar , flvar 각각 double 형으로   / 다 더한뒤 실수값 제거
		int result5 = intvar + (int)flvar + (int)dbvar; //intvar , flvar 가 double 형으로  / 실수값 제거후 더하기
		double result4 = intvar + flvar + dbvar;
		System.out.println(result3);
	
	}

}
