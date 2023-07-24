public class countpairnum 
{
	    public static void main(String[] args) {
	        int a[]={1,5,7,-1};
	        int x=6;
	        int c=0;
	        for(int i=0;i<a.length;i++)
	        {
	            for(int j=i+1;j<a.length;j++)
	            {
	                 if(a[i]+a[j]==x)
	                 c=c+1;
	            }
	           
	        }
	        System.out.println(c);
	    }
}

