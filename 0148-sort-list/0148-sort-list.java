/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    public ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode m=findMiddle(head);
        ListNode first=head;
        ListNode second=m.next;
        m.next=null;
        first=mergeSort(first);
        second=mergeSort(second);
        return merge(first,second);
    }
    public ListNode merge(ListNode first, ListNode second){
        ListNode dummy=new ListNode(-1);
        ListNode newList=dummy;
        while(first!=null && second!=null){
            if(first.val <= second.val){
                newList.next=first;
                newList=first;
                first=first.next;
            }else{
                newList.next=second;
                newList=second;
                second=second.next;
            }
        }
        if(first!=null){
            newList.next=first;
        }else{
            newList.next=second;
        }
        return dummy.next;
    }
    public ListNode findMiddle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}