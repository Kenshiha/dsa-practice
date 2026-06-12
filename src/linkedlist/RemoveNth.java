package linkedlist;

public class RemoveNth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;



        for(int i = 0; i <= n; i++) {  //0->1->2->3->4->5->6
            fast = fast.next;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    // TEST IT
    public static void main(String[] args) {
        RemoveNth rn = new RemoveNth();

        // Build: 1→2→3→4→5, n=2 (remove 4)
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5,new ListNode(6,new ListNode(7)))))));

        ListNode result = rn.removeNthFromEnd(head, 3);

        // Print result: 1→2→3→5
        ListNode curr = result;
        while(curr != null) {
            System.out.print(curr.val + "→");
            curr = curr.next;
        }
        // Output: 1→2→3→5→
    }
}
