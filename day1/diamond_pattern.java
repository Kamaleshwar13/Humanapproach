public class diamond_pattern
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n*2-1;i++)
        {
            if(i<=n)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(".");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int k=1;k<=i-n;k++)
                {
                    System.out.print(".");
                }
                for(int j=1;j<=n*2-i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }
    
}
