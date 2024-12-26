package v2.stupidstart;
public class prodofdigits {
    public static void main(String[] args) {
       int k = proddigit(561);
       System.out.println(k);
    }  
    static int proddigit(int n)
    { 
       int k = 1;
       if(n==0)
       {
           return 1;
       }
       k=n%10;
       n=n/10;
       return k*proddigit(n);
    } 
   }
   