package variable;

public class test2 {

	public static void main(String[] args) {

		/////////////////////////
		int choice = 1; // 선택지(1~4)
		/////////////////////////
		System.out.println("나는 홀로 여행을 하고있다.");

		if (choice == 1) {
			System.out.println("나의 나이는 15살이다. \n지금은 부모님과 대판 싸운후 가출중");

			//////////////////////////
			choice = 1; // 선택지(1~4)
			/////////////////////////

			if (choice == 1) {
				System.out.println("날이 갈수록 배는고파지고 점점 의지가 약해진다. \n 하.. 이제 집에 들어가야하나..");

				/////////////////////////
				choice = 3; // 선택지 (1~3)
				/////////////////////////
				
				if (choice == 1) {

					System.out.println("의미없이 휴대폰만 들여다보게 된다...");

				} else if (choice == 2) {
					System.out.println("마지막남은 돈으로 공중전화에 동전을 넣어본다.  \n \'딸깍\'");

				} else if (choice == 3) {
					System.out.println("\'꼬르륵\' \n하지만 이제와서 집에돌아가기엔 너무 멀리와버렸다.");
				}
			} else if (choice == 2) {
				System.out.println("집에서 자꾸만 연락이온다.. ");

			} else if (choice == 3) {
				System.out.println("모아둔 돈이 다 떨어져간다... 최근에는 근처 신사에 받쳐지는 공물을 훔쳐먹는중이다.");

			} else if (choice == 4) {
				System.out.println("어제 밤에 구멍가게에서 음식을 훔치다가 경찰서에 잡혀버렸다.");

			}

		} else if (choice == 2) {
			System.out.println("나의 나이는 21살이다. \n군대에 가기전 견문을 넓히고자 여행을 하고있다.");

		} else if (choice == 3) {
			System.out.println("나의 나이는 59살.. \n얼마 걷지도 않았는데 숨차는걸 보면 벌써 노년기에 접어든 느낌이다.");

		} else if (choice == 4) {
			System.out.println("원해서 여행을 떠난건 아니었다. \n테러사건에 휘말린 나는 무너져 내리는 건물 잔해에 깔려버렸다.");

		}
	}
}
