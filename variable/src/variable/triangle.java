package variable;

import java.util.Random;


public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int su[][] = new int[3][3];
		int a =0;
		
		int r;
		Random ran = new Random();
		
		
		r = su[0][1];
		
		for(;true;)
		{
		
			for(int b = 0 ;b<3; b++)
			{
				for(int c =0; c<3;c++)
				{
					su[b][c] = ran.nextInt(9);
					
				}
			}
			
			if(su[0][0] != su[0][1] && su[0][0] != su[0][2] &&
			   su[0][0] != su[1][0] && su[0][0] != su[1][1] &&	su[0][0] != su[1][2] &&
			   su[0][0] != su[2][0] && su[0][0] != su[2][1] &&	su[0][0] != su[2][2] &&
			   
			   su[0][1] != su[0][2] &&
			   su[0][1] != su[1][0] && su[0][1] != su[1][1] &&	su[0][1] != su[1][2] &&
			   su[0][1] != su[2][0] && su[0][1] != su[2][1] &&	su[0][1] != su[2][2] &&

			   su[0][2] != su[1][0] && su[0][2] != su[1][1] &&	su[0][2] != su[1][2] &&
			   su[0][2] != su[2][0] && su[0][2] != su[2][1] &&	su[0][2] != su[2][2] &&
			   
			   su[1][0] != su[1][1] && su[1][0] != su[1][2] &&
			   su[1][0] != su[2][0] && su[1][0] != su[2][1] &&	su[1][0] != su[2][2] && 

			   su[1][1] != su[1][2] &&
		   	   su[1][1] != su[2][0] && su[1][1] != su[2][1] &&	su[1][1] != su[2][2] && 

			   su[1][2] != su[2][0] && su[1][2] != su[2][1] &&	su[1][2] != su[2][2] &&
			   
			   su[2][0] != su[2][1] && su[2][0] != su[2][2] &&
			   
			   su[2][1] != su[2][2])
				
			{
				break;
			}
		}
		
		for(int b = 0 ;b<3; b++)
		{
			for(int c =0; c<3;c++)
			{
				System.out.print(su[b][c]+"  ");
				
					
			
				
			}
			System.out.println();
		}
		
	}
}
