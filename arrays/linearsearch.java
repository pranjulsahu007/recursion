package arrays;

public class linearsearch 
{
 public static void main(String[] args) 
 {
     int[] arr = {1, 2, 3, 5, 16, 8};
     System.out.println(search(arr, 0, 7));
    
 }
    static boolean t=false;
 static boolean search(int[] arr, int index, int key) 
 {
 if(index==arr.length)
 {
     return false;
 }
 return arr[index]==key || search(arr, index+1, key);
}
}
