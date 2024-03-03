 package Recursion;
import java.util.*;
class Printxpown {

    public static int printxtopown(int x,int n) {
    if (n==0){
        return 1;
    }
    // if(x==0){
    //     return 0;
    // }
    // int x_ = printxtopown(x, n-1);
    // int xn=x*x_;
    // return xn;
    if(n%2==0){
        return printxtopown(x, n/2)*printxtopown(x, n/2);
    }
    else{
        return x*printxtopown(x, n/2)*printxtopown(x, n/2);
    }
        
    }
 public static void main(String args[]){
//  int output = printxtopown(2, 1);
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int n = sc.nextInt();
int output = printxtopown(x, n);
 System.out.println(output);
 sc.close();
 }
     
}