package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	public static void main(String[] args) throws IOException {
		 int sign = 0; // ��ȣ�� � ����ִ���
		 String ept = "123+25487-321+-3247*8765";
		 String[] sNum;
		 int j=0;
		
		 for(int data = 0; data < ept.length();data++) {// ept���Էµ� ��ȣ���� ������ ���ϴ� �ݺ���
			if(ept.charAt(data) == '+' || ept.charAt(data) == '-' || ept.charAt(data) == '*' ||ept.charAt(data) == '/'||ept.charAt(data) == '%') { 
				if(ept.charAt(data+1) == '+' || ept.charAt(data+1) == '-') {
					
				}else sign++;
			}else if(ept.charAt(data) == '=' ) {
				 break;
			 }
		}
		 
		sNum = new String[sign+1]; //��ȣ����+1 = ���ڰ� �� �迭 �� ����
		//sNum =
		for(int i=0; i<sNum.length;i++) { // i�� num.length���� ���������� num.length�� 4��� 0 1 2 3 ���� �� 4�� �ݺ�
			for(; j<ept.length(); j++) { //ept.charAt(i)�� ��ȣ�� ������������ ���� ����ִ´�.
				if(ept.charAt(i) == '+' || ept.charAt(i) == '-' || ept.charAt(i) == '*' ||ept.charAt(i) == '/'||ept.charAt(i) == '%') {
					if(ept.charAt(i+1)=='+' || ept.charAt(i+1)=='-') j++;
					break;
				}else sNum[i] = ept.substring(j); //sNum[i]��° ���� ���ڸ� ����־��
			}
		}
		
		System.out.println(sNum[0]);
	}
}
