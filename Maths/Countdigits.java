import java.util.*;
public class Countdigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int a=n;
        // int count=0;
        // while(a!=0){
        //     a=a/10;
        //     count++;
        // }
        // System.out.println(count);

        int digits=(int)Math.log10(Math.abs(n))+1;//logarithmnic approach
        System.out.println(digits);
    }
}