import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;


public class Game {
	public static void main(String[] args) throws InterruptedException, IOException	 {
		
		boolean gameover = false;
		MAPS map = new MAPS();
		Viruse mop = new Viruse();
		User use = new User();
		
		mop.monster();
		use.Use();
		
		int ux = use.locationX;
		int uy = use.locationY;
		
		Runnable flow = new Runnable() {
			
			@Override
			public void run() {
					while(true)
					{
						int rand = mop.rand.nextInt(4);
						int x = mop.locationX;
						int y = mop.locationY;
						if(rand == 0)
						{  // ���� ��ĭ             y--
							y--;
							if(map.MAP[x][y] == "��")
							{
								y++;
							}
							map.MAP[x][y-1] = "  ";
						}else if(rand == 1)
						{ //�Ʒ��� ��ĭ                y++
							y++;
							if(map.MAP[x][y] == "��")
							{
								y--;
							}
							map.MAP[x][y+1] = "  "; 
						}else if(rand == 2)
						{ // �������� ��ĭ         x--
							x--;
							if(map.MAP[x][y] == "��")
							{
								x++;
							}
							map.MAP[x-1][y] = "  ";
						}else if(rand == 3)
						{ // ���������� ��ĭ        x++
							x++;
							if(map.MAP[x][y] == "��")
							{
								x--;
							}
							map.MAP[x+1][y] = "  ";
						}
						map.MAP[x][y] = mop.shape;
						try {
						Thread.sleep(mop.speed);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
			}
		};
		Thread hunt = new Thread(flow);
		hunt.start();
		
		while(!gameover)
		{
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			map.map();

			class key implements KeyListener{

				public void keyPredksssed(KeyEvent e) {
					if( e.getKeyCode() == 37)// ����
					{
						
					}else if( e.getKeyCode() == 38)// ��
					{
						
					}else if( e.getKeyCode() == 39)// ������
					{
						
					}else if( e.getKeyCode() == 40)// �Ʒ�
					{
						
					}
				}

				
				public void keyTyped(KeyEvent e) {}

				public void keyReleased(KeyEvent e) {}
				
			}
			
		}
			
	}

}
