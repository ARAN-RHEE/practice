package step11_API.Exercise;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index= str.indexOf("자바"); // 문자열을 변경하기 전에 변경할 문자열이 포함되어 있는지 체크하기 
		if(index == -1) { //  -1을 리턴하면 문자열 미포함 
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		} else { // 그 이외는 문자열을 포함하고 있음 
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str=str.replace("자바", "Java");  // "자바" 문자열을 "Java" 문자열로 변경하는 메소드 호출 
			System.out.println("ㅡ>"+str);
		}
	

	}

}
