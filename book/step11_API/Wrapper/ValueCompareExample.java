package step11_API.Wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]"); // 이 범위 이내의 값이면 ==연산자 이용 가능하기 때문 
		// 범위를 초과하는 경우도 있기 떄문에 포장 객체를 확실히 아는것이 아니면 ==은 사용하지 않는 것이 좋음 
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}

}
