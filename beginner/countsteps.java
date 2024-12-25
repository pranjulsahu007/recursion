public class countsteps 
{
public static void main(String args[]) 
{
    int k = helper(14);
    System.out.println(k);
}
static int helper(int n)
{
    return count(n,0);
}
static int count(int n,int c)
   {
         if(n==0)
         {
              return c;
         }
         if(n%2==0)
         {
             return count(n/2,c+1);
         }
         else
         {
             return count(n-1,c+1);
         }  
         
   }
}