package step06;

public class FieldIntValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		//FieldInitValue 객체에서 초기값을 따로 주지 않았음. 따라서 출력하는 값은 기본값 
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField :" + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : " + fiv.longField);
		System.out.println("booleanField : " + fiv.booleanField);
		System.out.println("charField : " + fiv.charField);
		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		System.out.println("arrField : " + fiv.arrField);
		System.out.println("referenceField : " + fiv.referenceField);
	}
}
