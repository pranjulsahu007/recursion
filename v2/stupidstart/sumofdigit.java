package v2.stupidstart;
public class sumofdigit {
 public static void main(String[] args) {
    int k = sumdigit(501);
    System.out.println(k);
 }  
 static int sumdigit(int n)
 { 
    int k = 1;
    if(n==0)
    {
        return 0;
    }
    k=n%10;
    n=n/10;
    return k+sumdigit(n);
 } 
}
