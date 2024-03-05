package String;

import java.util.Arrays;

public class sortByLength {

	public static void main(String[] args) 
	{
		String[] sa= {"hii","welcome","pratibha","in","hefshine"};
		
		for(int i=0;i<sa.length;i++)
		{
			int min=i;
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[min].length()>sa[j].length())
				{
					min=j;
				}
			}
			String temp=sa[i];
			sa[i]=sa[min];
			sa[min]=temp;
		}
		System.out.println(Arrays.toString(sa));

		
		  //Second method
		
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].length()<sa[j].length())
				{
			      String temp=sa[i];
			      sa[i]=sa[j];
			      sa[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(sa));

	}

}

 

