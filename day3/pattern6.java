public class pattern6 
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            
                if(i%2==0)
                {
                    for(int j=2;j<=i*2;j+=2)
                    {
                        System.out.print(j);
                    }
                    System.out.println();

                }
                else
                {
                    for(int k=1;k<=i*2;k+=2)
                    {
                        System.out.print(k);
                    }
                    System.out.println();
                }
            
        }
        
    }
    
}
