public class squarenumpattern 
{
    public static void main(String[] args) {
        int n=5;
        int b=n*2-1;
        int s=0;
        int e=b-1;
        int i,j;
        int [][]a=new int[10][10];
        while(n!=0)
        {
            for(i=s;i<=e;i++)
            {
                for(j=s;j<=e;j++)
                {
                    if(i==s||i==e||j==s||j==e)
                    {
                        a[i][j]=n;
                    }
                }
            }
            s++;
            e--;
            n--;
        }
        for(i=0;i<b;i++)
        {
            for(j=0;j<b;j++)
            {
               System.out.print(a[i][j]);  
            }
          System.out.println();  
        }
    
}

}