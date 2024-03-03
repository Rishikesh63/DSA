package Stack;
import java.util.Scanner;
import java.util.ArrayList;
public class StackAl {
    static class Stack {
    ArrayList<Integer>list1 = new ArrayList<>();
    public void push(int data){
     list1.add(data);
    }
    public boolean isEmpty(){
        return list1.size()==0;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list1.remove(list1.size()-1);
        return top;
       
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        int top = list1.get(list1.size()-1);
        return top;
    }
    
    
public static void main(String args[]){
Stack stack = new Stack();
Scanner sc = new Scanner(System.in);
System.out.println("enter non-numberic element to stop addition:");

while (sc.hasNextInt()) {
int data = sc.nextInt();
    stack.push(data);
}
   System.out.println(stack.peek());
   System.out.println(stack.pop());
}   
}
}