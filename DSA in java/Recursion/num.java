package Recursion;
import java.util.*;
public class num {
    
    public static void printnum(int n,int sum){
        if (n==0){
            System.out.println(sum);
            return;
        } 
        sum=sum+n;
        printnum(n-1, sum);
        // System.out.println(n);
        // printnum(n-1);
    }
    public static void main(String args[]){
        // printnum(1);
        Scanner sc=new Scanner(System.in);
        int n=  sc.nextInt();
        sc.close();
        printnum(n, 0);
        // System.out.println(sum);
        // printnum(n);
    }
    
}
