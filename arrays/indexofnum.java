package arrays;
import java.util.ArrayList;
public class  indexofnum
{
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) 
 {
     int[] arr = {1, 2, 7, 5, 16, 8, 7,   7};
     search(arr, 0, 7);
     System.out.println(list);
    
 }
 
 static void search(int[] arr, int index, int key) 
 {
 if(index==arr.length)
 {
     return ;
 }
 if(arr[index]==key)
    {
        list.add(index);
    }
    
    {
        search(arr, index+1, key);
    }
}
}
