package step07;

public class StudentExample {

	public static void main(String[] args) {
		Student_extends student = new Student_extends("홍길동", "123456-1234567",1);
		// student 클래스의 필드에 접근하기 위해 객체 생성. 
		System.out.println("name :" + student.name);  // 부모에게서 물려받은 필드 출력
		System.out.println("ssn : " + student.ssn); // 부모에게서 물려받은 필드 출력 
		System.out.println("studentNo : " + student.studentNo); // student 본인의 필드 출력

	}

}
