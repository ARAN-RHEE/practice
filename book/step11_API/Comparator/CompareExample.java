package step11_API.Comparator;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		Student s1 = new Student(1); // sno 필드값 1 
 		Student s2 = new Student(1); // sno 필드값 1
		Student s3 = new Student(2); // sno 필드값 2 
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		// StudentComparator로 두 값 비교하기 
		System.out.println(result);
		result = Objects.compare(s1, s3,  new StudentComparator());
		// StudentComparator로 두 값 비교하기 
		System.out.println(result);
	}
	
	static class Student{
		int sno;
		Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {  
		// static 으로 객체를 생성한 이유는 main메소드에서 객체생성없이 사용하려고
		@Override
		public int compare(Student o1, Student o2) {
			/* if(o1.sno < o2.sno)_ return -1;
			 * else if (o1.sno == o2.sno) return 0;
			 * else return 1  */
			return Integer.compare(o1.sno, o2.sno);
			 
		}
	}
}
