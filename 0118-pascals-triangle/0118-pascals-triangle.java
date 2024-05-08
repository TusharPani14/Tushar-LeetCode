class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int ans = 1;
            row.add(1);
            for (int j = 1; j < i; j++) {
                ans = ans * (i - j) / j;
                row.add(ans);
            }
            res.add(row);
        }
        return res;
    }
}