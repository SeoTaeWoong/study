package variable;

public class test2 {

	public static void main(String[] args) {

		/////////////////////////
		int choice = 1; // ������(1~4)
		/////////////////////////
		System.out.println("���� Ȧ�� ������ �ϰ��ִ�.");

		if (choice == 1) {
			System.out.println("���� ���̴� 15���̴�. \n������ �θ�԰� ���� �ο��� ������");

			//////////////////////////
			choice = 1; // ������(1~4)
			/////////////////////////

			if (choice == 1) {
				System.out.println("���� ������ ��°������� ���� ������ ��������. \n ��.. ���� ���� �����ϳ�..");

				/////////////////////////
				choice = 3; // ������ (1~3)
				/////////////////////////
				
				if (choice == 1) {

					System.out.println("�ǹ̾��� �޴����� �鿩�ٺ��� �ȴ�...");

				} else if (choice == 2) {
					System.out.println("���������� ������ ������ȭ�� ������ �־��.  \n \'����\'");

				} else if (choice == 3) {
					System.out.println("\'������\' \n������ �����ͼ� �������ư��⿣ �ʹ� �ָ��͹��ȴ�.");
				}
			} else if (choice == 2) {
				System.out.println("������ �ڲٸ� �����̿´�.. ");

			} else if (choice == 3) {
				System.out.println("��Ƶ� ���� �� ����������... �ֱٿ��� ��ó �Ż翡 �������� ������ ���ĸԴ����̴�.");

			} else if (choice == 4) {
				System.out.println("���� �㿡 ���۰��Կ��� ������ ��ġ�ٰ� �������� �������ȴ�.");

			}

		} else if (choice == 2) {
			System.out.println("���� ���̴� 21���̴�. \n���뿡 ������ �߹��� �������� ������ �ϰ��ִ�.");

		} else if (choice == 3) {
			System.out.println("���� ���̴� 59��.. \n�� ������ �ʾҴµ� �����°� ���� ���� ���⿡ ����� �����̴�.");

		} else if (choice == 4) {
			System.out.println("���ؼ� ������ ������ �ƴϾ���. \n�׷���ǿ� �ָ��� ���� ������ ������ �ǹ� ���ؿ� ������ȴ�.");

		}
	}
}
