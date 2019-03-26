package step09.localClass;

public class Outter {
	//java 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100; // 파라미터 arg는 fianl 이기 떄문에 변경 불가 
		//localVariable = 100;    // 필드 localVaribale은 final이기 때문에 변경 불가 
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 이후
	public void method2(int arg) {  //파라미터에 final 키워드가 붙지는 않았지만 final의 특성을 가지고 있음 
		int localVariable = 1; // 로컬 변수 localVariable 역시 fianl 키워드가 붙지는 않았지만 final의 특성을 가지고 있음 
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
