public class linkedListNodeMiddleNode {
    public static ListNode linkedListNodeMiddleNode(ListNode head){
    if(head == null){
        return null;
    }
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next!= null && fast.next.next!= null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(20);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode newHead = node1;


        ListNode answer = linkedListNodeMiddleNode(newHead);

        System.out.println(answer.value);

    }
}
