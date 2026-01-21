import java.util.*;
// package Arrays.Easy;

public class FindLargestElement {
    public static void main(String args[]){
        int[] arr={4,2,1,4,6,7,10,-1};
        // Arrays.sort(arr);
        // System.out.println("Max element: "+arr[arr.length-1]); //this is the brute force approach(T: O(nlogn))

        int max=arr[0];
        for(int i=0;i<arr.length;i++)
            if(max<arr[i])
                max=arr[i];
        System.out.println(max);
    }
    
}
