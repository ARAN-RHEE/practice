package step15_CollectionFramework.Map;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	// equals()와 hashCode()가 재정의되어있음 
	@Override
	public boolean equals(Object obj) { //학번과 이름이 동일할 경우 true 리턴 
		if(obj instanceof Student) { // obj가 Student타입인지 확인 후 
			Student student = (Student) obj; // 타입변환 해주고 
			return (sno==student.sno) && (name.equals(student.name)); // 결과 리턴 
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() { // 학번과 이름이 같다면 동일한 값 리턴 
		return sno+name.hashCode();
	}
}
