//return based merge sort
// has a diadvantage of more space
// time complexity: O(nlogn)
// but space complexity : O(nlogn)
import java.util.*;
public class MergeSort {
    static int[] merge(int [] left, int [] right){
        int [] mer=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j])
                mer[k++]=left[i++];
            else
                mer[k++]=right[j++];
        }
        if(i>=left.length)
            while(j<right.length)
                mer[k++]=right[j++];
        if(j>=right.length)
            while(i<left.length)
                mer[k++]=left[i++];

        return mer;
        
    }
    static int[] mergesort(int [] arr,int l, int r){
        
        
        int mid=(l+r)/2;
        if(l==r)
            return new int[]{arr[mid]};//i think there is a flaw here, now attempted to correct


        int left[]=mergesort(arr, l ,mid);
        int right[]=mergesort(arr, mid+1,r);
        return merge(left,right);
        
    }

    public static void main(String args[]){
        int[] arr={4,3,2,5,6,7,7,9,8,10,-1};
        System.out.println(Arrays.toString(mergesort(arr,0,arr.length-1)));
    }
}
