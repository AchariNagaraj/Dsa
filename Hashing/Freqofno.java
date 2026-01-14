//this is called array hashing. because the max element in the array determines hash array size
import java.util.*;// package Hashing;

public class Freqofno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,1,3,3};
        int[] hash=new int[13];
        //pre-storing
        for(int x:a){
            hash[x]+=1;
        }

        //fetching
        int q=sc.nextInt();//no of elements to be queried
        while(q-- !=0){
            int num=sc.nextInt();//input the query
            System.out.println(hash[num]);
        }
    
                
    }
}//here we need to check the max element in the given array and query  then declare the hash array size
//normally the hash array size is chosen by doing something , ill descover later
