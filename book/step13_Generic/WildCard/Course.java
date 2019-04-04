package step13_Generic.WildCard;

public class Course<T> {
	
	private String name;
	private T[] students; //타입파라미터 T가 적용된 부분 
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		// 타입 파라미터로 배열을 생성하려면 new T[n] 형태로 배열 생성 불가
		// (T[]) (new Object[n]) 형태로 생성해야함 
	}
	
	public String getName() {
		return name;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i=0; i<students.length;i++) {
			// 배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드 
			if(students[i]==null) {
				students[i] = t;
				break;
			}
		}
	}
}
