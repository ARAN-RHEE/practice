package step11_API.hashCode;

import java.util.Objects;


public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동"); // Student 타입 객체 생성  s2
		Student s2 = new Student(1, "홍길동"); // Student 타입 객체 생성 s2
		System.out.println(s1.hashCode());  //s1의 해시코드 리턴. 오버라이딩 한 메소드 
		System.out.println(Objects.hashCode(s2));  // 오버라이딩 전의 메소드 

	}
	
	static class Student {
		int sno; 
		String name;
		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}

}
