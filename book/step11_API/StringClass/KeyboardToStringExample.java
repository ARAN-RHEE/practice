package step11_API.StringClass;

import java.io.IOException;

public class KeyboardToStringExample {
	//바이트 배열을 문자열로 전환 

	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];  // 읽은 바이트를 저장하기 위한 배열 생성
		
		
		System.out.println("입력 : "); 
		int readByteNo = System.in.read(bytes); // 배열에 읽은 바이트를 저장하고, 읽은 바이트 수를 리턴 
		
		String str = new String(bytes, 0, readByteNo-2); // 배열을 문자열로 변환
		// 배열 길이에서 2를 빼준 이유는 캐리지리턴과 라인피드도 배열에 마지막에 들어가는데 그부분은 문자열로 만들 필요가 없기 때문 
		//캐리지 리턴은 현재 위치를 나타내는 커서를 맨 앞으로 이동시킨다는 뜻
		//라인 피드는 커서의 위치를 아랫줄로 이동시킨다는 뜻
		System.out.println(str);

	}

}
