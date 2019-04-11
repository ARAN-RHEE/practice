package step15_CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		// key타입이 Student, value타입이 Integer인 HashMap 객체 생성 
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 95); // 학번과 이름이 동일한 Student를 키로 저장 
		
		System.out.println("총 Entry 수 : " + map.size()); // 중복저장을 하지 않기 때문에 1개만 저장됨 
	}
}
