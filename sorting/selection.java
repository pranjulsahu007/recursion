//learning objective
//see code of finding smallest num L22
//exchange that posn with min posn


package sorting;

import java.util.Arrays;

public class selection {
 public static void main(String[] args) {
     int[] uray={5, 3, 8, 4, 2}; // Initialize the array with elements
        sort(uray,uray.length-1, 0,0);
        System.out.println(Arrays.toString(uray));
 }   
 static void sort(int arr[],int r ,int c,int minIndex)
 {
if(r==0)
{
    return;
}
   if(c<r)
   {
    
    if(arr[c]<=arr[minIndex])
    {
        minIndex=c;
    }
    sort(arr, r, c+1,minIndex);
   }
   else
   {
    int temp = arr[minIndex];
    arr[minIndex]=arr[r-1];
    arr[r-1]=temp;
    sort(arr, r-1, 0,0);
   }
 }
}
