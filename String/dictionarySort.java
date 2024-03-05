package String;

import java.util.Arrays;

public class dictionarySort {

	public static void main(String[] args)
	{
		String[] s= {"hii","pratibha","nice","to","meet","you"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.print(Arrays.toString(s));
    }

}
