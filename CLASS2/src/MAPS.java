public class MAPS {
	

	String[][] MAP = new String[20][20];
	
	public void map(){
				
		for(int locationX = 0 ; locationX <20 ; locationX++)
		{
			for(int locationY = 0; locationY <20; locationY++)
			{
				if(locationX == 0 || locationX == 19)
				{
					MAP[locationX][locationY] = "бр";
				}else if(locationY == 0 || locationY == 19)
				{
					MAP[locationX][locationY] = "бр";
				}else if((locationX == 7 || locationX == 8 || locationX == 9) && locationY == 8 )
				{
					MAP[locationX][locationY] = "бр";					
				}else if(locationX == 7 && locationY == 9 || locationX == 7  && locationY == 10 || locationX == 9  && locationY == 9 )
				{
					MAP[locationX][locationY] = "бр";					
				}else if((locationX == 7 || locationX == 8 || locationX == 9) && locationY == 11 )
				{
					MAP[locationX][locationY] = "бр";					
				}else
				{
					MAP[locationX][locationY] = "  ";
				}
				System.out.print(MAP[locationX][locationY]);
			}
			System.out.println();
			
		}
	
	}
	
	
}
