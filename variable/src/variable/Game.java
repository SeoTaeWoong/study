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

//		-------스텟--------
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
				System.out.println("저장된 데이터를 불러오겠습니까?");
				System.out.println("1.네          2.아니오");
				choice = scan.nextInt();
				scan.nextLine();
				if (choice == 1) {
					break;
				} else if (choice == 2) {
					break;
				} else {
					System.out.println("입력이 바르지 않습니다.\n 다시입력해주세요.");
					for (int c = 0; c < 20; c++) {
						System.out.println();
					}
				}
			}
			if (choice == 1) {
				System.out.println("캐릭터의 고유번호를 입력해 주세요. (숫자)");

			} else if (choice == 2) {
				System.out.print("닉네임을 정해주세요 : ");
				name = scan.nextLine();
				num++;
			}

			System.out.println(name + "님 몬스터 월드에 오신것을 환영합니다.");

			for (;;) {
				System.out.println("먼저 hp와 mp를 설정하겠습니다. (한번 정한 스텟은 초기화가 안되니 주의하십시오.)");
				System.out.println(
						"hp : " + Chp + "          mp : " + Cmp + "                 (보유 포인트 : " + point1 + ")");
				System.out.println("1.HP 증가              2.MP 증가");
				choice = scan.nextInt();
				scan.nextLine();
				if (choice == 1) {
					for (;;) {
						System.out.println(
								"hp : " + Chp + "          mp : " + Cmp + "                 (보유 포인트 : " + point1 + ")");
						System.out.println("HP를 몇만큼 증가시키겠습니까?");
						System.out.print("입력 : ");
						stat = scan.nextInt();
						scan.nextLine();
						point1 = point1 - stat;
						if (point1 < 0) {
							point1 = point1 + stat;
							System.out.println("잔여포인트가 부족합니다.\n 다시입력해주세요.");
						}else if (point1 >= 0) {
							Chp = info1.Char(choice, num, stat);
							break;
						}
					}
				} else if (choice == 2) {
					for (;;) {
						System.out.println(
								"hp : " + Chp + "          mp : " + Cmp + "                 (보유 포인트 : " + point1 + ")");
						System.out.println("MP를 몇만큼 증가시키겠습니까? ");
						System.out.print("입력 : ");
						stat = scan.nextInt();
						scan.nextLine();
						point1 = point1 - stat;
						if (point1 < 0) {
							point1 = point1 + stat;
							System.out.println("잔여포인트가 부족합니다.\n 다시입력해주세요.");
						}else if (point1 >= 0) {
							Cmp = info1.Char(choice, num, stat);
							break;
						}
					}
				} else {
					System.out.println("입력이 바르지 않습니다.\n 다시입력해주세요.");
					for (int c = 0; c < 20; c++) {
						System.out.println();
					}
				}

				if (point1 == 0) {
					break;
				}

			}
			
			System.out.println("HP : "+Chp+"  mp :" +Cmp+"를 선택하셨군요?\n 탁월하신 선택입니다...... 자 그러면 이어서 공격력과 방어력 스피드를 설정해 볼까요?");

			for(;;)
			{
				System.out.println("---------능력치---------");
				System.out.println("HP : "+Chp+"  mp : "+Cmp);
				System.out.println("공격력 : "+ Catk + "    방어력  : " + Cdef + "\n스피드 : "+Cspd+ "    잔여 포인트 : " + point2+"\n----------------------");
				
				System.out.print("1.공격력 \n2.방어력\n3.스피드 \n입력: ");
				choice = scan.nextInt();
				if((choice+2) == 3) 
				{
					for(;;)
					{
						System.out.println("---------능력치---------");
						System.out.println("HP : "+Chp+"  mp : "+Cmp);
						System.out.println("공격력 : "+ Catk + "    방어력  : " + Cdef + "\n스피드 : "+Cspd+ "    잔여 포인트 : " + point2+"\n----------------------");
						System.out.println("공격력은 적에게 더욱 높은피해를 줄 수 있습니다.\n공격력을 몇 증가시키겠습니까?");
						System.out.println("입력: ");
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
						System.out.println("---------능력치---------");
						System.out.println("HP : "+Chp+"  mp : "+Cmp);
						System.out.println("공격력 : "+ Catk + "    방어력  : " + Cdef + "\n스피드 : "+Cspd+ "    잔여 포인트 : " + point2+"\n----------------------");
						System.out.println("방어력은 적에게 받는 피해를 줍니다.\n방어력을 몇 증가시키겠습니까?");
						System.out.println("입력: ");
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
						System.out.println("---------능력치---------");
						System.out.println("HP : "+Chp+"  mp : "+Cmp);
						System.out.println("공격력 : "+ Catk + "    방어력  : " + Cdef + "\n스피드 : "+Cspd+ "    잔여 포인트 : " + point2+"\n----------------------");
						System.out.println("스피드는 선제공격권과 적중률 및 회피에 연관이 있습니다.\n스피드를 몇 증가시키겠습니까?");
						System.out.println("입력: ");
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
					
					System.out.println("입력이 바르지 않습니다.");
					
				}
				
				if(point2 == 0)
				{
					break;
				}
			}
			System.out.println("모든 스텟의 설정이 끝났습니다. \n그럼 모험가님  즐거운 게임 되시길 바랍니다. ");

			
			for(;;)
			{
				System.out.println("┌────────────────────────────────────┐");
				System.out.println("│ 닉네임 : "+name+"                       │");
//				System.out.println("│ 레벨 : "+Clv+"                         │");
			}
		}
	}

}
