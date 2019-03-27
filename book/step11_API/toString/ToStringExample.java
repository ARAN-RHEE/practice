package step11_API.toString;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object(); // Object 객체생성.
		Date obj2 = new Date(); // Date 객체 생성 
		
		System.out.println(obj1.toString()); // Object의 toString()메소드 
		System.out.println(obj2.toString()); // Date의 toString()메소드

	}

}
