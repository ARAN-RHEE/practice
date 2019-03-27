package step06_Class.Constructor;

import java.util.Scanner;

public class Box3 {
	//필드 선언 
	int width;
	int length;
	int depth;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Box3 a = new Box3();
		Box3 b = new Box3();
	
		
		//상자의 속성 입력하기 
	    System.out.println("a.width : ");
		a.width = scanner.nextInt();
		System.out.println("a.length : ");
		a.length = scanner.nextInt();
		System.out.println("a.depth : ");
		a.depth = scanner.nextInt();
		System.out.println("b.width : ");
		b.width = scanner.nextInt();
		System.out.println("b.length : ");
		b.length = scanner.nextInt();
		System.out.println("b.depth : ");
		b.depth = scanner.nextInt();
		a.isSameBox(a,b);  // 상자의 부피 비교하는 메소드 호출 
	}
	
	// 상자의 부피가 같은지 비교하는 메소드 
	public boolean isSameBox(Box3 a, Box3 b) {
		int volumeA = a.width*a.length*a.depth;
		int volumeB = b.width*b.length*b.depth;
		
		if(volumeA==volumeB) {
			System.out.println(volumeA);
			System.out.println("true");
			return true;
		} else {
			System.out.println(volumeA);
			System.out.println(volumeB);
			System.out.println("false");
			return false;
		}
	}
}
