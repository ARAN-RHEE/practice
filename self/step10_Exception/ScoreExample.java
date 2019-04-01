package step10_Exception;

import java.util.Scanner;

public class ScoreExample {
// 과목명, 점수를 입력하고 총합, 평균 구하는 프로그램 만들기 
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력할 과목이 몇개입니까?");
		int subjectIdx = sc.nextInt();
		Score[] array = new Score[subjectIdx];

		for (int i = 0; i < subjectIdx; i++) {
			System.out.println("과목명 : ");
			String subject = sc.next();
			System.out.println("점수 : ");
			int score = sc.nextInt();

			Score sco = new Score(subject, score);
			if (array[i] == null) {
				array[i] = sco;
			}
		}
			
			System.out.print("점수 합계 : ");
			int sum = 0;
			
			for(int i=0; i<array.length; i++) {
				sum+=array[i].getScore();
			}
			
			System.out.println(sum);
			System.out.print("점수 평균 : ");
			System.out.println((double)(sum/array.length));
		
	} catch (Exception e){
		System.out.println("에러입니다. 아래 오류를 확인하세요.");
		e.printStackTrace();
	}
		// for(int i=0;i<array.length;i++) {
		// System.out.println(array[i].getSubject()+" " + array[i].getScore());
	}
}