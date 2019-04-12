package step15_CollectionFramework.Comparable;

import java.util.Iterator;
import java.util.TreeSet;

import step14_Lambda.API.Operator.Fruit;

public class ComparatorExample {
	public static void main(String[] args) {
		/*
		 * TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		 * fruit이 Comparable을 구현하지 않았기 때문에 예외 발생 
		 * treeSet.add(new Fruit("포도",3000)); 
		 * treeSet.add(new Fruit("수박",10000)); 
		 * treeSet.add(new Fruit("딸기",6000)); 
		 */
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator()); //내림차순 정렬자 제공. TreeSet객체 생성할때 파라미터로 
		//저장될 때 가격을 기준으로 내림차순 저장됨 
		treeSet.add(new Fruit("포도",3000)); 
		treeSet.add(new Fruit("수박",10000)); 
		treeSet.add(new Fruit("딸기",6000)); 
		Iterator<Fruit> iterator = treeSet.iterator(); //반복자 얻기. 담긴 객체에 모두 접근하기 위함 
		while(iterator.hasNext()) { // 꺼내올 객체가 있을 떄 
			Fruit fruit = iterator.next(); // 하나씩 꺼내오고 
			System.out.println(fruit.name +":"+fruit.price); // 필드 name, price 출력 
		}
	}
}
