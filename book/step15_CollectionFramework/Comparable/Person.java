package step15_CollectionFramework.Comparable;

public class Person implements Comparable<Person>{
	//person 객체를 오름차순 정렬하기 위해 Comparable 인터페이스를 구현 
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	@Override //인터페이스 구현하려면 compareTo메소드를 오버라이딩해야함 
	public int compareTo(Person o) { // 나이를 비교했을때 나이가 적을 경우는 -1, 같으면 0, 더 많으면 1 리턴하게 오버라이딩 
		if(age<o.age) return -1;
		else if(age==o.age) return 0;
		else return 1;
	}
}
