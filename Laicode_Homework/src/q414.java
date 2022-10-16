
import java.util.*;
public class q414 {
    public static ListNode removeElement(ListNode head, int val){
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode p = helper;
        while(p.next != null){
            if(p.next.value == val){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return helper.next;
    }
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(20);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode newHead = node1;


        ListNode answer = removeElement(newHead, 5);

        while(answer != null){
            System.out.println(answer.value);
            answer = answer.next;
        }



    }
}
