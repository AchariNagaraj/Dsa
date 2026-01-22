
// package Arrays.Easy;
import java.util.*;

public class SecondLargest {
    public static void main(String args[]){
        int [] arr={1,1,1,1};
        int i=arr[0],k=arr[1];
        for(int j=1;j<arr.length;j++){
            if(arr[j]>k){//precheck for the case when the largest is at first index 0
                k=arr[j];
            }
            if(arr[j]>i){
                k=i;
                i=arr[j];
            }
        }
        if(i==k)
            System.out.println(-1);
        else
        System.out.println(k);
    }
}
