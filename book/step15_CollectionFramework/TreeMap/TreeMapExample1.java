package step15_CollectionFramework.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
	public static void main(String[] args) {
		//TreeMap 객체 생성 
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		
		//TreeMap 객체 매핑  
		scores.put(new Integer(87),"홍길동");
		scores.put(new Integer(98),"이동수");
		scores.put(new Integer(75),"박길순");
		scores.put(new Integer(95),"신용권");
		scores.put(new Integer(80),"김자바");
		
		Map.Entry<Integer, String> entry = null; //null로 초기화 해 놓고 객체를 담아줄 용도 
		
		entry = scores.firstEntry();// 제일 낮은 Map.Entry를 리턴 
		System.out.println("가장 낮은 점수 : "+entry.getKey()+"-"+entry.getValue());
	
		entry = scores.lastEntry(); //제일 높은 Map.Entry 리턴 
		System.out.println("가장 높은 점수 : "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.lowerEntry(new Integer(95)); // 주어진 키보다 바로 아래 Map.Entry 리턴 
		System.out.println("95점 아래 점수 : "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.higherEntry(new Integer(95)); // 주어진 키보다 바로 위 Map.Entry 리턴 
		System.out.println("95점 위의 점수 : "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.floorEntry(new Integer(95)); // 주어진 키와 동등한 객체가 있으면 해당 Map.Entry 리턴, 없으면 바로 아래 객체의 Map.Entry 리턴 
		System.out.println("95점 이거나 바로 아래 점수 : "+entry.getKey()+"-"+entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(85)); // 주어진 키와 동등한 객체가 있으면 해당 Map.Entry 리턴, 없으면 바로 위 객체의 Map.Entry 리턴 
		System.out.println("85점이거나 바로 위 점수  : "+entry.getKey()+"-"+entry.getValue());
		
		while(!scores.isEmpty()) { // 객체가 참조하는 값이 있으면 
			entry = scores.pollFirstEntry(); // 가장 낮은 Map.Entry를 꺼내오고 컬렉션에서 제거 
			System.out.println(entry.getKey()+"-"+entry.getValue()+"(남은 객체 수 : "+scores.size()+")");
		}
	}
}
