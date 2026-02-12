
import java.util.*;
public class ContainerWithMostWater {
    static int maxArea(int[] height) {
        int left=0,right=height.length-1,area=0;
        if(height.length==1)
            return 0;
        while(left<right){
            int minH=Math.min(height[left],height[right]);
            area=Math.max(area,minH*(right-left));
            
            //movement of smallest pointer also skip if it is less than minH
            while(left<right && height[left]<=minH) left++;
            while(left<right && height[right]<=minH) right--;
        }
        return area;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String[] parts=line.split(" ");
        int[] height=new int[parts.length];
        for(int i=0;i<parts.length;i++){
            height[i]=Integer.parseInt(parts[i]);
        } 

        System.out.println(maxArea(height));
        
    }
}


