package step02;

public class GarbageValueExample {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {  //i가 0부터 4까지, 총 5회 실행되는 반복문(for)
			var1++; // 1회 실행될 때마다 var1이 1씩 증가 
			var2++; // 1회 실행될 때마다 var2이 1씩 증가 
		System.out.println("var1: " + var1 + "\t" + "var2: " + var2);	//문자열 + var1값 + 띄어쓰기 + 문자열 + var2
		
		}
	}
  /*byte의 경우 최대값이 127이기 때문에, 127을 넘어갈 경우 -128부터 다시 시작하게 된다. 다른 정수 타입도 마찬가지로 최대값을 
 넘어설 경우 이와 같은 방식으로 처리된다. */
}
