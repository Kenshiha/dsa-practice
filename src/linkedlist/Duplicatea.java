package linkedlist;

public class Duplicatea {

    //Q. 1->1->1->2->3->3
    //ans. 1->2->3

    public static ListNode removeDuplicate(ListNode head){

        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1,new ListNode(1,new ListNode(1, new ListNode(2, new ListNode(3,
                            new ListNode(3))))));

        removeDuplicate(head);
        ListNode temp = head;
        while (temp.next != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print(temp.val);
    }
}
