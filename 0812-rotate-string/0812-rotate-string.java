class Solution {
    public boolean rotateString(String s, String goal) {
        //start checking for 1st letter of string s in t. 
        //Substring check.
        int l1=s.length();
        int l2=goal.length();
        if(l1!=l2) return false;
        char find=s.charAt(0);
        for(int i=0;i<l2;i++){
            char ch=goal.charAt(i);
            if(ch==find){
                String sub1=goal.substring(0,i);
                String sub2=goal.substring(i,l2);
                String sub3=s.substring(0,l2-i);
                String sub4=s.substring(l2-i,l1);
                if(sub1.equals(sub4) && sub2.equals(sub3)){
                    return true;
                }
            }
        }
        return false;
    }
}