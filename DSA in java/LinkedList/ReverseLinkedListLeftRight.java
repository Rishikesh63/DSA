package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedListLeftRight {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preLeft = dummy;

        // Move to the node at position left-1
        for (int i = 1; i < left; i++) {
            preLeft = preLeft.next;
        }

        // Reverse the nodes between left and right
        ListNode current = preLeft.next;
        ListNode prev = null;
        ListNode next = null;

        for (int i = left; i <= right; i++) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Connect the reversed portion back to the original linked list
        preLeft.next.next = current;
        preLeft.next = prev;

        return dummy.next;
    }
    public static void main(String[] args) {
        ReverseLinkedListLeftRight rllr = new ReverseLinkedListLeftRight();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;

        ListNode result = rllr.reverseBetween(head, 2, 4);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

