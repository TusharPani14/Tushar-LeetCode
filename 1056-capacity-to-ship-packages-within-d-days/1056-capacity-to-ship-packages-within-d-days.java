class Solution {
    public static int maxElem(int[] weights){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
        }
        return max;
    }
    public static boolean possible(int[] weights, int cap, int days){
        int capSum=0,dayC=0;
        for(int i=0;i<weights.length;i++){
            capSum+=weights[i];
            if(capSum>cap){
                capSum=weights[i];
                dayC++;
                if(dayC>days){
                    return false;
                }
            }
        }
        if(dayC>=days){
            return false;
        }
        if(capSum<=cap){
            dayC++;
            if(dayC<=days){
                return true;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=maxElem(weights),high=0;
        for (int weight : weights) {
            high += weight;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(weights,mid,days)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}