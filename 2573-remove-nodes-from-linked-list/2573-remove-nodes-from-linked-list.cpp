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
    ListNode* removeNodes(ListNode* head) {
        vector<int> arr;
        ListNode *p=head,*q=nullptr;
        while(p){
            arr.push_back(p->val); 
            p=p->next;
        }
        stack<pair<int,int>> st; 
        for(int i=arr.size()-1;i>=0;i--){
            if(st.empty()){
                st.push({arr[i],1}); 
            }else{
                if(st.top().first>arr[i]){ 
                    st.push({st.top().first,-1});
                }else{
                    st.push({arr[i],1}); 
                }
            }
        }
        p=head;
        while(st.size()){
            if(st.top().second==1){
                p->val = st.top().first;
                q=p; 
                p=p->next;
            }
            st.pop();
        }
        q->next = nullptr;
        return head;
    }
};