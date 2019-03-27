package step06_Class.Constructor;
public class Box {
	//Box 클래스를 정의하고, 객체를 하나 생성해서 객체 안의 가로 세로 높이를 설정하기
	//int width=20;
	//int height=20;   생성자에서 초기값 주는 방법 
	//int depth=30;
	int width;
	int height;
	int depth;
	
	public static void main(String[] args) {
		Box box = new Box();
	
		
		box.width = 20;    // 객체를 생성하고 생성자를 호출해 생성자에 값 넣어주는 방법 
		box.height = 20;
		box.depth = 30;

		
		System.out.println(box.width+" "+box.height+" "+box.depth);
		
	}
	
}
