package step14.Lambda.API.FunctionInterface;

public class Student {
	//필드 선언. private 접근제한자 사용해 외부에서 필드에 바로 접근할 수 없음 
	private String name;
	private int englishScore;
	private int mathScore;
	
	// 파라미터를 3개 갖는 생성자 선언 
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		
	}
	
	// 필드값 읽어오는 getter 메소드 선언 
	public String getName() {
		return name;
	}
	
	public int getEnglishScore() {
		return englishScore;
	}
	
	public int getMathScore() {
		return mathScore;
		
	}
}
