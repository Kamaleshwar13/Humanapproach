public class butterflypattern 
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=n*2-i*2;j++)
            {
                System.out.print(". ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            for(int k=2;k<=i*2-1;k++)
            {
                System.out.print(". ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
