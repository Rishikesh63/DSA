package Queue;
import java.util.*;
public class Queue2 {
    public static void main(String[] args) {
    //    Queue<Integer>q= new LinkedList<>();// h.w. diff. betw on implementation of LinkedList and ArrayDeque
       Queue<Integer>q= new ArrayDeque<>();
       
       q.add(1) ;
       q.add(2);
       q.add(3);
       while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
       }
    }
}
