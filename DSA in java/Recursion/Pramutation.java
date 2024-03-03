package Recursion;
import java.util.*;
public class Pramutation {
  public static void printpramutation(String str,String perm,int count){
    if(str.length()==0){
     System.out.println(perm);
        return;
    }
   for(int i=0;i<str.length();i++){
    char ch= str.charAt(i);
    String substr = str.substring(i+1)+str.substring(0,i);
    // System.out.println(ch+substr);
    // char subch = substr.charAt(i) ;
    // char subchn = substr.charAt(i+1);
    // // String substr2 = subch2+subch1;
    // String substrn = subchn+subch;
    printpramutation(substr,perm+ch,count);

    
   }
  }
    public static void main(String args[]){
        // String str = "abc";
        Scanner sc = new Scanner(System.in);
        // int count =0;
        System.out.print("enter a string:");
        // System.out.println("total number of permutation of string:");
        // System.out.println(count);
        String str = sc.nextLine();
        sc.close();
        printpramutation(str,"",0);
    }
}
