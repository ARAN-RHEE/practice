package step11_API.Exercise;

public class IntegerCompareExample {

	public static void main(String[] args) {
		//Integer 객체 생성 
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1==obj2);
		System.out.println(obj3==obj4);

		// 위에는 true, 아래는 false가 나오는 까닭 설명하기.
		// Integer 객체는 int타입의 값을 같지만 기본타입의 값을 내부에 두고 포장하는 포장객체라고 함.
		// 포장객체의 기본 타입 값은 외부에서 변경할 수 없음. 
		// 포장 객체에 기본타입의 값을 대입하면 자동 박싱이 일어나 힙 영역에 Integer 객체가 생성된다. 따라서 같은 값이 담겨도 서로 다른 객체가 된다. 
		// 그러나 Integer 객체 안에 담긴 수가 -127~127 사이이면 내부의 값을 비교하는 것이 아니라 객체의 참조를 비교하는  == != 연산자로 비교 가능하다. 
	}

}
