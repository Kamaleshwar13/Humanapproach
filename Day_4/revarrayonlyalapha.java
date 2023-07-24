public class revarrayonlyalapha 
{
    public static void main(String[] args) 
    {
        char ch[]={'a','b','&','c','#','d','$','e','@','w'};
        int i=0;
        int j=ch.length-1;
        while(i<j)
        {
             if (!Character.isAlphabetic(ch[i]))
             {
                   i++;
             }
             else if (!Character.isAlphabetic(ch[j]))
             {
                   j--;
             }
             else
             {
               char c=ch[i];
               ch[i]=ch[j];
               ch[j]=c;
               i++;
               j--;
            }
        }
        for(i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
    }
}
    

