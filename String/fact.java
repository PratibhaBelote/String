package String;

public class fact {
	
	    public static void main(String[] args) {
	    
	    	int n=4;
	    	int k=0;
	    	int factd=1;
	    	int factn=1;
	    	int factk=1;
	    	int ans=0;
	    	k=(n+1)/2;
	    	//System.out.println(k);
	    	int dif=n-k;
	    	for(int i=2;i<=dif;i++)
	    	{
	    		factd=factd*i;
	    	}
	    	//System.out.println(factd);
	    	for(int i=2;i<=n;i++)
	    	{
	    		factn=factn*i;
	    	}
	    	//System.out.println(factn);
	    	for(int i=2;i<=k;i++)
	    	{
	    		factk=factk*i;
	    	}
	    	//System.out.println(factk);
	    	ans=factn/(factk*(factd));
	    	System.out.println(ans);
	    }
	            
	 }



