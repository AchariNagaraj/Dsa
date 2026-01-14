import java.util.*;
// package BasicRecursion;

public class SumofFirstNnatural {
    static int SumN(int n,int count,int sum){
        if(count>n)
            return sum;
        sum=sum+count;
        return(SumN(n,++count,sum));
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1,sum=0;
        System.out.println(SumN(n,count,sum));
    }

}
