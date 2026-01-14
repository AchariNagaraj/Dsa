import java.util.*;
// package BasicRecursion;

public class PrintNto1 {
    static void PrintNto1(int n){
        if(n<1)
            return;
        System.out.println(n);
        PrintNto1(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintNto1(n);
    }
    
}
