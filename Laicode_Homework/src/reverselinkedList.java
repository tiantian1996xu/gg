public class reverselinkedList {
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
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


        ListNode answer = reverse(newHead);

        while (answer != null) {
            System.out.println(answer.value);
            answer = answer.next;
        }
    }
}
//TP:O(N)
//SP:O(1)
