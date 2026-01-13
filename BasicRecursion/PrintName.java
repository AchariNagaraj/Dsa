
// package BasicRecursion;
import java.util.*;
public class PrintName {

    static void RecPrint(String name, int n){
        if(n==0)
            return;
        RecPrint(name,--n);
        System.out.println(name);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name="Bulbasaur";
        int len=sc.nextInt();
        System.out.println("output");
        RecPrint(name,len);

    }
}
