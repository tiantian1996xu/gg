public class q39 {
    public static ListNode insert(ListNode head, int value){
        ListNode newNode = new ListNode(value);
        ListNode curr = head;
        if(head == null){
            return newNode;
        }
        if(value < curr.value ){
            newNode.next = head;
            return newNode;
        }
        while(curr.next!=null){
            if(curr.value<value && value<= curr.next.value){
                newNode.next = curr.next;
                curr.next = newNode;
                return head;
            }
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
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

        ListNode answerHead = insert(newHead, 9);

        while(answerHead != null){
           System.out.println(answerHead.value);
           answerHead = answerHead.next;
        }
    }
}
