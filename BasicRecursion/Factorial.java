import java.util.*;
public class Factorial {
    static int  Factorial(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }

    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(Factorial(n));

    }
}
