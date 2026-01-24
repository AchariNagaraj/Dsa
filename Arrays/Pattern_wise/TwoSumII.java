import java.util.*;
// package Arrays.Pattern-wise;

public class TwoSumII {
    static int[] twoSum(int[] nums,int target){
        int i=0, j=nums.length-1;
        while(nums[i]+nums[j]!=target){
            if(nums[i]+nums[j]>target)
                j--;
            else
                i++;
        }
        return new int[]{i+1,j+1};
    }
    public static void main(String args[]){
        int[] arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
}
