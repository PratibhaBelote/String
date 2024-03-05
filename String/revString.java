package String;

public class revString {

	public static void main(String[] args) {
		
		String a="you all are very very good student";
		String[] s=a.split(" ");
		int start=0;
	  int end=s.length-1;
		while(start < end)
		{
			String temp=s[start];
			s[start]=s[end];
			s[end]=temp;
		}
		System.out.print(s);
	    String s2="";
	    for(int i=s.length-1;i>=0;i--)
		{
			s2=s2+s[i]+" ";
		}
		System.out.println(s2);
		  
		
		//case2//
//		
//		for(int i=0;i<s.length;i++)
//		{
//			String temp=s[i];
//		    String revstr="";
//		for(int j=temp.length()-1;j>=0;j--)
//		{
//			revstr=revstr+temp.charAt(j);
//		}
//		s[i]=revstr;
//		}
//		String mainStr="";
//		for(int i=0;i<s.length;i++)
//		{
//			mainStr=mainStr+s[i]+" ";
//		}
//		System.out.println(mainStr);

	}

}
