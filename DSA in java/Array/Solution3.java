package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void reversearr(int arr[]){
     
        int start=0;
         int end =arr.length-1;
         while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
         }
    }
    public static void main(String args[]){
        // int arr[]={1,2,3,4,5,6,9,8,7};
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int subarraynm=sc.nextInt();
        int subarraySz = 0;
        if(size%subarraynm==0){
              subarraySz=size/subarraynm;
        }
        else{
            subarraySz=(size/subarraynm)+1;
        }
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       Arrays.sort(arr);
       reversearr(arr);
        int startIdx=0;
      
        while (startIdx<arr.length) {
            int endIdx=Math.min(startIdx+subarraySz,arr.length);
            int subarray[]= Arrays.copyOfRange(arr, startIdx, endIdx);
            System.out.println("Subarray:"+Arrays.toString(subarray));
            startIdx+=subarraySz;

        }
        int maxSum=arr[0]+arr[1];
        System.out.println("maxSum:"+maxSum);
    }
}
