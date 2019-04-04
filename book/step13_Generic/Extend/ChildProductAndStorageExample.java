package step13_Generic.Extend;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		// 자식 클래스 객체 생성 
		ChildProduct<Tv,String, String> product = new ChildProduct<>();
		product.setKind(new Tv()); // setter 메소드로 kind필드에 Tv객체를 생성해서 넣어줌 
		product.setModel("SmartTV");
		product.setCompany("SamSung");
		
		// 인터페이스 객체를 인터페이스 구현 클래스 타입으로 생성 
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0); // 오버라이딩 한 add메소드 호출. 0번 인덱스에 new Tv()객체 넣어줌 
		Tv tv = storage.get(0); // Tv타입 객체에 0번 인덱스를 참조시킴 

	}

}
