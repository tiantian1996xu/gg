public class reverseLinkedlistRecursion {
    public static ListNode reverseLinkedlistRecursion(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseLinkedlistRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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


        ListNode answer = reverseLinkedlistRecursion(newHead);

        while (answer != null) {
            System.out.println(answer.value);
            answer = answer.next;
        }
    }
}
//TC:o(n)
//SP:O(N)