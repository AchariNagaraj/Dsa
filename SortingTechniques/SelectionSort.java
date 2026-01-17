import java.util.*;
// package SortingTechniques;

public class SelectionSort {
    public static void main(String args[]){
        int[] nums={4,2,5,6,7};
        for(int i=0;i<nums.length-1;i++){
            int min=i+1;
            for(int j=min;j<nums.length;j++){
                if(nums[min]>nums[j])  {
                    min=j;
                }    
            }
            if(nums[i]>nums[min]){
                int c=nums[i];
                nums[i]=nums[min];
                nums[min]=c;
            }
          
            
        }
        System.out.println(Arrays.toString(nums));
    }
}
