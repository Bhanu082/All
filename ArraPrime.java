public class ArraPrime {
    public static void main(String args[]){
        int arr[]= {6,7,2,28};
        for(int i=0; i<arr.length;i++){
            int count=0;
            for(int j=1; j<=arr[i];j++){
                
                if(arr[i]%j ==0){
                    count++;
                }
            }
        
            if(count==2){
                System.out.println(arr[i]);
            }
        }
    }
}
