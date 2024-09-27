package CH19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class C03Ex {
	public static void main(String[] args) {
		
		//1 ~ 45 까지숫자를 6개를 랜덤으로 받아(Random클래스를이용) set에 저장
		//[추가]저장된 set의 오름차순정렬을 해보세요(검색을통해서 해결해봅니다)
		
		Set<Integer> set = new HashSet();
		Random rnd = new Random();
		while(true) {
			int num = rnd.nextInt(45)+1;
			set.add(num);
			if(set.size()>=6)
				break;
				
		}
		List<String> list = new ArrayList(set);
		
		Collections.sort(list);
		
			
		System.out.println("------주현 로또 꽝-------");
		System.out.println(list);
		
		
		}
		
}

