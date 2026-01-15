import java.util.*;
public class UsingHashMap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,2,3,12,2};
        HashMap<Integer,Integer> mp=new HashMap<>();
        //storing
        for(int x: arr){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }

        //quering
        int q=sc.nextInt();//query elements
        while(q-- !=0){
            int n=sc.nextInt();
            //fetching
            System.out.println(mp.getOrDefault(n,0));
        }
    }
}
