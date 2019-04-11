package step14_Lambda.TargetType;

@FunctionalInterface  // 있어도 되고 없어도 되지만, 사용하면 실수로 2개 이상의 메소드 선언하는것을 방지하기 좋음 
public interface MyFunctionalInterface {
	public void method(); // 매개변수와 리턴값이 없음 
	// 사용할 때 MyFunctionalInterface fi = () -> {실행문;} 의 형태로 작성 
}
