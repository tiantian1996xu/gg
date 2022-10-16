import java.util.*;

public class q40 {
    public static ListNode merge(ListNode one, ListNode two){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(one!=null && two!=null){
            if(one.value<= two.value){
                cur.next = one;
                one = one.next;
            }else{
                cur.next = two;
                two = two.next;
            }
            cur = cur.next;
        }
        if(one!=null){
            cur.next = one;
        }else{
            cur.next = two;
        }

        return dummy.next;
    }


    public static void main(String[] args){
        ListNode node11= new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);

        node11.next = node12;
        node12.next= node13;
        node13.next=node14;

        ListNode node21= new ListNode(1);
        ListNode node22 = new ListNode(2);
        ListNode node23 = new ListNode(3);
        ListNode node24 = new ListNode(4);

        ListNode answer = merge(node11, node21);



        while(node21 != null){
            System.out.println(node21.value);
            node21 = node21.next;

        }

        while(answer != null){
            System.out.println(answer.value);
            answer = answer.next;

        }


    }
}
