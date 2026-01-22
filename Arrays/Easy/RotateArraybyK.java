import java.util.Arrays;

public class RotateArraybyK {
    static int[] rotate(int [] arr,int k){
        int start = arr.length-k;
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i<k){
                temp[i]=arr[i+start];
            }
            else{
                temp[i]=arr[i-start+1];
            }
        }
        return temp;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int k=2;
        System.out.println(Arrays.toString(rotate(arr,k)));
    }
}
