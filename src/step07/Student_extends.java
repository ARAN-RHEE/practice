package step07;

public class Student_extends extends People_extends{
	public int studentNo;
	
	//상속받은 자식의 생성자. 
	//부모 생성자를 호출하기 위해 super() 사용. 
	public Student_extends(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		}
	}

