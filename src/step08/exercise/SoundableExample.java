package step08.exercise;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());  //sound 메소드의 리턴값을 출력하는 printSound 메소드 
	}
	
	public static void main(String[] args) {  
		printSound(new Cat());  // printSound의 파라미터는 Soundable 인터페이스 타입. Cat과 Dog는 인터페이스를 이용하므로 객체 대입 가능 
		printSound(new Dog());
	}

}
