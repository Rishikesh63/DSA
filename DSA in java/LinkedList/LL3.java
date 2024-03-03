package LinkedList;
import java.util.*;
public class LL3 {
    Node head;
     class Node{
        int data;
        Node next;
        Node(int data){
         this.data =data;
         this.next=null;
        }

     }
     public void insertdata(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            Node curNode = new Node(data);
            curNode=head;
            while (curNode.next!=null) {
                curNode=curNode.next;
            }
            curNode.next=newNode;
        }

     }
     public void deletedata(){
      Node curNode=head;
      Node prevNode =null;
      while (curNode!=null) {
        if(curNode.data>25){
            if(prevNode!=null){
                prevNode.next=curNode.next;
            }
            else{
                head=curNode.next;
            }
        }
        else{
            prevNode=curNode;
        }
        curNode=curNode.next;
      }
     }
     public void reversemyList() {
        if(head==null || head.next==null){
            return;
        }
        Node prev = head;
        Node currNode = head.next;
        
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head = prev;
    }
    
     public void printLL(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        Node curNode = head;
        while (curNode!=null) {
            System.out.print(curNode.data+"->");
            curNode = curNode.next;
    
        }
        System.out.println("null");
     }

    public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   LL3 list = new LL3();
   
   System.out.println("enter number non numberic value to stop:");
   while (sc.hasNextInt()) {
    int element = sc.nextInt();
    list.insertdata(element);
   }
   list.deletedata();
   list.printLL();
   list.reversemyList();
   list.printLL();
   sc.close();
    }
}
