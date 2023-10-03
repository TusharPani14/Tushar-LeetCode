class Solution {
public:
    string convertToTitle(int columnNumber) {
        string answer = "";

        while(columnNumber > 0){
            columnNumber -= 1;
            answer = char(columnNumber % 26 + 'A') + answer;
            columnNumber /= 26;
        }
        
        return answer;
    }
};