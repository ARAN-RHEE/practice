package step15_CollectionFramework.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		//TreeSet 객체 생성 
		//Integer를 참조하는 객체를 담아줌. 넣는 순서에 상관 없이 크기순으로 자동 정렬됨 
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		//내림차순 정렬 하기 위해 NavigableSet 객체 생성 
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet) { // TreeSet에 담겨있던 객체들 내림차순 정렬 출력 
			System.out.print(score +" ");
		}
		System.out.println();
		
		// descendingSet 메소드를 두번 호출하면 오름차순 정렬됨 
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) { // TreeSet에 담겨있던 객체들 오름차순 정렬 출력 
			System.out.print(score + " ");
		}
	}
}
