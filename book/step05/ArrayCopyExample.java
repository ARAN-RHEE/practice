package step05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray = { "java", "array", "copy" };  //String배열 생성 후 값 넣어줌.
		String[] newStrArray = new String[5];  //크기가 5인 String배열 생성 
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//System.arraycopy() 메소드는 배열을 복사할 수 있음. 
		//System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		//src = 원본 배열. srcPos = 원본 배열에서 복사할 항목의 시작 인덱스.
		//dest = 새 배열. destPos = 새 배열에서 붙여넣을 시작 인덱스.length = 복사할 갯수. 
		
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", "); // 3번 인덱스와 4번 인덱스에는 String타입 배열의 초기값 null이 들어감.
		}
	}
}
