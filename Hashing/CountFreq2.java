import java.util.*;
public class CountFreq2 {
    public static void main(String args[]){
        int arr[]={10,5,10,15,10,6};
        boolean visited[]=new boolean[arr.length];
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            if(visited[i]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println("Freq of "+arr[i]+"is"+count);
            
        }
        if(visited[arr.length-1]==false){
            System.out.println("Freq of "+arr[arr.length-1]+"is 1");
        }
    }
}
//not optimal because 
//T: O(n)