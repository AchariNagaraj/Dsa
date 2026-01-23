import java.util.*;
public class CheckArraySortedandRotated {
    static  boolean check(int[] nums) {
        for(int k=0;k<nums.length;k++){
            int start =nums.length-k;
            int [] temp=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                temp[i]=nums[(i+start)%nums.length];
            }
            // System.out.println(Arrays.toString(temp));
            // check if sorted
            int j;
            for(j=0;j<temp.length-1 && temp[j]<temp[j+1];j++);
            if(j==temp.length-1){                       // i had error due to this  , i wrote j==temp.length
                // System.out.println("true");     //for debugging
                return true;
                
            }
            // System.out.println("false"); for debugging
                

        }
        return false;
        
    }
    public static void main(String args[]){
        int[] arr={3,4,5,1,2};
        System.out.println(check(arr));
    }
}
