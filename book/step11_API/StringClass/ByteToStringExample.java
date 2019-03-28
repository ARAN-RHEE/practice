package step11_API.StringClass;

public class ByteToStringExample {
	//바이트 배열을 문자열로 변환 

	public static void main(String[] args) {
		//배열 선언
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		// String 생성자 오버라이딩 
		//배열 전체를 String 객체로 생성 
		String str1 = new String(bytes);
		System.out.println(str1);
		
		// 배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성 
		// 6번인덱스-J 부터 length-4 개 만큼 객체로 생성 
		String str2 = new String(bytes, 6, 4); //(byte배열, int offset, int length)
		System.out.println(str2);

	}

}
