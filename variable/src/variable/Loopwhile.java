package variable;

import java.util.Scanner;;

public class Loopwhile {
	public static void main(String[] arg)
	{
		Scanner st =  new Scanner(System.in);
		
		System.out.print("���ϴ� ũ���� �ﰢ���� ����� �ֽ��ϴ�.\n��ĭ�� ����Ͽ� �ﰢ���� ����ðڽ��ϱ�? : ");
		int value = st.nextInt();
		int variable = 1;
		int a = 0;
		while(a<value)
		{
			int b = 1;
			while(b<value-a) {
				
				System.out.print("    ");
				b++;
			}
			int c = 0;
			while(c < (a+variable)) {
			System.out.print("��");
			c++;
			}
			variable++;
			a++;
			System.out.println();
		}
	}
}
