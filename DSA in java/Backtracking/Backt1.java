package Backtracking;

public class Backt1 {
    
    public static  void printPermutation(String str,String perm ){
        if(str.length()==0){
            System.out.println(perm);
        }
        for(int i=0;i<str.length();i++){

            char currentChar = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            printPermutation(newstr, perm+currentChar);
        }
    }
    public static void main(String args[]){
        String str ="ABC";

        printPermutation(str, "");

    }
}


// public class Backt1 
// {
//     public static void main(String [] args ) 
//     {
//         int result = 0;
//         Backt1 oc = new Backt1();
//         Object o = oc;

//         if (o == oc)  
//             result = 1;
//         if (o != oc)  
//             result = result + 10;
//         if (o.equals(oc) )  
//             result = result + 100;
//         if (oc.equals(o) )  
//             result = result + 1000;

//         System.out.println("result = " + result);
//     }
// }