import java.util.*;
// package BasicRecursion;

public class SumofFirstNnatural2 {
    static int Sumofn(int n){
        return (n*(n+1)/2);//t: O(1) , s: O(1)
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Sumofn(n));
    }
}
