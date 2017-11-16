package test.main;

import test.mypac.Car;
import test.mypac.White;

/*
 * 	[ 클래스의 역할 ]
 * 
 *  1. static 멤버를 포함하고 있는 역할
 *  2. 객체의 설계도 역할
 *  3. Data Type 역할
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
			//클래스명이 Data Type 역할을 할 수 있다!
		
		// Car Type 객체의 참조값을 담을 (빈;null) 지역변수 만들기
			//Car + ctrl + space => test.mypac 엔터
			//=> import 위에 자동완성 됨!
		Car car1= null;
		// Car 객체를 생성하고 참조값을 변수에 대입하기
			//new => Heap 영역에 Car type 의 객체가 만들어짐
		car1= new Car();
		
		//참조되는 것(name) 의 type 이 string('소나타') 이니까 String 으로 정의
		String a= car1.name;  
		System.out.println(a);
		// 객체의 메소드 호출
		car1.drive();
		
		// White Type 객체의 참조값을 담을 지역변수 만들기 (**대문자로 시작!!)
		White white1= null;
		// White 객체를 생성하고 참조값을 변수에 대입하기
		white1= new White();
		
		//지희 example
		int b= white1.number;
		System.out.println(b);
		
		String c= white1.name;
		System.out.println(c);
		
		float d= white1.number2;
		System.out.println(d);
	}
}
