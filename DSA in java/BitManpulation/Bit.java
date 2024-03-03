package BitManpulation;
import java.util.Scanner;
// public class Bit {
//       public static void clear(int n,int pos){
//           int bitMask = 1<<pos;
//           int newNum = ~(bitMask) & n;
//           System.out.println(newNum);
//       }
//       public static void set(int n,int pos){
//           int bitMask = 1<<pos;
//           int newNum = (bitMask) | n;
//           System.out.println(newNum);
//       }
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter number:");
//     int n = sc.nextInt();
//     System.out.println("enter positin:");
//     int pos = sc.nextInt();
    
//     // clear(n, pos);
//     set(n, pos);
//     clear(n, pos);
   



//     //  int n= 5;
//     //  int pos=0;
//     //  int bitMask =1<<pos;
//     //  int newNum = ~(bitMask) & n;
//     //  System.out.println(newNum);
//     //  if((bitMask & n)==0){
//     //     System.out.println("bit is zero");

//     //  }
//     //  else{
//     //     System.out.println("bit is 1");
//     //  }
//     }
// }


// import java.util.Scanner;
public class Bit{

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter a string binary number A:");
        String a = sc.nextLine();
        System.out.println("enter a string binary number B:");

        String b = sc.nextLine();

        String sum = addBinary(a, b);

        System.out.println("Binary sum: " + sum);
        sc.close();
    }
}
