package test;

class Test1{ // �θ� Ŭ����
	protected int a=2;
	protected int b=3;
	public void disp() {
		a++;
		b++;
		System.out.println("a:"+a+"  b:"+b+"  a+b:"+a+b);
	}
	public Test1() {
		System.out.println("�� �θ�Ŭ���� Test1");
	}
	
	
	
}
//��� ���� . .  �θ�Ŭ������ �⺻ ������ ����� �ڽ�Ŭ������ �⺻������ ��� �ڽ�Ŭ������ disp ��� 
//��� ���� . .  �θ�Ŭ���� �⺻������ ��� �� �ڽ�Ŭ������ �⺻������ ��� �ڽ��� Ŭ������ �ִ� disp�� ��������� a�� ���� �ڽ��� a�� ����Ѵ�. 

public class Test extends Test1{ //�ڽ�Ŭ����
	protected int a=5;
	protected int b=8;
	
	public Test() {
		System.out.println("�� �ڽ�Ŭ���� Test");
	}
	public void disp() {
		a++;
		b++;
		
		System.out.println("a:"+a+"  b:"+b+"  a+b:"+a+b);
	}
	
}
