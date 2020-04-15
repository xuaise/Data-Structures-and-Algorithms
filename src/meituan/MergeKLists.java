package meituan;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists,0, lists.length-1);
    }
    public ListNode merge(ListNode[] lists,int left,int right){
        if(left == right){return lists[left];}
        int mid = (left+right)/2;
        ListNode leftNode = merge(lists, left, mid);
        ListNode rightNode = merge(lists,mid+1,right);
        return mergeTwoLists(leftNode, rightNode);
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                node.next = l1;
                l1 = l1.next;
            }
            else{
                node.next = l2;
                l2 = l2.next;
            }
            node= node.next;
        }
        node.next = l1!=null?l1:l2;
        return head.next;
    }
}
