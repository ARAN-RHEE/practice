package step11_API.Exercise;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override  //equals 메소드 오버라이딩 
	public boolean equals(Object obj) {
		if(obj instanceof Student) { // obj가 Student 타입이라면 
			Student num = (Student) obj; // Student 타입으로 강제 변환해주고 
			if(this.studentNum == num.studentNum) {  // studentNum 필드값이 같을 시 true 리턴 
				return true;
			}
		}
		// obj가 Key타입이 아니면 false 리턴 
		return false;
	}
	
	@Override
	// studentNum 필드값이 같아도 hashCode()에서 리턴하는 해시코드가 다르기때문에 다른 식별키로 인식함
	// 해시코드의 리턴값을 studentNum 필드값으로 할 경우 같은 해시코드가 리턴됨 
	public int hashCode() {
		return studentNum.hashCode();
	}
}
