class Solution {
public:
    bool winnerOfGame(string colors) {
        int alice=0,bob=0;
        for(int i=1;i<colors.length();i++){
            char current=colors[i];
            char prev=colors[i-1];
            char next=colors[i+1];
            if(current=='A' && prev=='A' && next=='A'){
                alice++;
            }
            else if(current=='B' && prev=='B' && next=='B'){
                bob++;
            }
        }
        return alice>bob;
    }
};