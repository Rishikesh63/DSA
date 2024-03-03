
package Stack;
import java.util.*;
public class Bracket {
 public static boolean isValid(String s){
    Stack<Character>stack = new Stack<>();
    for(char c:s.toCharArray()){
   if(c=='(' || c=='[' || c=='{'){
     stack.push(c);
     System.out.println(stack);
   }
   else{
    if(stack.isEmpty()){
        return false;
    }
    char top = stack.pop();
    if((c==')' && top!='(') || (c=='}' && top!='{')
    || (c==']' && top!='[')){
    return false;
    }
   }
    }
    System.out.println(stack);
    return stack.isEmpty();
 }
    public static void main(String args[]){
        String input = "()";
        boolean result = isValid(input);
        System.out.println("Is the string valid? " + result);
    }
    
}