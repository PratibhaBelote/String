package String;

import java.util.Arrays;

public class methodPractice {

	public static void main(String[] args) 
	{
		String s="pratibha belote";
		String s1="vcx";
		
		String s3=s.trim();
		System.out.println(s3);  // string chya aadhi aani nantr chya space remove hota
		
		String[] a=s.split("a");
		System.out.println(Arrays.toString(a)); // string la aaplyala pahije thithun split krto 
		
		System.out.println(s.isBlank());        //string blank aahe ki nahi sangto,space cnt krt nahi
		
		System.out.println(s.isEmpty());        //string empty aahe mahi sangto,space cnt karto
		
		System.out.println(s.lastIndexOf(s1));
		
		System.out.println(s.indexOf(s1));
		
		System.out.println(s.startsWith(s1)); //main string chi starting aani second string chi starting same aahe ki nahi
		
		System.out.println(s.endsWith(s1));    //main string aani second 
		
		System.out.println(s.contains(s1));   //main string madhe ti string aahe ki nahi
		
		System.out.println(s.compareTo(s1));
		
		System.out.println(s.codePointBefore(1));
		
		System.out.println(s.codePointAt(0));
		

	}

}
