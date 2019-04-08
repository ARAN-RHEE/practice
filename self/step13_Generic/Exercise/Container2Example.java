package step13_Generic.Exercise;

public class Container2Example {
	public static void main(String[] args) {
		//Container 제네릭 타입 선언하기 
		Container2<String,String> container1 = new Container2<String,String>(); //타입 파라미터 2개 
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container2<String,Integer> container2 = new Container2<String, Integer>();
		container2.set("홍길동",35);
		String name2= container2.getKey();
		int age = container2.getValue();
	}
}
