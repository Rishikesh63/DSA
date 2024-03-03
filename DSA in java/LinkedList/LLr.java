package LinkedList;

public class LLr {
    Node head;
      int size;
    LLr(){
        this.size=0;
    }
 class Node{
    String data;
    Node next;
    Node(String data){
        this.data=data;
        this.next = null;

    }
 }
 public void addFirst(String data){
    Node newNode = new Node(data);
    if(head==null){
     head = newNode;
     size++;
     return;
    }
    size++;
    newNode.next=head;
    head=newNode;
 }

 public void addLast(String data){
   Node newNode = new Node(data);
    if(head==null){
     head = newNode;
     size++;
     return;
    }
    Node curNode = head;
    while (curNode.next!=null) {
        curNode = curNode.next;

    }
    size++;
    curNode.next=newNode;

 }
 public void deleteFirst(){
    if(head==null){
System.out.println("empty list");
   return;
    }
    size--;
    head = head.next;

 }
 public void deleteLast(){
    if(head==null){
System.out.println("empty list");
   return;
    }
    size--;
    if(head.next==null){
        head=null;
        return;
    }
    Node SecondLast = head;
    Node lastNode = head.next;
    while (lastNode.next!=null) {
        lastNode = lastNode.next;
        SecondLast = SecondLast.next;
    }
    SecondLast.next=null;
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
    System.out.println("Null");
 }
 public int getSize(){
    return size;
 }

public static void main(String args[]) {
LLr list = new LLr();
list.addFirst("a");
list.addFirst("is");
list.addFirst("this");
list.addLast("list");
list.deleteLast();
list.printLL();  
System.out.println(list.getSize());
}
}
