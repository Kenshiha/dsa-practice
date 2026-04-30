package linkedlist;


public class MergeLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = (list1 != null) ? list1 : list2;
        System.out.println( curr.val);
        return dummy.next;
    }

    // TEST IT
    public static void main(String[] args) {
        MergeLinkedList ml = new MergeLinkedList();

        // l1: 1→2→4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // l2: 1→3→4
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = ml.mergeTwoLists(l1, l2);

        System.out.println("");
        // Print: 1→1→2→3→4→4
        ListNode curr = result;
        while(curr != null) {
            System.out.print(curr.val + "→");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
