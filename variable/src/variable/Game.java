package variable;

import java.util.Scanner;

import org.omg.IOP.Codec;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String name = null;
		String skip = null;
		int point1 = 30;
		int point2 = 10;
		int stat = 0;

//		-------����--------
		int Chp = 0;
		int Cmp = 0;
		int Catk = 0;
		int Cdef = 0;
		int Cspd = 0;
//		------------------

		int choice = 5;
		int num = 0000;
		
		info info1 = new info();
		for (;;) {

			for (;;) {
				System.out.println("����� �����͸� �ҷ����ڽ��ϱ�?");
				System.out.println("1.��          2.�ƴϿ�");
				choice = scan.nextInt();
				scan.nextLine();
				if (choice == 1) {
					break;
				} else if (choice == 2) {
					break;
				} else {
					System.out.println("�Է��� �ٸ��� �ʽ��ϴ�.\n �ٽ��Է����ּ���.");
					for (int c = 0; c < 20; c++) {
						System.out.println();
					}
				}
			}
			if (choice == 1) {
				System.out.println("ĳ������ ������ȣ�� �Է��� �ּ���. (����)");

			} else if (choice == 2) {
				System.out.print("�г����� �����ּ��� : ");
				name = scan.nextLine();
				num++;
			}

			System.out.println(name + "�� ���� ���忡 ���Ű��� ȯ���մϴ�.");

			for (;;) {
				System.out.println("���� hp�� mp�� �����ϰڽ��ϴ�. (�ѹ� ���� ������ �ʱ�ȭ�� �ȵǴ� �����Ͻʽÿ�.)");
				System.out.println(
						"hp : " + Chp + "          mp : " + Cmp + "                 (���� ����Ʈ : " + point1 + ")");
				System.out.println("1.HP ����              2.MP ����");
				choice = scan.nextInt();
				scan.nextLine();
				if (choice == 1) {
					for (;;) {
						System.out.println(
								"hp : " + Chp + "          mp : " + Cmp + "                 (���� ����Ʈ : " + point1 + ")");
						System.out.println("HP�� �ŭ ������Ű�ڽ��ϱ�?");
						System.out.print("�Է� : ");
						stat = scan.nextInt();
						scan.nextLine();
						point1 = point1 - stat;
						if (point1 < 0) {
							point1 = point1 + stat;
							System.out.println("�ܿ�����Ʈ�� �����մϴ�.\n �ٽ��Է����ּ���.");
						}else if (point1 >= 0) {
							Chp = info1.Char(choice, num, stat);
							break;
						}
					}
				} else if (choice == 2) {
					for (;;) {
						System.out.println(
								"hp : " + Chp + "          mp : " + Cmp + "                 (���� ����Ʈ : " + point1 + ")");
						System.out.println("MP�� �ŭ ������Ű�ڽ��ϱ�? ");
						System.out.print("�Է� : ");
						stat = scan.nextInt();
						scan.nextLine();
						point1 = point1 - stat;
						if (point1 < 0) {
							point1 = point1 + stat;
							System.out.println("�ܿ�����Ʈ�� �����մϴ�.\n �ٽ��Է����ּ���.");
						}else if (point1 >= 0) {
							Cmp = info1.Char(choice, num, stat);
							break;
						}
					}
				} else {
					System.out.println("�Է��� �ٸ��� �ʽ��ϴ�.\n �ٽ��Է����ּ���.");
					for (int c = 0; c < 20; c++) {
						System.out.println();
					}
				}

				if (point1 == 0) {
					break;
				}

			}
			
			System.out.println("HP : "+Chp+"  mp :" +Cmp+"�� �����ϼ̱���?\n Ź���Ͻ� �����Դϴ�...... �� �׷��� �̾ ���ݷ°� ���� ���ǵ带 ������ �����?");

			for(;;)
			{
				System.out.println("---------�ɷ�ġ---------");
				System.out.println("HP : "+Chp+"  mp : "+Cmp);
				System.out.println("���ݷ� : "+ Catk + "    ����  : " + Cdef + "\n���ǵ� : "+Cspd+ "    �ܿ� ����Ʈ : " + point2+"\n----------------------");
				
				System.out.print("1.���ݷ� \n2.����\n3.���ǵ� \n�Է�: ");
				choice = scan.nextInt();
				if((choice+2) == 3) 
				{
					for(;;)
					{
						System.out.println("---------�ɷ�ġ---------");
						System.out.println("HP : "+Chp+"  mp : "+Cmp);
						System.out.println("���ݷ� : "+ Catk + "    ����  : " + Cdef + "\n���ǵ� : "+Cspd+ "    �ܿ� ����Ʈ : " + point2+"\n----------------------");
						System.out.println("���ݷ��� ������ ���� �������ظ� �� �� �ֽ��ϴ�.\n���ݷ��� �� ������Ű�ڽ��ϱ�?");
						System.out.println("�Է�: ");
						stat = scan.nextInt();
						
						point2 = point2 -stat;
						
						if(point2 < 0)
						{
							point2 = point2 + stat;
							System.out.println();
						}else if(point2 >= 0)
						{
							Catk = info1.Char(choice+2, num, stat);
							break;
						}
						
					}
					
				}else if((choice+2) == 4)
				{
					for(;;)
					{
						System.out.println("---------�ɷ�ġ---------");
						System.out.println("HP : "+Chp+"  mp : "+Cmp);
						System.out.println("���ݷ� : "+ Catk + "    ����  : " + Cdef + "\n���ǵ� : "+Cspd+ "    �ܿ� ����Ʈ : " + point2+"\n----------------------");
						System.out.println("������ ������ �޴� ���ظ� �ݴϴ�.\n������ �� ������Ű�ڽ��ϱ�?");
						System.out.println("�Է�: ");
						stat = scan.nextInt();
						
						point2 = point2 -stat;
						
						if(point2 < 0)
						{
							point2 = point2 + stat;
							System.out.println();
						}else if(point2 >= 0)
						{
							Cdef = info1.Char(choice+2, num, stat);
							break;
						}
					}
					
				}else if((choice+2) == 5)
				{
					for(;;)
					{
						System.out.println("---------�ɷ�ġ---------");
						System.out.println("HP : "+Chp+"  mp : "+Cmp);
						System.out.println("���ݷ� : "+ Catk + "    ����  : " + Cdef + "\n���ǵ� : "+Cspd+ "    �ܿ� ����Ʈ : " + point2+"\n----------------------");
						System.out.println("���ǵ�� �������ݱǰ� ���߷� �� ȸ�ǿ� ������ �ֽ��ϴ�.\n���ǵ带 �� ������Ű�ڽ��ϱ�?");
						System.out.println("�Է�: ");
						stat = scan.nextInt();
						
						point2 = point2 -stat;
						
						if(point2 < 0)
						{
							point2 = point2 + stat;
							System.out.println();
						}else if(point2 >= 0)
						{
							Cspd = info1.Char(choice+2, num, stat);
							break;
						}
					}
				}else
				{
					for (int c = 0; c < 20; c++) {
						System.out.println();
					}
					
					System.out.println("�Է��� �ٸ��� �ʽ��ϴ�.");
					
				}
				
				if(point2 == 0)
				{
					break;
				}
			}
			System.out.println("��� ������ ������ �������ϴ�. \n�׷� ���谡��  ��ſ� ���� �ǽñ� �ٶ��ϴ�. ");

			
			for(;;)
			{
				System.out.println("����������������������������������������������������������������������������");
				System.out.println("�� �г��� : "+name+"                       ��");
//				System.out.println("�� ���� : "+Clv+"                         ��");
			}
		}
	}

}
