public class ReverseDigits {
    public static void main(String args[]){
        int num=123;
        int a,x=0;
        for(int i=(int)Math.log10(num)+1;i>0;i--){
            a=num%10;
            num=num/10;
            for(int j=1;j<i;j++){
                a=a*10;
            }
            x=x+a;
        }
        System.out.println(x);
    }
}
