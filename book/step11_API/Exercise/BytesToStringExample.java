package step11_API.Exercise;

public class BytesToStringExample {
	// 바이트 -> 문자열로 변환하기 

	public static void main(String[] args) {
		byte[] bytes = {78,32,108,111,118,101,32,121,111,117};
		// 기본 문자셋으로 디코딩하려면 파라미터에 배열만 넣어주면 됨. 다른 타입은 두번째 파라미터로 charSet 이름을 적어주면 됨 
		String str =new String(bytes) ;
		System.out.println(str);

	}

}
