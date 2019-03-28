package step11_API.StringTokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = text.split("&|,|-"); // | 기호는 or를 뜻함. 주어진 기호들을 구분자로 해서 문자열을 추출 
		
		for(int i=0; i<names.length;i++) { //추출한 문자열들이 담긴 배열을 출력 
			System.out.println(names[i]);
		}
		
		for(String name : names) {
			System.out.println(name);
		
		}
	}

}
