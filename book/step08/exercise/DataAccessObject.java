package step08.exercise;

public interface DataAccessObject {  //인터페이스에는 메소드 명 기입해주기 
	public void select();
	public void insert();
	public void update();
	public void delete();
}
