import java.io.IOException;

public class EX {
	
	public static void main(String[] args) throws IOException
	{
		String str1 = new String("test");
		String str2 = new String("test");
		String str4 = "test";
		String[][] str3 = new String[5][10];
		String[][] str5[][];
		
		
		if(str1.equals("test"));
		{
			System.out.println("출력");
		}
		
	}
}


// 문자열을 입력하면 자동으로 엔터를 눌러주는 소스
// 쓰레드?
// 키입력을 받았다는걸 어떻게 구분할건지
// 자바는 문자열이라는 객체를 만들어두고 번지수를 지정한다. 이때 내용을 바꾸면 해당 번지수의 내용물이 바뀌는 것이아니라 새로운 문자열의 객체를 만들고 번지수를 바꾼다.
//  '==' 객체의 번지수를 비교한다 /  '.equals' 객체의 내용물을 비교한다