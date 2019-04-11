package step14_Lambda.LocalVariable;

public class UsingLocalVariableExample {
	public static void main(String[] args) {
		UsingLocalVariable ulv = new UsingLocalVariable();
		ulv.method(20);
		// localVar은 final특성을 가졌으므로 값 변경 불가. 
		// 읽는 것은 허용됨 
	}
}
