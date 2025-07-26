class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int t=0,r=matrix[0].length-1,b=matrix.length-1,l=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                ans.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                ans.add(matrix[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    ans.add(matrix[b][i]);
                }
            }
            b--;
            if(l<=r){
                for(int i=b;i>=t;i--){
                    ans.add(matrix[i][l]);
                }
            }
            l++;
        }
        return ans;
    }
}