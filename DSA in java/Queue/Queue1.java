package Queue;

public class Queue1 {
   static class Node{
        int data;
        Node next;
        Node(int data){
       this.data=data;
       next=null;
        }
    }
    static class Queue {
  static Node head =null;
  static Node tail = null;
   
    public static boolean isEmpty(){
        return head==null && tail==null;
    }
     
    public static void add(int data){
      Node newNode = new Node(data);
      if(tail==null){
       tail=head=newNode;
       return;
      }
      tail.next=newNode;
      tail=newNode;
      
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty Queue");
            return -1;
        }
      int front = head.data;
      if(head==tail){
        tail=null;
      }
      head=head.next;
      return front;
    
       
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty stack");
            return -1;
        }
        return head.data;
    }
    }
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(3);
        q.add(14);
        q.add(5);
        q.add(8);
        System.out.println(q.remove());
        q.add(9);

        // System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}





// public class Queue1 {
    
//     static class Queue {
//     static int arr[];
//     static int size;
//     static int rear=-1;
//     static int front=-1;
//     Queue(int n){
//     arr  = new int[n];
//     this.size = n;
//     }
//     public static boolean isEmpty(){
//         return rear==-1 && front==-1;
//     }
//       public static boolean isFull(){
//         return (rear+1)%size==front;
//       }
//     public static void add(int data){
//         if (isFull()){
//             System.out.println("Queue is full");
//             return;
//         }
//         if(front==-1){
//             front=0;
//         }
//         rear=(rear+1)%size;
//         arr[rear]=data;
//     }
//     public static int remove(){
//         if(isEmpty()){
//             System.out.println("empty Queue");
//             return -1;
//         }
//         int result=arr[front];
//         if(rear==front){
//             rear=front=-1;
//         }
//         else{
//             front=(front+1)%size;
//         }
    
//         return result;

//     }
//     public static int peek(){
//         if(isEmpty()){
//             System.out.println("empty stack");
//             return -1;
//         }
//         return arr[front];
//     }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(3);
//         q.add(14);
//         q.add(5);
//         q.add(8);
//         System.out.println(q.remove());
//         q.add(9);
        
//         // System.out.println(q.peek());
//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }
