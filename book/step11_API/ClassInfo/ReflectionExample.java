package step11_API.ClassInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("step07.fieldExtends.array.Car"); // forName() 메소드는 반드시 예외처리를 해주어야 함 
		
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();
		
		
		System.out.println("[생성자 정보]");
		//생성자 이름과 매개 변수 정보를 출력 
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.println(constructor.getName() + "(");  // 생성자 이름 출력 
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);  // 생성자 파라미터 출력하는 메소드 호출 
			System.out.println(")");
		}
		
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();  // 클래스의 필드 정보를 fields 변수에 참조시킴 
		for(Field field : fields) { // 향상된 for문  fields의 모든 정보를 출력하기 위해 사용 
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods(); // 클래스의 메소드 정보를 fields 변수에 참조시킴 
		for(Method method : methods) {
			System.out.println(method.getName() + " " + "(" ); // 메소드 이름 출력 
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters); // 메소드 파라미터 출력하는 메소드 호출 
			System.out.println(")");
		}
		
	}
	
	private static void printParameters(Class[] parameters) {  //파라미터를 출력하는 메소드 선언 
		// 메소드던 생성자던 이 메소드로 모두 파라미터를 불러올 수 있는 이유는 
		// 파라미터 타입이 Class[] 이고, 메소드와 생성자는 class의 멤버이므로 자동 타입 변환됨 
		for(int i=0; i<parameters.length;i++) {
			System.out.println(parameters[i].getName());
			if(i<(parameters.length-1)) {
			System.out.println(",");
			}
		}
	}

}
