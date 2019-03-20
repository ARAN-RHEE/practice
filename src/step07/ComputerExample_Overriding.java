package step07;

public class ComputerExample_Overriding {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator_Overriding calculator = new Calculator_Overriding(); //Calculator 메소드 사용하기 위해 객체 생성 
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer_Overriding computer = new Computer_Overriding(); //Computer 메소드 사용하기 위해 객체 생성 
		System.out.println("원면적 : " + computer.areaCircle(r) ); // 좀 더 정밀한 계산 출력 
		// 메소드 명은 같지만 오버라이딩 했기 때문에 결과가 다르게 나옴 

	}

}
