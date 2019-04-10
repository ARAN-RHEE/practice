package step14.Lambda.API.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList( //배열을 리스트로 만들어주는 메소드 
			new Student("홍길동","남자",90),
			new Student("김순희","여자",90),
			new Student("김자바","남자",95),
			new Student("박한나","여자",92)
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count=0, sum=0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++; // 리스트의 인덱스 수만큼 count 증가. for-each문이 리스트의 인덱스 수만큼 돌기 때문 
				sum+= student.getScore(); 
			}
		}
		
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t->t.getSex().equals("남자"));
		System.out.println("남자 평균 점수 : "+maleAvg);
		double femaleAvg = avg(t->t.getSex().equals("여자"));
		System.out.println("여자 평균 점수 : "+femaleAvg);
	}
}
