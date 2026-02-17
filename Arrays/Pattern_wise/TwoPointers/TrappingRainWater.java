import java.util.*;
public class TrappingRainWater {
    static int trap(int[] height) {
           //lmax points to height of max left and rmax points to height of max right
        int n=height.length;
        int lmax=height[0],twater=0;
        int rmax=height[n-1];
        int[] arr=new int[n];     
        int x=1,max=n-1;
        arr[0]=max;
        //storing max rights in an array
        for(int j=n-2;j>=1;j--){
            if(height[j]>=height[max]){
                max=j;
                arr[x++]=max;
            }
        }
        x--;//point to right max index
        for(int k=1;k<n-1;k++){
            if(k>arr[x]) x--;        //if k crosses the current max right index then change the max right index
            lmax=Math.max(lmax,height[k]);
            rmax=height[arr[x]];
            int water=Math.min(lmax,rmax)-height[k];
            twater+=water;
        }
        return twater;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array elements in a single line");
        String line=sc.nextLine();
        String[] parts=line.split(" ");
        int[] arr=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }
        System.out.println("Vol in units (trapped): "+trap(arr));

    }
}
//core idea: water at index k is :
//water=min(max left height,max right height) - height[k]
//optimized to O(n) but used extra space for storing the right maxes
