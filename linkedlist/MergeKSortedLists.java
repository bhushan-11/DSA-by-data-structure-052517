package linkedlist;

import heap.MergeKsorteLists;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode result = null;

        for(ListNode node: lists) {

            result = mergeTwoLists(result, node);

        }

        return result;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) {
            return  l2;
        }
        if(l2==null) {
            return l1;
        }
        if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return  l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String args[]) {

        ListNode l1= new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next=l3;
        MergeKsorteLists mergeKsorteLists = new MergeKsorteLists();





    }
}
