package step11_API.StringClass;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";		
		
		System.out.println(str1.equals(str2)); //대소문자가 다르면 문자열이 다른 것 
		
		String lowerStr1 = str1.toLowerCase(); 
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // 대소문자를 통일해서 비교할 경우는 문자열이 같으므로 true 리턴 
		
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자를 맞출 필요 없이 문자열먄 비교 				
	}



}
