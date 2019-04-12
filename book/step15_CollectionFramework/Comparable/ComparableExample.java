package step15_CollectionFramework.Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		//TreeSet 객체 생성 
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//객체 저장할 때 나이순으로 정렬됨. Person 클래스에서 compareTo 메소드를 재정의했기때문 
		treeSet.add(new Person("홍길동",45));
		treeSet.add(new Person("감자바",25));
		treeSet.add(new Person("박지원",31));

		Iterator<Person> iterator = treeSet.iterator(); //반복자 얻기 
		// 왼쪽 노드에서 오른쪽 마지막 노드까지 반복해서 가져옴 -> 오름차순 정렬되었으므로 
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":"  + person.age);
		}
	
	}
}
