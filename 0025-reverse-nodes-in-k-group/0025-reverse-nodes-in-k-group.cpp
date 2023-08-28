/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverse(ListNode* &head,int k,int n){
        ListNode *prev=NULL;
        ListNode *curr=head;
        ListNode *temp=head;
        int c=1;
        while(curr!=NULL && c<=k && n>0){
            temp=curr->next;
            curr->next=prev;
            prev=curr;
            curr=temp;
            c++;
        }
        n--;
        if(n==0){
            head->next=temp;
            return prev;
        }
        else{
            head->next=reverse(temp,k,n);
        }
        return prev;
    }
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode *temp=head;
        int count=0;
        while(temp!=NULL){
            count++;
            temp=temp->next;
        }
        ListNode *res=reverse(head,k,count/k);
        return res;
    }
};