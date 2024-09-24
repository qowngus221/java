package CH13Ex;


//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.

//출력 결과
//32인치 1024컬러
class TV{
	int size;

//	TV(){
//		System.out.println("TV생성자");
//	}
	
	TV(int size){
		this.size=size;
	}
	
	
	@Override
	public String toString() {
		return "TV [size=" + size + "]";
	}

}

class ColorTV extends TV{
	int color;
	
	ColorTV(int size, int color){
		super(size);
		this.color=color;
//		System.out.println("ColorTV(int x, int y)생성자");
	}

	
	public void printProperty() {
		System.out.print("ColorTV [color=" + color + ", size=" + size + "]");
	}
	
	
}



public class C01Ex {
	
	public static void main(String[] args) {
		   ColorTV myTV = new ColorTV(32,1024);
		   myTV.printProperty(); // 32인치 1024컬러 가 나오면 해결!
		  
	}
	
}

