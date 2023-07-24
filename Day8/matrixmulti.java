public class matrixmulti
{
    public static void main(String args[])
    {    
		int a[][]={{1,2,1},{2,6,2},{3,0,3}};    
		int b[][]={{1,4,3},{1,2,2},{2,5,3}};    
		int c[][]=new int[5][5];     
		for(int i=0;i<a.length;i++)
		{    
		    for(int j=0;j<a[0].length;j++)
		    {    
		        c[i][j]=0;      
		        for(int k=0;k<a.length;k++)      
		        {      
		           c[i][j]+=a[i][k]*b[k][j];      
		        } 
		        System.out.print(c[i][j]+"\t"); 
		    }
		    System.out.println();   
		}    
	}
}
