package step14.Lambda.TargetType;

@FunctionalInterface  // 있어도 되고 없어도 되지만, 사용하면 실수로 2개 이상의 메소드 선언하는것을 방지하기 좋음 
public interface MyFunctionalInterface2 {
	public void method(int x);  // 매개 변수가 있는 람다식 
	// 사용할 때 MyFunctionalInterface2 fi = (x) -> {실행문;} 의 형태로 작성 
}
