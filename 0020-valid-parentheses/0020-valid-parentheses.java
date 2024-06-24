class Solution {
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')' && !st.empty() && st.peek()=='('){
                st.pop();
            }
            else if(ch=='}' && !st.empty() && st.peek()=='{'){
                st.pop();
            }
            else if(ch==']' && !st.empty() && st.peek()=='['){
                st.pop();
            }
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}