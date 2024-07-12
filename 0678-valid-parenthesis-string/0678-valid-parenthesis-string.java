class Solution {
    public boolean checkValidString(String s) {
        // return solve(s, 0, 0);
        int min=0,max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                max++;
                min++;
            }
            else if(ch==')'){
                if(min>0){
                    min--;
                }
                max--;
            }
            else{
                if(min>0){
                    min--;
                }
                max++;
            }
            if(max<0){
                return false;
            }
        }
        if(min==0){
            return true;
        }
        return false;
    }

    // public boolean solve(String s, int i, int c) {
    //     if (c < 0) {
    //         return false;
    //     }
    //     if (i == s.length()) {
    //         return (c == 0);
    //     }
    //     if (s.charAt(i) == '(') {
    //         return solve(s, i + 1, c + 1);
    //     } else if (s.charAt(i) == ')') {
    //         return solve(s, i + 1, c - 1);
    //     } else {
    //         if (solve(s, i + 1, c + 1) || solve(s, i + 1, c - 1) || solve(s, i + 1, c)) {
    //             return true;
    //         } else
    //             return false;
    //     }
    // }
}