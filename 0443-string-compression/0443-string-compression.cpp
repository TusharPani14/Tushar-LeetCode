class Solution {
public:
    int compress(vector<char>& chars) {
        int count=1;
        vector<char> charResult;
        for(int i=0;i<chars.size();i++){
            if(i + 1 < chars.size() && chars[i+1]==chars[i]){
                count++;
            }else{
                charResult.push_back(chars[i]);
                if (count > 1) {
                    string countStr = to_string(count);
                    for (char c : countStr) {
                        charResult.push_back(c);
                    }
                }
                count=1;
            }
        }
        for(int i=0;i<charResult.size();i++){
            chars[i]=charResult[i];
        }
        return charResult.size();
    }
};