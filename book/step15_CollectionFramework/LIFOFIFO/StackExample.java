package step15_CollectionFramework.LIFOFIFO;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>(); //Stack 객체 생성
		
		// 동전 끼우기. 100-50-100-10 의 순서로 끼워줌 
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		
		//동전박스가 비어있는지 확인 
		while(!coinBox.isEmpty()) { // 박스가 비어있지 않다면 
			Coin coin = coinBox.pop(); // 제일 위의 동전 하나씩 꺼내기 
			System.out.println("꺼내온 동전 : " + coin.getValue()+"원");
			//LIFO는 push의 반대 순서로 pop됨 
			//가장 마지막에 넣은 객체가 가장 먼저 나옴 
		}

	}

}
