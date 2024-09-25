package CH13;

class Parent{
	void func1() {System.out.println("parent func() CALL!");}
}
class Son extends Parent{
	void func1() {System.out.println("Son Func1 호출!");}
	
	void func2() {System.out.println("Son Func2 호출(extends...)!");}
}

public class C06UpDownCastingOverringMain {

	public static void main(String[] args) {
		Parent ob1 = new Parent();
		ob1.func1();
		
		Son ob2 = new Son();
		ob2.func1();
		
		Parent ob3 = new Son();	//!!!!!!!
		//ob3.func2();
		ob3.func1();
		
		//UPCASTING
		//상위클래스형 참조변수 = 하위클래스형 객체
		//자동형변환
		//상속관계에 있는 모든 클래스의로 만든 여러 객체들을 다 연결시키기 위해 // 상속관계의 모든 클래스로 만든 객체를 연결할 수 있다.
		//UPCASTING상태에서는 확장된(추가된) 멤버변수 접근가능? x -> DOWNCASTING 로 해결
		//UPCASTING상태에서는 확장된(추가된) 멤버함수 접근가능? x -> DOWNCASTING 로 해결
		//UPCASTING상태에서는 재정의도니 함수에 접근가능? o
	}
 
}
