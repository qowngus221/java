//package CH13;
//
////상위클래스
//class Point2D{
//	int x;
//	int y;
//	
//	Point2D(){
//		System.out.println("Point2D 생성자 호출!");
//	}
//	
//	@Override
//	public String toString() {
//		return "Point2D [x=" + x + ", y=" + y + "]";
//	}	
//	//
//	
//	
//}
////하위클래스
//class Point3D extends Point2D{
//	int z;
//	
//	Point3D(){
//		super();	//상속관계의 상위클래스의 생성자 호출
//		System.out.println("Point3D 생성자 호출!");
//	}
//	
//	@Override
//	public String toString() {
//		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
//	}
//	//
//	
//	
//}
//
//public class C01inheritanceMAin {
//
//	public static void main(String[] args) {
//		
//		Point3D obj = new Point3D();
//		obj.x=10;
//		obj.y=20;
//		obj.z=30;
//		System.out.println(obj);
//
//	}
//
//}
