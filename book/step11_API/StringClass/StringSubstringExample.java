package step11_API.StringClass;

public class StringSubstringExample {
	public static void main(String[] args) {	
		String ssn = "880815-1234567 ";
		
		String firstNum = ssn.substring(0, 6); //0번 인덱스부터 6번 인덱스 전까지. 즉 0번~5번인덱스까지 추출 
		System.out.println(firstNum);		
		
		String secondNum = ssn.substring(7); // 7번인덱스부터 끝까지 추출 
		System.out.println(secondNum);
	} 
}

