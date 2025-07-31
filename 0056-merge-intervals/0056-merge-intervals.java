class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for (int i = 0; i < intervals.length; i++) {
            if (i>0 && intervals[i][0] <= ans.get(ans.size()-1).get(1)) {
                System.out.println(i);
                ans.get(ans.size()-1).set(0,Math.min(intervals[i][0], ans.get(ans.size()-1).get(0)));
                ans.get(ans.size()-1).set(1,Math.max(intervals[i][1], ans.get(ans.size()-1).get(1)));
            } else {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
        }
        int[][] ansArr = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            ansArr[i][0] = ans.get(i).get(0);
            ansArr[i][1] = ans.get(i).get(1);
        }
        return ansArr;
    }
}