public class SecondLAndSecondSElem {
    public static void main(String args[]){
        int [] arr={4,3,5,2};
        int max=arr[0],min=arr[0],smax=arr[0],smin=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax)
                smax=arr[i];
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            if(arr[i]<smin)
                smin=arr[i];
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            
        }
        if(max==min)
            System.out.println(-1);
        else
        {
            System.out.println("Second largest"+smax);
            System.out.println("Second smallest"+smin);
        }
    }
}
