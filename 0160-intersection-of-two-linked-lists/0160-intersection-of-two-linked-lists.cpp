/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *h1=headA;
        ListNode *h2=headB;
        int c=0;
        while(h1!=NULL)
        {
            h2=headB;
            while(h2!=NULL)
            {
                if(h1==h2)
                {
                    c=1;
                    break;
                }
                h2=h2->next;
            }
            if(c==1)
                break;
            h1=h1->next;
        }
        if(c==1)
            return h1;
        else 
            return {};
    }
};