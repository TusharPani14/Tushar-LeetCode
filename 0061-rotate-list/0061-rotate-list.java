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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode last=null;
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            if(temp.next==null){
                last=temp;
            }
            temp=temp.next;
        }
        int nor=k%c;
        temp=head;
        for(int i=1;i<c-nor;i++){
            temp=temp.next;
        }
        ListNode res=temp.next;
        temp.next=null;
        last.next=first;
        return res;
    }
}