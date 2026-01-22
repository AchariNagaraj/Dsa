public class CheckArraySorted {
    static boolean Check(int [] arr){
        int i=0;
        while(i<arr.length-1 && arr[i]<arr[i+1] )
            i++;
        return i==arr.length-1;
    }

    public static void main(String args[]){
        int [] arr={1,2,3,4,2};
        System.out.println(Check(arr));
    }
}
