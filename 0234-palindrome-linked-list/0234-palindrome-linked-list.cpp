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
    bool isPalindrome(ListNode* head) {
        string s;
        while(head!=NULL){
            s.push_back(head->val);
            head=head->next;
        }
        for(int i=0;i<s.length();i++){
            if(s.at(i)!=s.at(s.length()-i-1)){
                return 0;
            }
        }
        return 1;
    }
};