package step15_CollectionFramework.Comparable;

import java.util.Comparator;

import step14_Lambda.API.Operator.Fruit;

public class DescendingComparator implements Comparator<Fruit>{
	@Override // Comparator 인터페이스를 구현하려면 compare()메소드를 오버라이딩 해 주어야 함 
	public int compare(Fruit o1, Fruit o2) {
		if(o1.price<o2.price) return 1;  // 가격 필드를 비교했을때 o1이 o2보다 작으면 1, 동등하면 0, 크면 -1 리턴 
		else if(o1.price==o2.price) return 0;
		else return -1;
	}
	
}
