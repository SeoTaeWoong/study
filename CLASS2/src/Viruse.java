import java.util.Random;

public class Viruse extends Unit{
	

	Random rand = new Random();
	MAPS map = new MAPS();
	int speed = 500;
	int locationX = rand.nextInt(17)+1;
	int locationY = rand.nextInt(17)+1;
	
	public void monster() {
		shape = "б╩";
		boolean taf = false;
		
		while(!taf) {
			if(map.MAP[locationX][locationY] != "бр" )
			{
				taf = true;
			}			
			locationX = rand.nextInt(17)+1;
			locationY = rand.nextInt(17)+1;
		}
		
		map.MAP[locationX][locationY] = shape;
	}
}
