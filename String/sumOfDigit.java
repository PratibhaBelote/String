package String;

import java.time.LocalDate;
import java.util.ArrayList;

public class sumOfDigit {

	public static void main(String[] args) 
	
	{
		String s="123";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum+s.charAt(i)-48;
			}
		}
		System.out.println(sum);	
    }
	
	

}
