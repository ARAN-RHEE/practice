package step06;

public class Calculator4 {
	
	
	static double pi = 3.14159;  //파이 값은 동일하므로 고정값 - static 선언을 해줌 
	
	static int plus(int x, int y) {  //알고리즘 자체는 변화하지 않으므로 static선언. 매개변수만 바꿔주면 계산됨 
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
}
