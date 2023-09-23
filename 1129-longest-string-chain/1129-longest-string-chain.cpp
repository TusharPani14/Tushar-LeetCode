class Solution {
public:
    static bool sortFun(string a, string b){
        return a.length()<b.length();
    }
    int longestStrChain(vector<string>& words) {
        sort(words.begin(),words.end(),sortFun);
        unordered_map <string,int>m;
        int max_chain=0;
        for(int i=0;i<words.size();i++){
            m[words[i]]=1;
            for(int j=0;j<words[i].length();j++){
                string prev=words[i].substr(0,j)+words[i].substr(j+1);
                if(m.find(prev)!=m.end()){
                    m[words[i]]=max(m[words[i]],m[prev]+1);
                }
            }
            max_chain=max(max_chain,m[words[i]]);
        }
        return max_chain;
    }
};