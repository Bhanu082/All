public class ArraPerfect {
    public static void main(String args[]){
        int arr[] = {6,7,2,28};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=1;j<arr[i];j++){
              if(arr[i]%j == 0){
              sum = sum+j;
              }
            }
            if(arr[i]==sum){
                System.out.println(arr[i]);
            }
        }
    }
}
