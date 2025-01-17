public class ArraFact {
    public static void main(String args[]){
        int arr[] = {6,7,2,28};
        
        for(int i=0; i<arr.length;i++){
            int num=arr[i];
            int factorial=1;
            for(int j=1;j<=num; j++){
              factorial = factorial*j;
            }
           
            System.out.println(num + " is " +factorial);

        }
    }
}
