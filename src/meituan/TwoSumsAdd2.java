package meituan;



public class TwoSumsAdd2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head = new ListNode(0);
       ListNode node = head;
        int jin = 0;
        while (l1!=null&&l2!=null){
            node.next = new ListNode((l1.val+l2.val+jin)%10);
            jin = (l1.val+l2.val+jin)/10;
            node = node.next;
            l1 = l1.next;
            l2 = l2.next;

        }
        while (l1!=null){
            node.next = new ListNode((l1.val+jin)%10);
            jin=(l1.val+jin)/10;
            node = node.next;
            l1 = l1.next;
        }
        while(l2!=null){
            node.next = new ListNode((l2.val+jin)%10);
            jin=(l2.val+jin)/10;
            node = node.next;
            l2 = l2.next;
        }
        if(jin!=0){
            node.next = new ListNode(jin);

        }
        return head.next;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode node = head;
        int jin = 0;
        while (l1!=null||l2!=null){
            int x = l1!=null?l1.val:0;
            int y = l2!=null?l2.val:0;
            int sum = x+y+jin;
            node.next = new ListNode(sum%10);
            node = node.next;
            jin = sum/10;
            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;
        }
        if(jin!=0){
            node.next = new ListNode(jin);
        }
        return head.next;

    }
}
