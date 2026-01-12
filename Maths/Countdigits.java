import java.util.*;
public class Countdigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=12345;
        int a=n;
        int count=0;
        while(a!=0){
            a=a/10;
            count++;
        }
        System.out.println(count);
    }
}