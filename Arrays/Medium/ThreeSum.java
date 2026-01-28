import java.util.*;
// package Arrays.Medium;

public class ThreeSum {
    static List<List<Integer>> threeSum(int [] nums){
        Arrays.sort(nums);
        List<List<Integer>> matrix = new ArrayList<>();
        int i;
        for(i=0;i<nums.length-2;i++){
            int k=i+1,j=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(k<j){
                if(nums[k]+nums[j]==-nums[i]){
                    matrix.add(new ArrayList<>(List.of(nums[i],nums[k],nums[j])));
                    k++;
                    j--;
                    while(k>j && nums[k]==nums[k-1]) k++;
                    while(j<k && nums[j]==nums[j+1]) j--;
                }
                else if(nums[k]+nums[j]<-nums[i]){
                    k++;
                    while(k>j && nums[k]==nums[k-1]) k++;
                }
                else{
                    j--;
                    while(j<k && nums[j]==nums[j+1]) j--;
                }
            }
            
        }
        return matrix;
    }

    public static void main(String args[]){
        int [] nums=new int[6];
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        List<List<Integer>> matrix=new ArrayList<>(threeSum(nums));
        for(List<Integer> row: matrix){
            System.out.println(row);
        }
        

    }
}
