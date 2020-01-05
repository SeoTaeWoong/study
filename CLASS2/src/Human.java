
public class Human {

	//¸â¹öº¯¼ö
	int age;
	String name;
	
	//¸Þ¼­µå
	public void greeting() {

		System.out.println("¾È´¨~~");
	}
	
	
	//»ý¼ºÀÚ
	Human() {
		age = 20;
		name = "È«±æµ¿";
	}
	
	Human(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
}
