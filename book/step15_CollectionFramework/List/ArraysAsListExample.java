package step15_CollectionFramework.List;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		
		// 고정된 객체들로 List를 구성할때는 asList 메소드를 이용하면 간편함 
		List<String> list1 = Arrays.asList("홍길동","신용권","김자바");
		for(String name : list1) { // for문이 list1의 모든 인덱스를 돌게됨. 
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {// for문이 list2의 모든 인덱스를 돌게됨. 
			System.out.println(value);
		}
	}

}
