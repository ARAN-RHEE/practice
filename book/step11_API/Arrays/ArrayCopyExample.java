package step11_API.Arrays;

import java.util.Arrays;

public class ArrayCopyExample {
	//배열 복사 

	public static void main(String[] args) {
		char[] arr1 = { 'J','A','V','A'}; // char 타입 배열 선언 
		
		
		//방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); // 배열의 전체 복사 
		System.out.println(Arrays.toString(arr2));
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // 배열의 1번 인덱스부터, 3번인덱스 전까지 즉 1~2번 인덱스 
		System.out.println(Arrays.toString(arr3));		
		
		//방법3
		char[] arr4 = new char[arr1.length];
		//arraycopy(원본배열, 원본시작인덱스, 타겟배열, 타겟시작인덱스, 복사갯수) -> 배열전체복사 
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
	}
	}

}
