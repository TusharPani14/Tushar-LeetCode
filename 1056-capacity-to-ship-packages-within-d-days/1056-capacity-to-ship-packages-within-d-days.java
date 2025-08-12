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
        System.out.print(cap+" ");
        for(int i=0;i<weights.length;i++){
            capSum+=weights[i];
            if(capSum>cap){
                System.out.print(capSum+",");
                capSum=weights[i];
                dayC++;
                if(dayC>days){
                    System.out.println();
                    return false;
                }
            }
        }
        System.out.println(dayC);
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
        int low=maxElem(weights),high=Arrays.stream(weights).sum();
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