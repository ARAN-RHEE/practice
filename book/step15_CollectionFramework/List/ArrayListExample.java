package step15_CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		// ArrayList 객체 생성
		// 크기를 지정하지 않아서 초기에는 10개의 인덱스를 담을 수 있는 ArrayList가 생성되고 
		// 데이터가 더 들어온다면 용량이 자동적으로 커짐 
		
		// 순차적으로 인덱스에 들어감 
		list.add("Java");   // 0번 
		list.add("JDBC"); // 1번 
		list.add("Servlet/JSP"); //2번 
		list.add(2, "Database"); //3번 
		list.add("iBatis"); // 4번 
		
		int size = list.size();//객체 총 5개 
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2); // 2번 인덱스가 참조하고 있는 객체를 리턴 
		System.out.println("2 : "+skill);
		System.out.println();
		
		for(int i=0; i<list.size();i++) { // 0번~리스트의 마지막 인덱스까지 for문이 돌게됨 
			String str = list.get(i);
			System.out.println(i + ": "+str); // 모든 인덱스가 참조하고 있는 값 출력 
		}
		
		System.out.println();
		
		list.remove(2); // 2번 인덱스 삭제 - Database. 뒤에 있던 인덱스들이 앞으로 땡겨짐 
		list.remove(2); // 2번 인덱스 삭제 - Servlet/JSP. 뒤에 있던 인덱스 땡겨짐 
		list.remove("iBatis"); // 해당 문자열을 참조하는 인덱스 삭제 
		
		for(int i=0; i<list.size(); i++) { //인덱스 삭제 후 남은 list 출력 
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}
}
