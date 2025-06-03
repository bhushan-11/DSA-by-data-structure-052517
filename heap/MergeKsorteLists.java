package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

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


public class MergeKsorteLists {

    //divide and coquer

    //recursion only beats 5%

     public ListNode mergeKsortedHeap (ListNode[] lists){

         PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

         for(ListNode node : lists) {
             if(node != null) {
                 minHeap.offer(node);
             }
         }

         ListNode dummy = new ListNode(0);
         ListNode output= dummy;


         while (!minHeap.isEmpty()) {
             ListNode curr = minHeap.poll();
             dummy.next = curr;
             curr = curr.next;
             dummy = dummy.next;
             if(curr !=null) {
                 minHeap.offer(curr);
             }

         }

         return output.next;
     }



    public static void main (String args[]) {


    }
}
