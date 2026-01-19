import java.util.*;
public class ReverseDigits {
    static int reverse(int x){
        int a=x;
        int b;
        x=0;
        if(a==0 || a>Integer.MAX_VALUE || a<Integer.MIN_VALUE)
            return 0;
        while(a!=0){
            b=a%10;
            a/=10;
            x=x*10+b;
        }
        return x;
    }
    public static void main(String args[]){
        int x=123;
        System.out.println(reverse(x));
      
     }
}

