package test.mypac;

public class Car {
	// 일반 멤버 필드 정의하기 (static 없음!!)
		//public =>접근지정자 
		//name 이라는 이름의 field 가 어디서든(다른 package..) 보이게 하겠다!
		//이거 정의해야 MainClass01 에서 car. 했을 때 name 뜸!
	public String name= "아우디";
	
	// 일반 멤버 메소드 정의하기
		//void => 이 메소드를 호출한 그 위치로 어떤 값도 넘겨주지 않겠다.
	public void drive() {
		System.out.println("달려라~~~");
	}
	
	// 일반 멤버 메소드 정의하기
		//어떤 객체 안에서 자기 자신의 필드 가리키는 경우
	public void showInfo() {
		// 지역변수, 가까운 애로 적용됨! (아래 name 있으면 아래아래의 this.name => 흰둥이)
		//String name= "흰둥이";
		
		//System.out.println("차의 이름 :" + name);   //this. 생략 가능
		System.out.println("차의 이름 : " + this.name);  //this.name => 아우디
	}
}
