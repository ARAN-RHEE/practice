package step14_Lambda;

import java.util.function.ToIntFunction;



public class ToIntFunctionExample {
	private static Student[] students = {
			// 배열 생성 
			new Student("홍길동",90,96),
			new Student("신용권",95,93)
	};
	
	//avg 메소드 작성 
	public static double avg(ToIntFunction<Student> operator) {
		int count=0;
		int sum =0;
		
		for(Student student : students ) {
			// for문이 students의 길이만큼 돌게됨.
			// applyAsInt() -> 람다식 실행 메소드 
			sum += operator.applyAsInt(student);
				count++; //for문 돌때마다 1증가. 즉 students.length와 같음 
		}
		
		double avg = (double)sum/count;
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s->s.getEnglishScore());
		// double englishAvg = avg(Student :: getEnglishScore);
		System.out.println("영어 평균 점수 : "+ englishAvg);
		
		double mathAvg = avg(s->s.getMathScore());
		// double englishAvg = avg(Student :: getMathScore);
		System.out.println("수학 평균 점수 : " + mathAvg);
		
	}
	
	public static class Student { //클래스가 static이므로 객체생성없이 메소드 접근가능 
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student (String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}
		
		public String getName() {
			return name;
		}
		public int getEnglishScore() {
			return englishScore;
		}
		public int getMathScore() {
			return mathScore;
		}
	}
}
