package step11_API.String;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.toString(str1)); 
		System.out.println(Objects.toString(str2)); //null 값을 받으면 "null" 리턴 
		System.out.println(Objects.toString(str2, "이름이 없습니다")); // null 값을 받으면 파라미터 nullDefault를 리턴 
		

	}

}
