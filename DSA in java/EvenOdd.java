import java.util.*;

public class EvenOdd {
    public static void sum(int num){
        if (num==1) {
            // System.out.println(num);
            return;
            
        }
      else if(num%2!=0){
        num=num*3+1;
        System.out.println(num);
        
      }
      else{
        num=num/2;
        System.out.println(num);
        
      }
    sum(num);
    }
    public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
      int num = scanner.nextInt();
      sum(num);
     scanner.close();
    }
    
}


 //   Scanner scanner=new Scanner(System.in);
    //   int num = scanner.nextInt();
    //  scanner.close();
    //   while (num!=1) {
    //      if(num%2==0){
    //         System.out.println(num/2);
    //         break;
    //      }
    //      else{
    //         System.out.println(num*3);
    //         break;
    //      }
    //   }



