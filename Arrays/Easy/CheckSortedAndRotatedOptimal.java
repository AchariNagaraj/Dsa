public class CheckSortedAndRotatedOptimal {
    static boolean check(int [] nums){
        int drop=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length])
                drop++;
            if(drop>1)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        int[] arr={3,4,5,1,2};
        System.out.println(check(arr));
    }
}
