import java.util.*;
public class FrequencyOfMaxFrequecyElement {

    
    public static int maxFrequency(int[] nums, int k) {
        int op=k;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int diff=Math.abs(nums[i]-nums[j]);
                if(diff<=op){
                    while(nums[i]!=nums[j]){
                        op--;
                        if(nums[i]<nums[j])
                            nums[i]++;
                        else
                            nums[j]++;
                    }
                }
            }
        }

        //frequency counting
        int hash[]=new int[14];
        for(int x: nums){
            hash[x]+=1;
        }
        
        
        //max frequency 
        int max=1;
        for(int x: hash){
            max=Math.max(max,x);
        }
        return max;
    }
    

    public static void main(String[] args) {
        int nums[]={1,4,8,13};
        System.out.println(maxFrequency(nums, 5));
    }
}
