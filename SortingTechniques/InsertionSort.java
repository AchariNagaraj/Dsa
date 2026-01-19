import java.util.*;
public class InsertionSort {
    public static void main(String args[]){
        int nums[]={4,2,5,7,6};
        int j;
        for(int i=1;i<nums.length;i++){
            int key=nums[i];
            for(j=i-1;j>=0 && (key<nums[j]);j--){
                    nums[j+1]=nums[j];//right shift
            }
            nums[j+1]=key;
        }
        System.out.println(Arrays.toString(nums));
    }
}


