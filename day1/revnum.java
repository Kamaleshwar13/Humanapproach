public class revnum {

    public static void main(String[] args)
    {
        int n=12345;
        int rev=0;
        System.out.println("original string  :  "+n);
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10; 
        }  
        System.out.println("reverse string : "+rev); 
    }
}
