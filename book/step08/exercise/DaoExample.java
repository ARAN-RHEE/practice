package step08.exercise;

public class DaoExample {  // DataAccessObject 인터페이스, OracleDao, MySqlDao 클래스 구현하기. 
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());  // dbWork 메소드는 인터페이스 DataAccessObject 타입 파라미터가 필요함.
		dbWork(new MySqlDao()); // OracleDao와 MySqlDao는 D-A-O 인터페이스를 이용하므로 자동으로 타입 변환됨 

	}

}
