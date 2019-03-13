package step03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		/*  ++(--) 피연산자 : 다른 연산을 수행하기 전에 피연산자의 값을 1 증가(감소)시킴 
		 *  피연산자 ++(--) : 다른 연산을 수행한 후에 피연산자의 값을 1 증가(감소) 시킴 
		 * */
		System.out.println("-----------------------");
		x++;
		++x;
		System.out.println("x=" + x);	// 10+1+1	

		System.out.println("-----------------------");		
		y--;
		--y;
		System.out.println("y=" + y);	 // 10-1-1	

		System.out.println("-----------------------");		
		z = x++; // 다른 연산을 수행한 후에 피연산자의 값이 증가하므로, z=x , 그 이후 x는 1 증가 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");		
		z = ++x;  //다른 연산을 수행하기 전에 피연산자 1 증가. 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");				
		z = ++x + y++;  // 따라서 x는 1 먼저 증가한 15가 저장되고, y는 증감연산 값인 8이 저장된 상태에서 z값 23이 계산됨.
		// 연산이 끝난 후 y에 1 더함. 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);

	}

}
