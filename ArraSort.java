// import java.util.*;
// public class ArraSort {
    
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//       int a[] = new int[5];
//       for(int i=0; i<a.length; i++){
//         a[i]=sc.nextInt();
//       }
//       Arrays.sort(a);
//       System.out.println(a[i]);
//     }
// }
public class ArraSort {
    public static void main(String args[]){
        int arr[] ={1,2,5,6,4};
        System.out.print("Original Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        System.out.print("\nSorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
