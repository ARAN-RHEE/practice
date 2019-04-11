package step15_CollectionFramework.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		//HashMap 객체 생성 
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권",95 );
		map.put("홍길동",90 );
		map.put("동장군",80 );
		map.put("홍길동",95 ); // 홍길동 키가 같기 떄문에 마지막에 저장한 값으로 대체됨 
		System.out.println("총 Entry 수 : " + map.size()); // 저장된 객체(Map.Entry) 수 
		
		//객체 찾기
		System.out.println("\t홍길동 : "+map.get("홍길동")); //key로 value값 검색 
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // keySet 메소드 호출 - 모든 키를 Set 객체에 담아서 리턴 
		Iterator<String> keyIterator = keySet.iterator(); // 반복자 얻기 - iterator() 메소드 호출 
		while(keyIterator.hasNext()) { // 객체 하나씩 처리 
			String key = keyIterator.next(); //반복해서 key를 얻고 
			Integer value = map.get(key);  	// key를 통해 value 값을 얻어냄 (get)
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동"); // key로 Map.Entry 제거 
		System.out.println("총 Entry 수 : "+map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet(); // Map.Entry Set얻기 
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator(); 
		
		while(entryIterator.hasNext()) { // 반복해서 Map.Entry를 얻고 키/value값을 얻어냄 
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		
		System.out.println();
		
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : "+map.size());
	}
}
