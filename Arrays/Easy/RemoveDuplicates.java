import java.util.*;
public class RemoveDuplicates {
    static int  removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]>nums[i]){
                int c=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=c;
                i++;
            }
            
            // System.out.println(Arrays.toString(nums)); for debugging
        }
        // System.out.println(i); for debugging
        return i+1;
        
    }
    public static void main(String args[]){
        int [] arr={1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }
}
