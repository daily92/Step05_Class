package test.mypac;

public class Car {
	// �Ϲ� ��� �ʵ� �����ϱ� (static ����!!)
		//public =>���������� 
		//name �̶�� �̸��� field �� ��𼭵�(�ٸ� package..) ���̰� �ϰڴ�!
		//�̰� �����ؾ� MainClass01 ���� car. ���� �� name ��!
	public String name= "�ƿ��";
	
	// �Ϲ� ��� �޼ҵ� �����ϱ�
		//void => �� �޼ҵ带 ȣ���� �� ��ġ�� � ���� �Ѱ����� �ʰڴ�.
	public void drive() {
		System.out.println("�޷���~~~");
	}
	
	// �Ϲ� ��� �޼ҵ� �����ϱ�
		//� ��ü �ȿ��� �ڱ� �ڽ��� �ʵ� ����Ű�� ���
	public void showInfo() {
		// ��������, ����� �ַ� �����! (�Ʒ� name ������ �Ʒ��Ʒ��� this.name => �����)
		//String name= "�����";
		
		//System.out.println("���� �̸� :" + name);   //this. ���� ����
		System.out.println("���� �̸� : " + this.name);  //this.name => �ƿ��
	}
}
