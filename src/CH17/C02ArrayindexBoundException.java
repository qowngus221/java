package CH17;

public class C02ArrayindexBoundException {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30};
		try {
			for (int i= 0;i<4;i++)
				System.out.println(arr[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Error..");
		}
		System.out.println("HELLO WORLD");
	}

}
