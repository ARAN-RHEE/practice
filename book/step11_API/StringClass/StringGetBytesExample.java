package step11_API.StringClass;

import java.io.UnsupportedEncodingException;

	public class StringGetBytesExample {
		public static void main(String[] args) {
			String str = "안녕하세요";
			
			byte[] bytes1 = str.getBytes(); // 문자열을 기본 문자셋의 바이트배열로 변환 
			System.out.println("bytes1.length: " + bytes1.length);
			String str1 = new String(bytes1); // 바이트 -> string으로 디코딩 
			System.out.println("bytes1->String: " + str1);
			
			try {
				
				byte[] bytes2 = str.getBytes("EUC-KR"); // 문자열을 EUC-KR의 바이트배열로 변환 
				System.out.println("bytes2.length: " + bytes2.length);
				String str2 = new String(bytes2, "EUC-KR"); // 바이트 -> string으로 디코딩 
				System.out.println("bytes2->String: " + str2);
				
				
				byte[] bytes3 = str.getBytes("UTF-8"); // 문자열을 UTF-8의 바이트배열로 변환 
				System.out.println("bytes3.length: " + bytes3.length); 
				String str3 = new String(bytes3, "UTF-8");
				System.out.println("bytes3->String: " + str3); // 바이트 -> string으로 디코딩 
				
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
	}

