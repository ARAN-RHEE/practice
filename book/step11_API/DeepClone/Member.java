package step11_API.DeepClone;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores; // 참조타입 필드. 깊은 복제 대상 
	public Car car;  // 참조 타입 필드. 깊은 복제 대상 
	
	public Member(String name, int age, int[] scores, Car car) { // 생성자 선언 
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException { // clone()메소드 오버라이딩
		//먼저 얕은 복사를 해서 name, age를 복사한다.
		Member cloned = (Member) super.clone(); // super-> 부모클래스. 즉 Object 클래스의 clone()를 호출한다 
		//scores를 깊은 복제한다
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); 
		//copyOf() 메소드는 전달받은 배열의 특정 길이만큼을 새로운 배열로 복사하여 반환.
		//car를 깊은 복제한다
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴 
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); // 오버라이딩 된 clone() 메소드 호출 
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
 