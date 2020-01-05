
public class User extends Unit{
	
	MAPS map = new MAPS();
			
	
	int locationX = 10;
	int locationY = 10;
	
	
	public void Use()
	{
		shape = "¨Ï";
		map.MAP[locationX][locationY] = shape;
	}

}
