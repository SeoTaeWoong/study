
public class Human {

	//�������
	int age;
	String name;
	
	//�޼���
	public void greeting() {

		System.out.println("�ȴ�~~");
	}
	
	
	//������
	Human() {
		age = 20;
		name = "ȫ�浿";
	}
	
	Human(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
}
