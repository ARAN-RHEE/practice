package step10_Exception;

public class Score {
	// 필드에 과목명, 점수 선언 
	private String subject;
	private int score;
	
	 Score(String subject, int score) {
		this.subject = subject;
		this.score = score;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
