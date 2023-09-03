class Solution {
public:
    int furthestDistanceFromOrigin(string moves) {
        int r=0,l=0,n=0;
        for(int i=0;i<moves.length();i++){
            if(moves.at(i)=='R')
                r++;
            else if(moves.at(i)=='L')
                l++;
            else
                n++;
        }
        if(r>l)
            return (r+n)-l;
        else
            return (l+n)-r;
    }
};