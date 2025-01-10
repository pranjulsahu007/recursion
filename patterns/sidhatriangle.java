package patterns;

public class sidhatriangle {
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
         
         pp(c+1, r); 
         System.out.print("*");
        }
        if(c>=r)
        {
         
         pp(0, r-1);
         System.out.println();
        }
       
    }
}
