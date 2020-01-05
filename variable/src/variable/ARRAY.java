package variable;

import java.util.ArrayList;

public class ARRAY {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();   
		 
        list.add(new Integer[]{15});                                      
        list.add(new Integer[]{8,176, null});                                      
 
        for(int i=0; i<list.size(); i++)  {    
            System.out.println(list.get(1)[0]);
            System.out.println(list.get(1)[1]);
            System.out.println(list.get(1)[2]);
        }


//ÃâÃ³: https://show0910.tistory.com/9 [JH's daily life!!]
        
	}
}
