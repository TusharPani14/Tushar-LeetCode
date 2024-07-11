class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0;
        int maxS=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxS=lsum;
        int j=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[j];
            j--;
            maxS=Math.max(maxS,lsum+rsum);
        }
        return maxS;
    }
}