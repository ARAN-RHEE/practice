package step11_API.Comparator;
import java.util.Comparator;
import step11_API.Comparator.CompareExample.Student;

class StudentComparator implements Comparator<Student> { //Comparator<Student> 인터페이스를 구현하는 클래스
	@Override
	//return Integer.compare(a.sno, b.sno) 로 대체 가능 
	public int compare(Student a, Student b) { // 메소드 오버라이딩
		// a가 b보다 작으면 음수 리턴, 같으면 0 리턴 , 크면 1 리턴하기 
		if (a.sno < b.sno ) return -1;
		else if (a.sno == b.sno ) return 0;
		else return 1;
	}
}
