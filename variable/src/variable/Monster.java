package variable;

public class Monster {

	
	int hp;
	int mp;
	int atack;
	int defence;
	int speed;
	
	int mop(int LV)
	{
		if(LV == 1)
		{
			hp = 30;
			mp = 10;
			atack = 5;
			defence = 3;
			speed = 2;
		}else if(LV == 2)
		{
			hp = 35;
			mp = 13;
			atack = 8;
			defence = 1;
			speed = 4;
		}else if(LV == 3)
		{
			hp = 39;
			mp = 16;
			atack = 9;
			defence = 5;
			speed = 4;
		}
		return mop(LV); 
	}
	
	
}
