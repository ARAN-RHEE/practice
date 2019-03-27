package step11_API.System.Gc;

public class GcExample {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1); // 객체는 쓰레기가 됨 
		emp = null;
		emp = new Employee(2);  // 객체는 쓰레기가 됨. 변수가 아래 객체를 참조하기 때문 
		emp = new Employee(3); 
		
		System.out.print("emp가 최종적으로 참조하는 사원번호");
		System.out.println(emp.eno);
		System.gc();

	}

}


	class Employee {
		public int eno;
		public Employee(int eno) {
			this.eno = eno;
			System.out.println("Employee("+eno+")가 메모리에 생성됨");
		}
		
	public void finalize() { // 소멸자. gc()가 호출될때 반드시 실행됨 
		System.out.println("Employee("+eno+")이 메모리에서 제거됨");
	}
	}
