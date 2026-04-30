package linkedlist;

import java.util.LinkedList;

class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

public class FastSlow {

    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1,new ListNode(2, new ListNode(3,new ListNode(2,new ListNode(1)))));
        ListNode middle = middleNode(head);
        System.out.println("Middle node value: " + middle.val);
    }

}
