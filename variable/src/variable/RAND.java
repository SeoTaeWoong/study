package variable;

import java.util.Random;

public class RAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		int su[][] = new int[3][3];
		int save = 0;
		Random ran = new Random();
		
		for(int a = 0; a<su.length; a++)
		{
			for(int b=0; b<su.length;b++)
			{
				su[a][b] = 9;
			}
		}
		
		for(int a = 0; a<su.length ; a++)
		{
			for(int b = 0; b<su.length ; b++)
			{
				for(;;)
				{
					int count = 0;
					save=ran.nextInt(10);
					
					for(int x = 0; x<su.length; x++)
					{
						for(int y = 0; y<su.length; y++)
						{
							if(save == su[x][y])
							{
								count++;
							}
						}
						
					}

					if(count == 0)
					{
						
						break;
					}
					
					
				}
				su[a][b] = save;
				System.out.print(su[a][b]+"  ");
			}	
			
			System.out.println();
			
		}
	}

}
