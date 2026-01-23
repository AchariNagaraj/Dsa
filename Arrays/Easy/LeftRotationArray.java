import java.util.*;
public class LeftRotationArray {
    static int[] LRotate(int[] arr,int k){
        int start =k;
        int[]temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[(i+start)%arr.length];
        }
        return temp;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int k=2;
        System.out.println(Arrays.toString(LRotate(arr,k)));
    }
}
