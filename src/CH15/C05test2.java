package CH15;

import java.util.Scanner;
abstract class Converter {
   abstract protected double convert(double src); // 추상 메소드
   abstract protected String getSrcString(); // 추상 메소드
   abstract protected String getDestString(); // 추상 메소드
   protected double ratio; // 비율
   public void run() {
      Scanner scanner = new Scanner(System.in);
      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
      System.out.print(getSrcString()+"을 입력하세요>> ");
      double val = scanner.nextDouble();
      double res = convert(val);
      System.out.println("변환 결과: "+res+getDestString()+"입니다");
      scanner.close();
   }
}

class Won2Dollar extends Converter{
	private double dollar;

	public Won2Dollar(double dollar) {
		super();
		this.dollar = dollar;
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/dollar;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}
}

class Km2Mile extends Converter{
	private double mile;

	public Km2Mile(double mile) {
		super();
		this.mile = mile;
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/1.6;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}
	
}
public class C05test2 {

	public static void main(String[] args) {
//		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
//		toDollar.run();
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
		toMile.run();
	}

}
