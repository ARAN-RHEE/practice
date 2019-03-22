package step09.Anony_Local;
 // 익명 객체의 로컬 변수 사용 
public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
	//	매개변수와 로컬변수는 final 특성을 가지므로 값을 변경할 수 없음. 
		//arg1 = 20;
		//arg2 = 20;
		
		//var1 = 30;
		//var2 = 30;
		
		Calculatable calc = new Calculatable() {
			@Override // 인터페이스 내 메소드 재정의 
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
		
	}
}
