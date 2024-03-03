package Recursion;
import java.util.*;
public class fibonacci {
    public static void fibonaccin(int a,int b,int n){
     if(n==0){
        // System.out.println(n);
        return;
     }
     System.out.println(a);
     fibonaccin(b, a+b, n-1);
    
    }
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number :");
    int n = sc.nextInt();

   fibonaccin(0,1,n);
   sc.close();
    }
}
