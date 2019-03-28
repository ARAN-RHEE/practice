package step11_API.StringClass;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject ="자바 프로그래밍";  // String 타입의 subject 변수에 "자바 프로그래밍"문자열을 참조시킴 
		
		int location = subject.indexOf("프로그래밍");  // subject에서 "프로그래밍"이 위치한 인덱스 리턴. 프로그래밍은 4번째부터 시작하므로 
		System.out.println(location);  // 인덱스넘버 3 리턴 
		
		if(subject.indexOf("자바") != -1) {  //매개값이 문자열에 존재하지 않으면 -1 리턴 
			System.out.println("자바와 관련된 책이군요");  // -1이 아닐떄. 즉 자바 단어가 포함되어 있을때 
		} else {
			System.out.println("자바와 관련 없는 책이군요");  // 자바 문자열이 존재하지 않을때 
		}

	}

}
