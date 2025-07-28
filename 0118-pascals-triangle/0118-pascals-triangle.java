class Solution {
    public ArrayList<Integer> generateRow(int n){
        ArrayList<Integer> row=new ArrayList<>();
        int elem=1;
        row.add(elem);
        for(int i=1;i<n;i++){
            elem=elem*(n-i);
            elem=elem/i;
            row.add(elem);
        }
        return row;
    }
    public List<List<Integer>> generate(int numRows) {
        //n-1Cr-1
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}