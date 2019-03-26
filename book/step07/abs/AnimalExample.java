package step07.abs;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();  // 일반적인 방식으로 Dog와 Cat 객체 생성해서 메소드 호출 
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();  // Animal 변수로 타입 변환. 자식-> 부모로 자동 타입 변환 
		animal.sound(); // 자식이 부모로 재정의되었으나 메소드가 자식클래스에서 오버라이딩 되었기 때문에 자식 클래스의 메소드가 실행됨 
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		//메소드의 다형성
		animalSound(new Dog());  //부모 타입의 파라미터에 자식 객체를 대입 
		animalSound(new Cat());// animal = new Dog()와 같기 때문에 자식->부모로 자동 타입 변환. 두번째와 같은 원리 
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
