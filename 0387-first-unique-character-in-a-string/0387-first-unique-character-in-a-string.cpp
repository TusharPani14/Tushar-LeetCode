class Solution {
public:
    int firstUniqChar(string s) {
        queue<char> q;
        unordered_map<char, int> m;
        
        for (int i = 0; i < s.length(); i++) {
            if (m.find(s[i]) == m.end()) {
                q.push(s[i]);
                m[s[i]] = i; 
            } else {
                m[s[i]] = -1;
                while (!q.empty() && m[q.front()] == -1) {
                    q.pop();
                }
            }
        }
        
        while (!q.empty() && m[q.front()] == -1) {
            q.pop();
        }
        
        if (!q.empty()) {
            return m[q.front()];
        } else {
            return -1;
        }
    }
};
