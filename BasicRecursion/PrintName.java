
// package BasicRecursion;
import java.util.*;
public class PrintName {

    static void RecPrint(String name, int n){
        if(n==0)
            return;
        System.out.println(name);
        RecPrint(name,--n);
        
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name="Bulbasaur";
        int len=sc.nextInt();
        System.out.println("output");
        RecPrint(name,len);

    }
}
