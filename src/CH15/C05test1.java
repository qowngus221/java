package CH15;

class TV1{
	protected int size;
	public TV1(int size) {this.size=size;}
	protected int getSize() {return size;}
}
class ColorTV extends TV1{
	private int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	
	
}
class IPTV extends ColorTV{
	private String addr;

	public IPTV(String addr,int size, int color ) {
		super(size, color);
		this.addr = addr;
	}
	
	public void printProperty() {
		System.out.println(getSize()+"인치"+getColor()+"컬러"+addr+"ip주소"); 
}
	


	
	
	
}


public class C05test1 {

	public static void main(String[] args) {
//		ColorTV myTV = new ColorTV(32, 1024);
//		   myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
		}

	}


