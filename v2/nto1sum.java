public class nto1sum
{
    public static void main(String args[])
    {
    int k = fun(5);
    System.out.println(k);
    }
    static int fun(int n)
    {
        if(n==0)            
        {
            return 1;
            
        }

        return n+fun(n-1);
       
     
    }
}