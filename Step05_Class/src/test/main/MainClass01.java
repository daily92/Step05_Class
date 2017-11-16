package test.main;

import test.mypac.Car;
import test.mypac.White;

/*
 * 	[ Ŭ������ ���� ]
 * 
 *  1. static ����� �����ϰ� �ִ� ����
 *  2. ��ü�� ���赵 ����
 *  3. Data Type ����
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
			//Ŭ�������� Data Type ������ �� �� �ִ�!
		
		// Car Type ��ü�� �������� ���� (��;null) �������� �����
			//Car + ctrl + space => test.mypac ����
			//=> import ���� �ڵ��ϼ� ��!
		Car car1= null;
		// Car ��ü�� �����ϰ� �������� ������ �����ϱ�
			//new => Heap ������ Car type �� ��ü�� �������
		car1= new Car();
		
		//�����Ǵ� ��(name) �� type �� string('�ҳ�Ÿ') �̴ϱ� String ���� ����
		String a= car1.name;  
		System.out.println(a);
		// ��ü�� �޼ҵ� ȣ��
		car1.drive();
		
		// White Type ��ü�� �������� ���� �������� ����� (**�빮�ڷ� ����!!)
		White white1= null;
		// White ��ü�� �����ϰ� �������� ������ �����ϱ�
		white1= new White();
		
		//���� example
		int b= white1.number;
		System.out.println(b);
		
		String c= white1.name;
		System.out.println(c);
		
		float d= white1.number2;
		System.out.println(d);
	}
}
