package step14.Lambda.API.FunctionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(
			// asList -> 고정된 객체들로 구성된 list 생성
			// 메소드 호출 시 리스트 매개값을 요구하면 고정된 항목으로 빠르게 list를 만들고
			// 이것을 매개값으로 제공할 목적 
			new Student("홍길동",90,96),
			new Student("신용권",95,93)
			);
	
	
	public static void printString(Function<Student,String> function) {
		for(Student student : list) { // 리스트에 저장된 항목 수만큼 출력 
			System.out.println(function.apply(student)+" "); // 람다식 실행 
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.println(function.applyAsInt(student)+" "); // 람다식 실행 
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		printString(t->t.getName());
		
		System.out.println("[영어점수]");
		printInt(t->t.getEnglishScore());
		
		System.out.println("[수학점수]");
		printInt(t->t.getMathScore());
	}
}
