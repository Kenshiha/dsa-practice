package linkedlist;

public class Reverse {

    public static void reverseList(ListNode head){

        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        System.out.println(prev.val);

        ListNode temp = prev;
        while(temp.next != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println(temp.val);
    }

    public static void main(String[] args){

        ListNode l1 =new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(4))));
        reverseList(l1);
    }
}
