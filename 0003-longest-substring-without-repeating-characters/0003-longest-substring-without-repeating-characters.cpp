class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.length()==0)
        return 0;
        map<char,int> m;
        int i=0,j=0,ans=0;
        while(j<s.length())
        {
            m[s[j]]++;
            if(j-i+1==m.size())
            {
                ans=max(j-i+1,ans);
            }
            else if(j-i+1>m.size())
            {
                m[s[i]]--;
                if(m[s[i]]==0)
                m.erase(s[i]);
                i++;
            }
            j++;
        }
        return ans;
    }
};