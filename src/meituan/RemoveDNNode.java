package meituan;

public class RemoveDNNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hNode = new ListNode(0);
        head = hNode.next;
        ListNode fNode = hNode;
        ListNode tNode = hNode;
        for(int i = 0;i<=n;i++){
            fNode = fNode.next;
        }
        while (fNode!= null){
            fNode = fNode.next;
            tNode = tNode.next;
        }
        tNode.next = tNode.next.next;
        return head;
    }
}
