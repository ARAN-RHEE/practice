package step15_CollectionFramework.TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {
	// 키로 정렬하고 범위 검색하기 
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		// TreeMap 객체 생성 후 key와 value값을 갖는 객체 추가하기 
		treeMap.put("apple",new Integer(10));
		treeMap.put("forever",new Integer(60));
		treeMap.put("description",new Integer(60));
		treeMap.put("ever",new Integer(50));
		treeMap.put("zoo",new Integer(10));
		treeMap.put("base",new Integer(20));
		treeMap.put("guess",new Integer(70));
		treeMap.put("cherry",new Integer(30));
		
		System.out.println("c~f 사이의 단어 검색");
		NavigableMap<String,Integer> rangeMap = treeMap.subMap("c", true,"f",true); // 2,4번째 파라미터는 1,3번째파라미터를 포함하는지 확인
		for(Map.Entry<String,Integer> entry : rangeMap.entrySet()) { // 향상된 for문. entrySet()은 Map에 정의된 key,value값 다 가져옴
			System.out.println(entry.getKey()+"-"+entry.getValue()+"페이지");
		}
	}
}
