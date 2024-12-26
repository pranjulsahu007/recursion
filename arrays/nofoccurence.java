package arrays;

public class nofoccurence
{
 public static void main(String[] args) 
 {
     int[] arr = {1, 2, 3, 5, 16, 8,7,7};
     System.out.println(search(arr, 0, 7,0));
    
 }
    static boolean t=false;
 static int search(int[] arr, int index, int key,int count) 
 {
 if(index==arr.length)
 {
     return count;
 }
 if(arr[index]==key)
    {
        count++;
    }
    return search(arr, index+1, key,count);
}
}
