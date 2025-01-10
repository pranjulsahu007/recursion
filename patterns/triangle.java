package patterns;

public class triangle {
    public static void main(String[] args) {
        pp(0, 5);
    }
    static void pp(int c,int r)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
         System.out.print("*");
         pp(c+1, r); 
        }
        if(c>=r)
        {
         System.out.println();
         pp(0, r-1);
        }
       
    }
}
