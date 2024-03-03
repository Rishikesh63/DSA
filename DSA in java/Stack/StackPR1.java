package Stack;
import java.util.*;
public class StackPR1 {
     public static void pushAtBottom(int data,Stack<Integer>s){
    if(s.isEmpty()){
        s.push(data);
        return;
    }
    int top = s.pop();
    System.out.println(top);
    pushAtBottom(data, s);
    System.out.println(top);
    s.push(top);
     }
     public static void main(String[] args) {
        Stack<Integer>s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(5, s);
        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }

     }
}
