import java.util.*;

public class q36 {
    public static ListNode middleNode(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(15);
        ListNode node4 = new ListNode(20);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode newHead = node1;

        //while(newHead != null){
        //   System.out.println(newHead.value);
        //    newHead = newHead.next;
        // }

        ListNode answer = middleNode(newHead);
        System.out.println(answer.value);



    }

}
