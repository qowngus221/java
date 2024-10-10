package CH00;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		Integer removeResult = null;

		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);

		if( arrList.size() > 0 ) {
		    removeResult = arrList.remove(arrList.size() - 1);
		    System.out.println(arrList.get(arrList.size()-1));
		}

		System.out.println(arrList.size()-1);
		System.out.println(removeResult);
		System.out.println(arrList);
	}
	
	
}
