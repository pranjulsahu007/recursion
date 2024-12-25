
public class reversenumber {

    public static void main(String[] args) 
    {
        int k =reverse(635);
        System.out.println(k);
    }
   static int sum=0;
    static int reverse(int n)
    {
        int r=0;
if(n==0)
{
    return 0;
}
r=n%10;
sum=sum*10+r;
reverse(n/10);
return sum;
    }
}