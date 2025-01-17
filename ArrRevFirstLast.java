public class ArrRevFirstLast {
    public static void main(String args[]){
        int arr[]={236,213,450};
        for(int i=0;i<arr.length;i++){
         int temp,rev=0;
         while(arr[i]!=0){
            temp=arr[i]%10;
            rev=temp+rev*10;
            arr[i]=arr[i]/10;
            
         } 
        arr[i]=rev;
        }

        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
}
