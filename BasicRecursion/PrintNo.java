import java.util.*;
// package BasicRecursion;

public class PrintNo {
    static void Nprint(int n,int c){
        if(c>n)
            return ;
        System.out.println(c);
        Nprint(n,++c);
        
    }

    public static void main(String args[]){
        int count=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Nprint(n,count);

    }
}
