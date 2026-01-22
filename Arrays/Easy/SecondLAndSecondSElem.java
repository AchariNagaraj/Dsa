public class SecondLAndSecondSElem {
    public static void main(String args[]){
        int [] arr={10,1,2};
        int max=arr[0],min=arr[0],smax=arr[1],smin=arr[1];
        for(int i=1;i<arr.length;i++){
            //max
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax)
                smax=arr[i];


            //min
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]<smin)
                smin=arr[i];
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
