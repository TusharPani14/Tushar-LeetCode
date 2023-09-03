class Solution {
public:
    int romanToInt(string s) {
        int i, r=0;
        for(i =0;i<s.length();i++)
        {
            if(s[i]=='I' && s[i+1]=='V'){
                r+=4;
                i++;
                continue;
            }
            else if(s[i]=='I' && s[i+1]=='X'){
                r+=9;
                i++;
                continue;
            }
            else if(s[i]=='X' && s[i+1]=='L'){
                r+=40;
                i++;
                continue;
            }
            else if(s[i]=='X' && s[i+1]=='C'){
                r+=90;
                i++;
                continue;
            }
            else if(s[i]=='C' && s[i+1]=='D'){
                r+=400;
                i++;
                continue;
            }   
            else if(s[i]=='C' && s[i+1]=='M'){
                r+=900;
                i++;
                continue;
            }
            else if(s[i] == 'I')
            r+= 1;
            else if(s[i] =='V')
            r+= 5;
            else if(s[i] =='X')
            r+= 10;
            else if(s[i] =='L')
            r+= 50;
            else if(s[i] =='C')
            r+= 100;
            else if (s[i] =='D')
            r+= 500;
            else if(s[i] =='M')
            r+= 1000;
            cout<<r<<" ";
        }
        if(s.length() >i)
        {
            if(s[i] == 'I')
            r+= 1;
            else if(s[i] =='V')
            r+= 5;
            else if(s[i] =='X')
            r+= 10;
            else if(s[i] =='L')
            r+= 50;
            else if(s[i] =='C')
            r+= 100;
            else if (s[i] =='D')
            r+= 500;
            else if (s[i] =='M')
            r+= 1000;
        }
        return r;
    }
};