import java.util.*;
public class TrappingRainWater {
    static int trap(int[] height) {
        int n=height.length;
        int lmax=0,twater=0;
        for(int k=1;k<n-1;k++){
            int rmax=n-1;
            for(int i=lmax;i<=k;i++){
                if(height[i]>=height[lmax]) 
                    lmax=i;
            }
            for(int j=n-1;j>=k;j--){
                if(height[j]>=height[rmax])
                    rmax=j;
            }
            int water=Math.min(height[lmax],height[rmax])-height[k];
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

//but the time complexity of the code is O(n2) , so we need to optimize
