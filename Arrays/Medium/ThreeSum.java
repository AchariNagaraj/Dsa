import java.util.*;
// package Arrays.Medium;

public class ThreeSum {
    static List<List<Integer>> removeDuplicate(List<List<Integer>> matrix){
        Set<List<Integer>> seen=new LinkedHashSet<>();
        List<List<Integer>> result=new ArrayList<>();

        for(List<Integer> x: matrix){
            List<Integer> normalized=new ArrayList<>(x);// copy the row
            Collections.sort(normalized);
            if(seen.add(normalized)){
                result.add(x);
            }

        }
        return result;
    }

    static List<List<Integer>> threeSum(int [] nums){
        List<List<Integer>> matrix=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[i]+nums[j]+nums[k])==0){
                        matrix.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                    }
                }
            }
        }

        return removeDuplicate(matrix);
    }

    public static void main(String args[]){
        int [] nums=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        List<List<Integer>> matrix = new ArrayList<>(threeSum(nums));
        for(List<Integer> x: matrix){
            System.out.println(x);
        }

    }
}
