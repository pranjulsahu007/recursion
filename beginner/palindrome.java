package beginner;
public class palindrome
{
    public static void main(String[] args) {
        
    }
    static int rev2(int n)
    {
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    
    
    static int sum =0;
    private static int helper(int n,int digits)
    {
        if(n==0)
        {
            return 0;
        }
        int rem =0;
    rem=n%10;
    return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);

    }
}