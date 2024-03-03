package Recursion;
import java.util.*;
public class Factorial {
    public static void factorialn(int n,int fact){
   if (n==0){ 
    System.out.println(fact);
    return;
   }
   fact=fact*n;
   factorialn(n-1, fact);
    }

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    factorialn(n, 1);
    sc.close();
    }
     
}
