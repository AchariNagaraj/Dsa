import java.util.*;
public class CountFreq {
    public static void main(String[] args){
        int[] arr={1,2,2,3,2,4};
        HashMap<Integer,Integer> mp=new HashMap<>();
        //storing
        for(int key: arr){
            mp.put(key,mp.getOrDefault(key,0)+1);
        }
        //printing
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
