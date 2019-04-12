package step15_CollectionFramework.TreeSet;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		//TreeSet 객체 생성 
		//Integer를 참조하는 객체를 담아줌. 넣는 순서에 상관 없이 크기순으로 자동 정렬됨 
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null; //일단 null로 초기화. 객체를 담아줄 그릇 용도 
		
		score = scores.first(); // 제일 낮은 객체 리턴 
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last(); // 제일 높은 객체 리턴 
		System.out.println("가장 높은 점수 : " + score);
		 
		score = scores.lower(new Integer(95)); // 주어진 객체보다 바로 아래 객체를 리턴 
		System.out.println("95점 아래 점수 : "+score);
		
		score = scores.higher(new Integer(95)); // 주어진 객체보다 바로 위 객체 리턴 
		System.out.println("95점 위의 점수 : "+score);

		score = scores.floor(new Integer(95)); // 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 아래 객체 리턴 
		System.out.println("95점이거나 바로 아래 점수 : "+score);
		
		score = scores.ceiling(new Integer(85)); // 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 위 객체 리턴 
		System.out.println("85점 이거나 바로 위의 점수 : "+score);
		
		
		while(!scores.isEmpty()) { //TreeSet에 객체가 남아있다면 
			score = scores.pollFirst(); // 가장 높은것을 꺼내오고 컬렉션에서 제거함. 남은 객체 수 하나씩 감소 
			System.out.println(score + "(남은 객체 수 : "+scores.size()+")");
		}
		

	}

}
