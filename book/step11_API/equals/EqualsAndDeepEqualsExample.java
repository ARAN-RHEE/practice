package step11_API.equals;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1 = 1000; //Integer 타입의 변수 선언
		Integer o2 = 1000; // Integer 타입의 변수 선언 
		
		
		//변수 동등 비교 
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null,o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2)+"\n");
		
		//참조자료형일 때 변수 동등 비교 
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		System.out.println(Objects.equals(arr1, arr2)); // 두 배열이 다르므로 false
		System.out.println(Objects.deepEquals(arr1, arr2)); // 배열의 값이 같으므로 true 
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));

	}

}
