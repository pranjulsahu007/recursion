
public class oneton
{
    public static void main(String args[])
    {
    fun(5);
    }
    static void fun(int n)
    {
        if(n==1)            
        {
            return;
        }
     
        fun(n-1);
        System.out.println(n);
     
    }
}
