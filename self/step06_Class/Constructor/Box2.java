package step06_Class.Constructor;

public class Box2 {
	//필드 선언
	int width;
	int length;
	int height;
	int volume;
	
	// 파라미터를 갖는 생성자 선언. 박스의 속성
	Box2(int width, int length, int height){
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public int getVolume() {  // 부피 구하는 메소드 
		int result = width * length * height;
		System.out.println("박스의 부피는 " + result + "cm3");
		return result;
	}
}
