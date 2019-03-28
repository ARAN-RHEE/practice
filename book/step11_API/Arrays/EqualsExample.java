package step11_API.Arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		//중첩 배열 선언 
		int[][] original = { {1,2}, {3,4} };
		
		//얖은 복사후 비교
		//얇은 복사는 복제본도 원본과 같은 배열을 참조하고 있음. 1차항목 비교시 같음 
		System.out.println("[얕은 복제후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));
		
		//깊은 복사후 비교
		//깊은 복사는 중첩된 배열의 항목까지 비교. 
		System.out.println("\n[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교: " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));

	}

}
