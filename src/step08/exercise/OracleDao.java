package step08.exercise;

public class OracleDao implements DataAccessObject{ //인터페이스에 있던 추상메소드들을 오버라이딩
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
	}
	public void update() {
		System.out.println("Oracle DB에서 수정");
	}
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}

}
