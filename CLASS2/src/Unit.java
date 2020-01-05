
public class Unit {

	/* 
	 * 바이러스와 유저
	 * 바이러스는 랜덤하게 움직이며 유저와 부딪히면  Game over
	 * 유저는 맵에퍼진 파편을 다 모으면 Game Clear
	 * 
	 * 공통점 동일한 크기를 가진다. 모양을 정의해줄 String 함수가 필요하다
	 * 
	 * 
	 * 
	 * 주의 자식클래스는 부모클래스의 능력을 사용 가능하다
	 * 부모클래스는 자식의 능력을 사용하지 못한다
	 * 
	 * 
	 * 파편을 다 모으거나 게임 오버하거나
	 */
	 String shape = "";
	public static void main(String[] args) {
		int a= 0;
		System.out.println(5-++a);
		System.out.println(a);
	}

}
