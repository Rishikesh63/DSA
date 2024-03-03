// import java.util.Scanner;

public class sortArray {
    public static boolean sortedArray(int arr[],int idx){
        
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
           return sortedArray(arr, idx+1);

        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int size =sc.nextInt();
        // int idx=sc.nextInt();
        // sc.close();
        // int arr[]=new int[size];
        int arr[]={2,3,4,5};
        int idx=0;
        System.out.println(sortedArray(arr, idx));
        System.out.println("str"+"ing");
        
    }
}
