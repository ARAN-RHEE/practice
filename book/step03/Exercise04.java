package step03;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		
		//학생 한명이 가지는 연필 수. 총 연필 갯수를 학생 수로 나눈 값(몫)이 학생 한명당 가지는 연필 수가 됨. 
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수. 총 연필 갯수를 학생 수로 나눈 값의 나머지가 최종적으로 남는 연필 갯수가 됨. 
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}
