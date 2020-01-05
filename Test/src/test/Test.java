package test;

class Test1{ // 부모 클래스
	protected int a=2;
	protected int b=3;
	public void disp() {
		a++;
		b++;
		System.out.println("a:"+a+"  b:"+b+"  a+b:"+a+b);
	}
	public Test1() {
		System.out.println("난 부모클래스 Test1");
	}
	
	
	
}
//출력 내용 . .  부모클래스의 기본 생성자 출력후 자식클래스의 기본생성자 출력 자식클래스의 disp 출력 
//출력 내용 . .  부모클래스 기본생성자 출력 후 자식클래스의 기본생성자 출력 자신의 클래스에 있는 disp를 출력하지만 a를 찍어보면 자식의 a를 출력한다. 

public class Test extends Test1{ //자식클래스
	protected int a=5;
	protected int b=8;
	
	public Test() {
		System.out.println("난 자식클래스 Test");
	}
	public void disp() {
		a++;
		b++;
		
		System.out.println("a:"+a+"  b:"+b+"  a+b:"+a+b);
	}
	
}
