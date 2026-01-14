import java.util.*;
// package Hashing;

public class CharHash {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="abcdabef";
        
        int[] hash=new int[26];
        //storing
        for(int i=0;i<s.length();i++){
            int asci_coded=(int)s.charAt(i)-97;
            hash[asci_coded]+=1;
        }

        //query
        int q=sc.nextInt();
        while(q-- !=0){
            int n=(int)sc.next().charAt(0)-97;//take the character, type convert to ascival, subtract 97 for indexing
            
            System.out.println(hash[n]);
        }


    }
}
