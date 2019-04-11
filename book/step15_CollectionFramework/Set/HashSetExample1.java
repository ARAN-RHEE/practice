package step15_CollectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // HashSet 객체 생성 
		
		// HashSet에 객체 저장 
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // Java는 한번만 저장됨 
		set.add("iBATIS");
		
		int size = set.size(); // 중복저장은 안되므로 객체 수는 4개 
		System.out.println("총 객체 수 : "+size);
		
		Iterator<String> iterator = set.iterator(); // 반복자 얻기 - iterator()메소드 호출 
		while(iterator.hasNext()) { // 객체 수만큼 while문 루핑 
			String element = iterator.next(); // 객체 한개 가져옴 
			System.out.println("\t"+element);
		}

		// 객체 한개씩 삭제 
		set.remove("JDBC"); // 해당 문자열을 참조하는 객체 삭제 
		set.remove("iBATIS");
		
		System.out.println("총 객체 수 : "+set.size());
		
		iterator = set.iterator(); //반복자 얻기 - iterator()메소드 호출 
		while(iterator.hasNext()) {  //객체 수만큼 while문 루핑 
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear(); // 객체 모두 제거 
		if(set.isEmpty()) { // 객체가 비어있다면 아래 문자열 출력 
			System.out.println("비어 있음");
		}
	}

}
