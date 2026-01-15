import java.util.*;
// package Hashing;

public class CharHash {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="abcdabef";
        
        int[] hash=new int[26];
        //storing using the asci values
        for(int i=0;i<s.length();i++){                //enhanced for each loop can be written: for(int ch: s.toCharArray()){
            //                                                                                     hash[ch]+=1;// char to int implicit conversion by java
            //                                                                                 }
            int asci_coded=(int)s.charAt(i)-97;
            hash[asci_coded]+=1;
        }

        //query
        int q=sc.nextInt();//no of elements to be queried
        while(q-- !=0){
            //int n=(int)sc.next().charAt(0)-97;//take the character, type convert to ascival, subtract 97 for indexing 
            //above method is not needed because java will automatically type convert in case of orithmetics or indexing
            int n=sc.next().charAt(0)-97;
            //fetching
            System.out.println(hash[n]);
        }


    }
}
