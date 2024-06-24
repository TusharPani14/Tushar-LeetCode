class Solution {
    public int minBitFlips(int start, int goal) {
        int fliped=start^goal;
        int c=0;
        while(fliped>0){
            c+=(fliped&1);
            fliped=fliped>>1;
        }
        return c;
    }
}