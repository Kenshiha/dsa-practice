package linkedlist;

import java.sql.SQLOutput;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        // Find middle
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse 2nd half
        ListNode prev = null, curr = slow;

        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare 1st half (head) vs reversed 2nd half (prev)
        ListNode front = head;
        while(prev != null) {
            if(front.val != prev.val) return false;
            front = front.next;
            prev = prev.next;
        }
        return true;
    }

    // TEST IT
    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        // Test 1: Palindrome 1→2→2→1
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2,new ListNode(1)))));
        System.out.println("Test1: " + p.isPalindrome(head1));  // true

        // Test 2: Not palindrome 1→2
        ListNode head2 = new ListNode(1, new ListNode(2,new ListNode(2)));
        System.out.println("Test2: " + p.isPalindrome(head2));  // false
    }
}
