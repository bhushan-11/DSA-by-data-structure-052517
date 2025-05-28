package linkedlist;

class ListNode {

    int val;
    ListNode next;
    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next ) {
        this.val = val;
        this.next= next;
    }
}

public class ReverseLinkedList {
    //Given the head of a singly linked list , reverse the list and return the reversed list

    public ListNode reverseList (ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

  //1 save the next node
        ListNode  next = curr.next;

        //2 reverse teh linked list f

        curr.next = prev;

        // move prev forwad
        prev = curr;

        // move curr forward
        curr = next;

        return prev;
    }



    public static void main(String args[]) {

        ListNode l1 = new ListNode(1);
        l1.next= new ListNode(2);
        l1.next.next = new ListNode(3);
        //,new ListNode(3)), new ListNode(4)));

    }
}
