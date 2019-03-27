package step11_API.DeepClone;

public class MemberExample {

	public static void main(String[] args) {
		//원본 객체 생성
		Member original = new Member("홍길동", 25, new int[] {90,90}, new Car("소나타"));
		
		//복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member cloned = original.getMember();
		cloned.scores[0]=100;
		cloned.car.model = "그랜져";
		
		System.out.println("복제 객체의 필드값");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car : " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("원본 객체의 필드값");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");  // 배열 마지막 값 뒤에는 , 오지 않게 함 
		}
		System.out.println("}");
		System.out.println("car : " + original.car.model);
		
		// 깊은 복제 후 복제본 변경은 원본에 영향을 미치지 않음 
	}

}
