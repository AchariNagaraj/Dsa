import java.util.*;
public class MergeSortInplace {
    static void mergeSort(int[] arr, int l, int r){
        if(l==r)
            return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    static void merge(int[] arr , int l ,int mid , int r){
        int[] temp=new int[r-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }
        while(i<=mid)
            temp[k++]=arr[i++];//copy remaining elements of the left half
        while(j<=r)
            temp[k++]=arr[j++];//copy remaining elements of the right half

        //copy the temp to original array so that is it modifies that part into sorted one
        for(int x=0;x<temp.length;x++){
            arr[x+l]=temp[x];
        }

    }
    public static void main(String args[]){
        int [] arr={4,2,1,5,6,3,7};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
