package step11_API.ClassInfo;

import step07.fieldExtends.array.Car;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();  // Car 클래스의 객체 생성 
		Class clazz1 = car.getClass();  //Class의 메소드를 사용하기 위해 객체 생성 
		System.out.println(clazz1.getName());   // 패키지명.클래스명 출력 
		System.out.println(clazz1.getSimpleName()); // 클래스명만 출력 
		System.out.println(clazz1.getPackage().getName()); // 패키지명 출력 
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("step07.fieldExtends.array.Car");
			//forName() 메소드는 파라미터로 주어진 매개값으로 주어진 클래스를 못찾으면 예외발생시킴 
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
