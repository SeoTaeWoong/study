package test;

class AA {
	public int a = 3;

	public void disp() {
		a += 5;
		System.out.println("AA: " + a + " ");
	}
}
//---
class BB extends AA {
	public int a = 8;

	public void disp() {
		a += 5;
		System.out.println("BB: " + a + " ");
	}
}
//---
public class TestB {

	public static void main(String[] args) {
		Test t = new Test(); //�ڽ� = �ڽ�
		t.disp(); //t�� �ڽ�Ŭ���������� �θ�Ŭ������ �����ڵ� �Բ� ȣ���Ѵ�.
		System.out.println(t.a); //6
		
		Test1 t1 = new Test(); //�θ� = �ڽ�
		t1.disp(); // 6,9 69 ���
		System.out.println(t1.toString()); //2
		
//		t1 = new Test1(); //�θ� = �θ�
//		t1.disp(); // 3 4 34
//		System.out.println(t1.a); //3
		
		
		t = (Test)t1; // �ڽ� = (�ڽ�)�θ�  �ٿ�ĳ����
		t.disp(); //7 10 710
		System.out.println(t.toString()); // 7
		
	}
//	public static void main(String[] args) {
//		BB bb = new BB();
//		bb.disp();
//		System.out.println(bb.a+" ");
//		System.out.println();
//		
//		AA aa = new BB();
//		aa.disp();
//		System.out.println(aa.a+" ");
//		
//		BB bb2 = (BB)aa;
//		System.out.println(bb2.a+" ");
//		/*AA a = new AA();
//		*/
//	}

	
}
