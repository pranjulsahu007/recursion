//learning objective
//simple hi hai logic pta hona chahiye bs
//swap krte krte largest rightmost side chala jayega 
//yeh sb krke phir size chota krdo sample array ka

package sorting;
import java.util.*;
public class bulbula {
    public static void main(String[] args) {
        int[] uray={5, 3, 8, 4, 2}; // Initialize the array with elements
        sort(uray,uray.length-1, 0);
        System.out.println(Arrays.toString(uray));
    }
    static void sort(int[] arr, int r,int c)
    {
        if(r==0)
        {
          return;
        }
       if(c<r)
       {
        if(arr[c]>arr[c+1])
        {
            int temp = arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
           
        }
        sort(arr,r,c+1);
    }
        else 
        {
            sort(arr, r-1, 0);
        }

       }
    }
