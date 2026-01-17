import java.util.*;
// package SortingTechniques;

public class BubbleSort {
    public static void main(String args[]){
        int nums[]={4,2,7,5,6};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j+1<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    int c=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=c;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
