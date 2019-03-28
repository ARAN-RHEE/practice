package step11_API.StringClass;

public class StringValueOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = String.valueOf(10);  // int 10 -> String "10"
		String str2 = String.valueOf(10.5); // double 10.5 -> String "10.5"
		String str3 = String.valueOf(true);	// boolean true -> String "true"	
		
		
		// 문자열로 변환된 값 출력하기 
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
