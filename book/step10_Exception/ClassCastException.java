package step10_Exception;

public class ClassCastException {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		///animal타입 변수에 대입된 객체가 Dog이므로 다시 Dog 타입으로 변환하는 것은 문제가없음 
		// 대입된 객체가 아닌 다른 클래스 타입으로 변환하는 경우는 ClassCastException 발생 

	}

	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog){ // 타입 변환 가능한지 instanceof 연산자로 확인하기 
		Dog dog = (Dog) animal; //ClassCastException 발생 가능. 
		//}
	}
}

	class Animal { }
	class Dog extends Animal{ }
	class Cat extends Animal{ }
