package String;

public class PrintMaxMin {

	public static void main(String[] args) 
	{
		String s="hi welcome to hefshine";
		int min=0;
		int max=0;
		String[] sa=s.split(" ");
		for(int i=0;i<sa.length;i++)
		{
			if(sa[i].length()<sa[min].length())
			{
				min=i;
			}
			if(sa[i].length()>sa[max].length())
			{
				max=i;
			}
				
		}
		System.out.println("small character"+" "  +sa[min]);
		System.out.println("large character"+" " +sa[max]);
		
		
		
		//second method
		
		
		// String s1="hi welcome to hefshine";
		//String[] sa1=s1.split(" ");
		//for(int i=0;i<sa1.length;i++)
		//{
		//	for(int j=i+1;j<sa1.length;j++)
			//{
		//		if(sa1[i].length()>sa1[j].length())
		//		{
		//			String temp=sa1[i];
		//			sa1[i]=sa1[j];
		//			sa1[j]=temp;
		//		}
				
		//	}
		//}
		//System.out.println("small character"+" "  +sa1[0]);
		//System.out.println("large character"+" " +sa1); 
		

	}

}
