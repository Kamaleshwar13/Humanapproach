public class duplicateoccurance 
{
        public static void main(String[] args) {
           int a[]={1,2,2,2,1,1,3};
           int b=2;
           int count=0;
           
               for(int j=0;j<a.length;j++)
               {
                   if(b==a[j])
                   {
                    count++;
                   }
                  
               } 
             int noc=count;
             System.out.println("no of count "+b+" is "+noc);
             if(noc>0){
                System.out.print(noc);
             }
             else
            {
                System.out.println("-1");
             }
           } 
        }
    
    
    
