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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *temp=head;
        ListNode *temp2=head;
        int count=0;
        while(temp!=NULL){
            count++;
            temp=temp->next;
        }
        if(count==1 && n==1){
            return NULL;
        }
        if(count==n){
            return head->next;
        }
        ListNode *prev=head;
        int count2=0;
        while(temp2!=NULL){
            if(count2==(count-n) && temp2->next!=NULL){
                prev->next=prev->next->next;
                break;
            }else if(count2==(count-n) && temp2->next==NULL){
                prev->next=NULL;
            }else{
                prev=temp2;
            }
            temp2=temp2->next;
            count2++;
        }
        return head;
    }
};