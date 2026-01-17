import java.util.*;
public class FindingHighestAndLowestFrequency {
    public static void main(String args[]){
        int arr[]={10,5,15,10,10,5};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int x: arr){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int MaxEl=0;
        int MinEl=0;
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            max=Math.max(max,entry.getValue());
            min=Math.min(min,entry.getValue());
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue()==max)
                MaxEl=entry.getKey();
            if(entry.getValue()==min)
                MinEl=entry.getKey();

        }
        System.out.println("Max: "+MaxEl);
        System.out.println("Min: "+MinEl);
        
    }
}
