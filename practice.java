import java.util.*;
public class practice {
    public static void main(String args[]){
        int arr[]={4,2,3,5,7,6};
        int j;
        int key;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            for(j=i-1;j>=0 && key<arr[j];j--){// i missed the loop conditions during practice
                
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
